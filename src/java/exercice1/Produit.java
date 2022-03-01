/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Produit {
    private String titre,expiration,code;
    private double prix,prixfinale;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrixfinale() {
        return prixfinale;
    }

    public void setPrixfinale(double prixfinale) {
        this.prixfinale = prixfinale;
    }
    public void calculefinale()
    {
    this.prixfinale=this.prix*1.12;
    
    
    }
    
    public String redirection()
    {
    
    //traitement
        return "index.xhtml?faces-redirect=true";
    
    }
    
    
}
