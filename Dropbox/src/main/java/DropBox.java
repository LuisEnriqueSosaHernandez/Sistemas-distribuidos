import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k_ike
 */
public class DropBox {
    private static final String ACCESS_TOKEN = "aK0Z1gEpabAAAAAAAAABVx1VpLOqMkqRibVzyqyB9YitUNpK61PpKuKzzysel8KT";

    public static void main(String args[]) throws DbxException, IOException {
        // Create Dropbox client
         DbxRequestConfig config2 = new DbxRequestConfig("PruebaSistemasDistribuidos");
        DbxClientV2 client = new DbxClientV2(config2, ACCESS_TOKEN);
        int opcion;
        Scanner l=new Scanner(System.in);

        // Get current account info
        FullAccount account = client.users().getCurrentAccount();
        System.out.println("Usuario: "+account.getName().getDisplayName());

        // Get files and folder metadata from Dropbox root directory
        ListFolderResult result = client.files().listFolder("");
        while (true) {
            for (Metadata metadata : result.getEntries()) {
                System.out.println(metadata.getPathLower());
            }

            if (!result.getHasMore()) {
                break;
            }

            result = client.files().listFolderContinue(result.getCursor());
        }
            do{
                 System.out.println("1.Subir archivo\n2.Descargar archivo o actualizar local\n3.Salir");
                opcion=l.nextInt();
        switch(opcion){
            case 1:
                // Upload "test.txt" to Dropbox
        try (InputStream in = new FileInputStream("test.txt")) {
            FileMetadata metadata = client.files().uploadBuilder("/test.txt")
                .uploadAndFinish(in);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Hubo un error al subir el archivo");
        }
                break;
            case 2:
                DbxDownloader<FileMetadata> downloader = client.files().download("/test.txt");
        try {
            FileOutputStream out = new FileOutputStream("test.txt");
            downloader.download(out);
            out.close();
        } catch (DbxException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Hubo un error al descargar el archivo");
        }
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        }while(opcion!=3);
    }
}
