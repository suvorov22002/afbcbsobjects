package com.afriland.cbsobjects.dtos.customer;

import java.util.Date;

public class DirigeantEntreprise implements Comparable<DirigeantEntreprise>{
	
    private String id;
    private String nomDir;
    private String nomSimple;
    private String prenom;
    private String nationaliteDir;
    private String typePieceDir;
    private String numeroPieceDir;
    private Date dateDelivPieceDir;
    private String LieudelivPieceDir;
    private Date dateValiditePieceDir;
    private Date dateNaissanceDir;
    private String villeNaissanceDir;
    private String paysNaissDir;
    private String num1Dir;
    private String num2Dir;
    private String emailDir;
    private String intituleDir;
    private String fonctionDir;
    private int numOrdr;
    private String nomPere;
    private String nomMere;
    private String residence;
    private String localisation1;
    private String localisation2;
    private String ville;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNomDir() {
        return nomDir;
    }

    public void setNomDir(String nomDir) {
        this.nomDir = nomDir;
    }
    
    public String getNomSimple() {
        return nomSimple;
    }

    public void setNomSimple(String nomSimple) {
        this.nomSimple = nomSimple;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationaliteDir() {
        return nationaliteDir;
    }

    public void setNationaliteDir(String nationaliteDir) {
        this.nationaliteDir = nationaliteDir;
    }

    public String getTypePieceDir() {
        return typePieceDir;
    }

    public void setTypePieceDir(String typePieceDir) {
        this.typePieceDir = typePieceDir;
    }

    public String getNumeroPieceDir() {
        return numeroPieceDir;
    }

    public void setNumeroPieceDir(String numeroPieceDir) {
        this.numeroPieceDir = numeroPieceDir;
    }

    public Date getDateDelivPieceDir() {
        return dateDelivPieceDir;
    }

    public void setDateDelivPieceDir(Date dateDelivPieceDir) {
        this.dateDelivPieceDir = dateDelivPieceDir;
    }

    public String getLieudelivPieceDir() {
        return LieudelivPieceDir;
    }

    public void setLieudelivPieceDir(String LieudelivPieceDir) {
        this.LieudelivPieceDir = LieudelivPieceDir;
    }

    public Date getDateValiditePieceDir() {
        return dateValiditePieceDir;
    }

    public void setDateValiditePieceDir(Date dateValiditePieceDir) {
        this.dateValiditePieceDir = dateValiditePieceDir;
    }

    public Date getDateNaissanceDir() {
        return dateNaissanceDir;
    }

    public void setDateNaissanceDir(Date dateNaissanceDir) {
        this.dateNaissanceDir = dateNaissanceDir;
    }

    public String getVilleNaissanceDir() {
        return villeNaissanceDir;
    }

    public void setVilleNaissanceDir(String villeNaissanceDir) {
        this.villeNaissanceDir = villeNaissanceDir;
    }

    public String getPaysNaissDir() {
        return paysNaissDir;
    }

    public void setPaysNaissDir(String paysNaissDir) {
        this.paysNaissDir = paysNaissDir;
    }

    public String getNum1Dir() {
        return num1Dir;
    }

    public void setNum1Dir(String num1Dir) {
        this.num1Dir = num1Dir;
    }

    public String getNum2Dir() {
        return num2Dir;
    }

    public void setNum2Dir(String num2Dir) {
        this.num2Dir = num2Dir;
    }

    public String getEmailDir() {
        return emailDir;
    }

    public void setEmailDir(String emailDir) {
        this.emailDir = emailDir;
    }

    public String getIntituleDir() {
        return intituleDir;
    }

    public void setIntituleDir(String intituleDir) {
        this.intituleDir = intituleDir;
    }

    public String getFonctionDir() {
        return fonctionDir;
    }

    public void setFonctionDir(String fonctionDir) {
        /*
        if(fonctionDir != null){
            switch (fonctionDir) {
                case "PRESIDENT CONSEIL ADMINISTRATI":
                    numOrdr = 1;
                    break;
                case "PRESIDENT DIRECTEUR GENERAL":
                    numOrdr = 1;
                    break;
                case "CEO":
                    numOrdr = 2;
                    break;
                 case "DIRECTEUR GENERAL":
                    numOrdr = 2;
                    break;
                case "ADMINISTRATEUR":
                    numOrdr = 3;
                    break;
                case "VICE PRESIDENT":
                    numOrdr = 3;
                    break;
                case "DIRECTEUR":
                    numOrdr = 4;
                    break;
                case "SECRETAIRE GENERAL":
                    numOrdr = 4;
                    break;
            }
        }
        */
        this.fonctionDir = fonctionDir;
    }

    public int getNumOrdr() {
        return numOrdr;
    }

    public void setNumOrdr(int numOrdr) {
        this.numOrdr = numOrdr;
    }
    
    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    public String getLocalisation1() {
        return localisation1;
    }

    public void setLocalisation1(String localisation1) {
        this.localisation1 = localisation1;
    }

    public String getLocalisation2() {
        return localisation2;
    }

    public void setLocalisation2(String localisation2) {
        this.localisation2 = localisation2;
    }
    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    

    @Override
    public int compareTo(DirigeantEntreprise o) {
        return this.numOrdr - o.numOrdr;
    }
}
