/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Ponuda implements ApstraktniDomenskiObjekat{
    private int ponudaID;
    private Mesto mesto;
    private Prevoznik prevoznik;
    private Hotel hotel;
    private Zaposleni zaposleni;
    private String naziv;
    private String opis;
    private Date datumPocetka;
    private Date datumKraja;
    private int cena;

    public Ponuda() {
    }

    public Ponuda(int ponudaID, Mesto mesto, Prevoznik prevoznik, Hotel hotel, Zaposleni zaposleni, String naziv, String opis, Date datumPocetka, Date datumKraja, int cena) {
        this.ponudaID = ponudaID;
        this.mesto = mesto;
        this.prevoznik = prevoznik;
        this.hotel = hotel;
        this.zaposleni = zaposleni;
        this.naziv = naziv;
        this.opis = opis;
        this.datumPocetka = datumPocetka;
        this.datumKraja = datumKraja;
        this.cena= cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public int getPonudaID() {
        return ponudaID;
    }

    public void setPonudaID(int ponudaID) {
        this.ponudaID = ponudaID;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    public Prevoznik getPrevoznik() {
        return prevoznik;
    }

    public void setPrevoznik(Prevoznik prevoznik) {
        this.prevoznik = prevoznik;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Date getDatumKraja() {
        return datumKraja;
    }

    public void setDatumKraja(Date datumKraja) {
        this.datumKraja = datumKraja;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponuda other = (Ponuda) obj;
        if (this.ponudaID != other.ponudaID) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public String vratiNazivTabele() {
        return "ponuda";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "mestoID,prevoznikID,hotelID,zaposleniID,naziv,opis,datumPocetka,datumKraja,cena";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        return mesto.getMestoID()+","+prevoznik.getPrevoznikID()+","+hotel.getHotelID()+","+zaposleni.getZaposleniID()+",'"+naziv+"','"+opis+"','"+datumPocetka+"','"+datumKraja+"',"+cena+"";
        }

    @Override
    public String vratiPrimarniKljuc() {
        return "ponuda.ponudaID="+ponudaID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        return "mestoID="+mesto.getMestoID()+",prevoznikID="+prevoznik.getPrevoznikID()+",hotelID="+hotel.getHotelID()+",zaposleniID="+zaposleni.getZaposleniID()+",naziv='"+naziv+"',opis='"+opis+"',datumPocetka='"+datumPocetka+"',datumKraja='"+datumKraja+"',cena="+cena;
    }
    
    
}
