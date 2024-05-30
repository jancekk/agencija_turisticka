/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Prevoznik implements ApstraktniDomenskiObjekat{
    private int prevoznikID;
    private String naziv;
    private String mail;
    private int kontaktBr;
    private int ocena;

    public Prevoznik(int prevoznikID, String naziv, String mail, int kontaktBr, int ocena) {
        this.prevoznikID = prevoznikID;
        this.naziv = naziv;
        this.mail = mail;
        this.kontaktBr = kontaktBr;
        this.ocena=ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public Prevoznik() {
    }

    public int getPrevoznikID() {
        return prevoznikID;
    }

    public void setPrevoznikID(int prevoznikID) {
        this.prevoznikID = prevoznikID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
    public String toString() {
        return naziv+", "+ocena+"/5 zvezdica";
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
        final Prevoznik other = (Prevoznik) obj;
        if (this.prevoznikID != other.prevoznikID) {
            return false;
        }
        return Objects.equals(this.naziv, other.naziv);
    }
    
    @Override
    public String vratiNazivTabele() {
        return "prevoznik"; 
    }

    @Override
    public List<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<ApstraktniDomenskiObjekat> lista= new ArrayList<>();
        while(rs.next()){
            int prevoznikID=rs.getInt("prevoznik.prevoznikID");
            String naziv = rs.getString("prevoznik.naziv");
            String mail = rs.getString("prevoznik.mail");
            int kontaktBr = rs.getInt("prevoznik.kontaktBr");
            int ocena= rs.getInt("prevoznik.ocena");
            Prevoznik p = new Prevoznik(prevoznikID, naziv, mail, kontaktBr, ocena);
            lista.add(p);
        }
        return lista;
    }

    @Override
    public String vratiKoloneZaUbacivanje() {
        return "naziv,mail,kontaktBr,ocena";
    }

    @Override
    public String vratiVrednostiZaUbacivanje() {
        return "'"+naziv+"','"+mail+"',"+kontaktBr+","+ocena+"";
    }

    @Override
    public String vratiPrimarniKljuc() {
        return "prevoznik.prevoznikID="+prevoznikID;
    }

    @Override
    public ApstraktniDomenskiObjekat vratiObjekatIzRS(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vratiVrednostiZaIzmenu() {
        return "naziv='"+naziv+"',mail='"+mail+"',kontaktBr="+kontaktBr+",ocena="+ocena;
    }
    
    
}
