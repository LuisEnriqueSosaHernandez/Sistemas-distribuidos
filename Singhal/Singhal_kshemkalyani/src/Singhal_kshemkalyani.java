/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k_ike
 */
public class Singhal_kshemkalyani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        hilo hilo1 = new hilo("1");
        hilo hilo2 = new hilo("2");
        hilo hilo3 = new hilo("3");
        int arreglotemporal[];
        hilo1.play();
        hilo2.play();
        hilo3.play();
        // arreglotemporal=hilo1.getArreglo();
        hilo1.ActualizaLocal(0);
        hilo1.pause();
        hilo2.ActualizaLocal(1);
        hilo2.pause();
        hilo3.ActualizaLocal(2);
        hilo3.pause();
        arreglotemporal = hilo1.getArreglo();
        hilo2.resume();
        hilo2.ActualizaMensaje(0, arreglotemporal[0]);
        hilo2.ActualizaLocal(1);
        arreglotemporal = hilo3.getArreglo();
        hilo2.ActualizaMensaje(2, arreglotemporal[2]);
        hilo2.ActualizaLocal(1);
        hilo2.pause();
        hilo3.resume();
        hilo3.ActualizaLocal(2);
        arreglotemporal = hilo2.getArreglo();
        hilo3.ActualizaMensaje(0, arreglotemporal[0]);
        hilo3.ActualizaMensaje(1, arreglotemporal[1]);
        hilo3.ActualizaLocal(2);
        hilo3.pause();
        hilo2.resume();
        hilo2.ActualizaLocal(1);
        arreglotemporal = hilo3.getArreglo();
        hilo2.ActualizaMensaje(2, arreglotemporal[2]);
        hilo2.ActualizaLocal(1);
        hilo2.pause();
        hilo1.resume();
        hilo1.ActualizaLocal(0);
        arreglotemporal = hilo2.getArreglo();
        hilo1.ActualizaMensaje(1, arreglotemporal[1]);
        hilo1.ActualizaMensaje(2, arreglotemporal[2]);
        hilo1.stop();
        hilo2.stop();
        hilo3.stop();

    }

}

class hilo implements Runnable {

    private boolean paused = false;
    private boolean stopped = false;
    private String nombre;
    private int arreglo[] = new int[3];

    public hilo(String nombre) {
        this.nombre = nombre;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void play() {
        paused = false;
        stopped = false;
        new Thread(this, nombre).start();
    }

    public synchronized void pause() {
        paused = true;
    }

    public synchronized void resume() {
        paused = false;
        notify();
    }

    public synchronized void stop() {
        stopped = true;

        notify();
    }

    public void ActualizaLocal(int a) {
        arreglo[a]++;
        System.out.println("Actualizando reloj local proceso " + nombre + "\n" + arreglo[0] + " " + arreglo[1] + " " + arreglo[2]);

    }

    public void ActualizaMensaje(int a, int b) {
        arreglo[a] = b;
        System.out.println("Actualizando por mensaje proceso " + nombre + "\n" + arreglo[0] + " " + arreglo[1] + " " + arreglo[2]);

    }

    public void run() {

        while (!stopped) {
            try {
                synchronized (this) {
                    if (paused) {
                        System.out.println("Paused " + nombre);
                        wait();
                        System.out.println("Resumed " + nombre);
                    }
                }
                Thread.sleep(3);
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
    }

}
