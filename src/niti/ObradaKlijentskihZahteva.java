/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niti;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import komunikacija.Odgovor;
import komunikacija.Posiljalac;
import komunikacija.Primalac;
import komunikacija.Zahtev;

/**
 *
 * @author ACER
 */
public class ObradaKlijentskihZahteva extends Thread {
    private Socket socket;
    private Primalac primalac;
    private Posiljalac posiljalac;
    private boolean kraj = false;

    public ObradaKlijentskihZahteva(Socket socket) {
        this.socket=socket;
        posiljalac = new Posiljalac(socket);
        primalac = new Primalac(socket);
    }
    
    

    @Override
    public void run() {
        while(!kraj){
           Zahtev zahtev = (Zahtev) primalac.primi();
           Odgovor odgovor = new Odgovor();
           switch(zahtev.getOperacija()){
             
               
               default:
                   System.out.println("Greska, operacije ne postoji");
           }
           posiljalac.posalji(odgovor);
        }
        
        }
    
    public void zaustavi(){
        kraj=true;
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ObradaKlijentskihZahteva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
