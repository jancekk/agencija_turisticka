/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Hotel implements ApstraktniDomenskiObjekat{
    private int hotelID;
    private String naziv;
    private String adresa;
    private String mail;
    private int kontaktBr;
    private int ocena;

    public Hotel() {
    }

    public Hotel(int hotelID, String naziv, String adresa, String mail, int kontaktBr, int ocena) {
        this.hotelID = hotelID;
        this.naziv = naziv;
        this.adresa = adresa;
        this.mail = mail;
        this.kontaktBr = kontaktBr;
        this.ocena = ocena;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getKontaktBr() {
        return kontaktBr;
    }

    public void setKontaktBr(int kontaktBr) {
        this.kontaktBr = kontaktBr;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return naziv+", "+ocena+"/5 zvezdica";
    }

    @Override
    public String vratiNazivTabele() {
        return "hotel";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<ApstraktniDomenskiObjekat> lista= new ArrayList<>();
        while(rs.next()){
            int hotelID=rs.getInt("hotel.hotelID");
            String naziv=rs.getString("hotel.naziv");
            String adresa=rs.getString("hotel.adresa");
            String mail=rs.getString("hotel.mail");
            int kontaktBr=rs.getInt("hotel.kontaktBr");
            int ocena=rs.getInt("hotel.ocena");
            Hotel h = new Hotel(hotelID, naziv, adresa, mail, kontaktBr, ocena);
            lista.add(h);
        }
        return lista;
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "naziv,adresa,mail,kontaktBr,ocena";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        return "'"+naziv+"','"+adresa+"','"+mail+"',"+kontaktBr+","+ocena+"";
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "hotel.hotelID="+hotelID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        return "naziv='"+naziv+"', adresa='"+adresa+"',mail='"+mail+"',kontaktBr="+kontaktBr+",ocena="+ocena;
    }
    
    
}
