/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Korisnik implements ApstraktniDomenskiObjekat{
    private int korisnikID;
    private String ime;
    private String prezime;
    private int JMBG;
    private String mail;
    private int kontaktBr;
    private Zaposleni zaposleni;

    public Korisnik() {
    }

    public Korisnik(int korisnikID, String ime, String prezime, int JMBG, String mail, int kontaktBr, Zaposleni zaposleni) {
        this.korisnikID = korisnikID;
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.mail = mail;
        this.kontaktBr = kontaktBr;
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public int getKorisnikID() {
        return korisnikID;
    }

    public void setKorisnikID(int korisnikID) {
        this.korisnikID = korisnikID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
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

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Korisnik other = (Korisnik) obj;
        if (this.korisnikID != other.korisnikID) {
            return false;
        }
        if (this.JMBG != other.JMBG) {
            return false;
        }
        return Objects.equals(this.ime, other.ime);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String vratiNazivTabele() {
        return "korisnik";
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "ime,prezime,JMBG,mail,kontaktBr,zaposleniId";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        return "'"+ime+"','"+prezime+"',"+JMBG+",'"+mail+"',"+kontaktBr+","+zaposleni.getZaposleniID()+"";
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "korisnik.korisnikID="+korisnikID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        return "ime='"+ime+"',prezime='"+prezime+"',JMBG="+JMBG+",mail='"+mail+"',kontaktBr="+kontaktBr+", zaposleniId="+zaposleni;
    }
    
    
}
