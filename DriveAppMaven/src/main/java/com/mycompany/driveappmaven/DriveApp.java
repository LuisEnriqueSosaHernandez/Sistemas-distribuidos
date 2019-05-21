/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.driveappmaven;

/**
 *
 * @author k_ike
 */
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class DriveApp {

    private static final String APPLICATION_NAME = "Google Drive API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart. If modifying
     * these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = DriveApp.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    public static void main(String... args) throws IOException, GeneralSecurityException {
        int opcion;
        Scanner l = new Scanner(System.in);
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        // Print the names and IDs for up to 10 files.
        /*FileList result = service.files().list()
         .setPageSize(10)
         .setFields("nextPageToken, files(id, name)")
         .execute();
         List<File> files = result.getFiles();
         if (files == null || files.isEmpty()) {
         System.out.println("No files found.");
         } else {
         System.out.println("Files:");
         for (File file : files) {
         System.out.printf("%s (%s)\n", file.getName(), file.getId());
         }
         }*/
        do {
            System.out.println("1.Subir archivo\n2.Descargar archivo\n3.Salir");
            opcion = l.nextInt();
            switch (opcion) {
                case 1:
                    File fileMetadata = new File();
                    fileMetadata.setName("photo.jpg");
                    java.io.File filePath = new java.io.File("filesUpload/photo.jpg");
                    FileContent mediaContent = new FileContent("image/jpeg", filePath);
                    File file = service.files().create(fileMetadata, mediaContent)
                            .setFields("id")
                            .execute();
                    System.out.println("File ID: " + file.getId());
                    break;
                case 2:
                    String fileId = "13VoppTchBgzSp5UXn4e4F1i4ZOuFpii5";
                    File fileImg = service.files().get(fileId).execute();
                    System.out.println(fileImg.getName());
//Aun no lo entiendos como guardar el archivo
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    service.files().get(fileId)
                            .executeMediaAndDownloadTo(outputStream);
                   FileOutputStream file2=new FileOutputStream("filesDownload/photo.jpg");
                   outputStream.writeTo(file2);
                    break;
                default:
                    System.out.println("OpciÃ³n incorrecta");
                    break;
            }
        } while (opcion != 3);
    }

}
