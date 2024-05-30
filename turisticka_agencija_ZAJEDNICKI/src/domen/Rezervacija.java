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
public class Rezervacija implements ApstraktniDomenskiObjekat{
    private int rezervacijaID;
    private List<Ponuda> ponude;
    private Korisnik korisnik;
    private Zaposleni zaposleni;
    private Date datumRezervacije;
    private Date datumIsplate;

    public Rezervacija() {
    }

    public Rezervacija(int rezervacijaID, List<Ponuda> ponude, Korisnik korisnik, Zaposleni zaposleni, Date datumRezervacije, Date datumIsplate) {
        this.rezervacijaID = rezervacijaID;
        this.ponude = ponude;
        this.korisnik = korisnik;
        this.zaposleni = zaposleni;
        this.datumRezervacije = datumRezervacije;
        this.datumIsplate = datumIsplate;
    }

    public int getRezervacijaID() {
        return rezervacijaID;
    }

    public void setRezervacijaID(int rezervacijaID) {
        this.rezervacijaID = rezervacijaID;
    }

    public List<Ponuda> getPonude() {
        return ponude;
    }

    public void setPonude(List<Ponuda> ponude) {
        this.ponude = ponude;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Date getDatumRezervacije() {
        return datumRezervacije;
    }

    public void setDatumRezervacije(Date datumRezervacije) {
        this.datumRezervacije = datumRezervacije;
    }

    public Date getDatumIsplate() {
        return datumIsplate;
    }

    public void setDatumIsplate(Date datumIsplate) {
        this.datumIsplate = datumIsplate;
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
        final Rezervacija other = (Rezervacija) obj;
        if (this.rezervacijaID != other.rezervacijaID) {
            return false;
        }
        if (!Objects.equals(this.ponude, other.ponude)) {
            return false;
        }
        if (!Objects.equals(this.korisnik, other.korisnik)) {
            return false;
        }
        return Objects.equals(this.zaposleni, other.zaposleni);
    }

    @Override
    public String toString() {
        return ponude + " " + korisnik + " " + datumRezervacije;
    }

    @Override
    public String vratiNazivTabele() {
        return "rezervacija";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "korisnik,zaposleni,datumRezervacije,datumIsplate";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        return korisnik.getKorisnikID()+","+zaposleni.getZaposleniID()+",'"+datumRezervacije+"','"+datumIsplate+"'";
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "rezervacija.rezervacijaID="+rezervacijaID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        return "korisnik="+korisnik.getKorisnikID()+",zaposleni="+zaposleni.getZaposleniID()+",datumRezervacije='"+datumRezervacije+"',datumIsplate='"+datumIsplate+"'";
    }
    
    
            
}
