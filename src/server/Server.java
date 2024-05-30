/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.util.List;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import niti.ObradaKlijentskihZahteva;

/**
 *
 * @author ACER
 */
public class Server extends Thread{
    private boolean kraj = false;
    private ServerSocket serverSocket;
    private List<ObradaKlijentskihZahteva> klijenti = new ArrayList<>();
    public void pokreniServer(){
        
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(9000);
            while(!kraj){
                Socket s = serverSocket.accept();
                System.out.println("klijent je povezan");
                ObradaKlijentskihZahteva okz = new ObradaKlijentskihZahteva(s);
                klijenti.add(okz);
                okz.start();
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void zaustaviServer(){
        kraj = true;
        try {
            for(ObradaKlijentskihZahteva nit:klijenti){
                nit.zaustavi();
            }
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
