package com.afriland.cbsobjects.dtos.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CustomerEntrepriseIndivuelle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String numCompte;
    private String intitule;
    private String nom;
    private String nomSimple;
    private String prenom;
    private String nomJeuneFille;
    private String nationalite;
    private String typePiece;
    private String numeroPiece;
    private Date dateDelivPiece;
    private String LieudelivPiece;
    private Date dateValiditePiece;
    private Date dateNaissance;
    private String villeNaissance;
    private String paysNaiss;
    private String telDir;
    private String emailDir;
    
    private String nomContact;
    private String prenomContact;
    private String telContact;
    private String emailContact;
    
    private String raisonSocial;
    private String siegeSocial;
    private String secteurActivite;
    private String numImmatri;
    private Date dateImmatri;
    private String lieuImmatri;
    private String numIdentSocial;
    private String numContribuable;
    private Date dateNumContri;
    private String lieuNumContri;
    private String numPatente;
    private Date dateValPatente;
    private String lieuNumPatente;
    private Double chiffreAffaire;
    private Integer effectif;
    private String tel;
    private String adresse;
    private String email;
    private String localisation1;
    private String localisation2;
    private String ville;
    
    private String nomMere;
    private String nomPere;
    
    private List<ContactCli> autresContact;
    
    
    private String dateDelivPieceModif;
    private String dateValiditePieceModif;
    private String dateNaissanceModif;
    

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomSimple() {
        return nomSimple;
    }

    public void setNomSimple(String nomSimple) {
        this.nomSimple = nomSimple;
    }

    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTypePiece() {
        return typePiece;
    }

    public void setTypePiece(String typePiece) {
        this.typePiece = typePiece;
    }

    public String getNumeroPiece() {
        return numeroPiece;
    }

    public void setNumeroPiece(String numeroPiece) {
        this.numeroPiece = numeroPiece;
    }

    public Date getDateDelivPiece() {
        return dateDelivPiece;
    }

    public void setDateDelivPiece(Date dateDelivPiece) {
        this.dateDelivPiece = dateDelivPiece;
    }

    public String getLieudelivPiece() {
        return LieudelivPiece;
    }

    public void setLieudelivPiece(String LieudelivPiece) {
        this.LieudelivPiece = LieudelivPiece;
    }

    public Date getDateValiditePiece() {
        return dateValiditePiece;
    }

    public void setDateValiditePiece(Date dateValiditePiece) {
        this.dateValiditePiece = dateValiditePiece;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public String getPaysNaiss() {
        return paysNaiss;
    }

    public void setPaysNaiss(String paysNaiss) {
        this.paysNaiss = paysNaiss;
    }
    
    public void setContactCli(ContactCli cc){
        nomContact = cc.getNomContact();
        prenomContact = cc.getPrenomContact();
        telContact = cc.getTelContact();
        emailContact = cc.getEmailContact();
    }
    
    public String getNomContact() {
        return nomContact;
    }

    public String getPrenomContact() {
        return prenomContact;
    }


    public String getTelContact() {
        return telContact;
    }

    public String getEmailContact() {
        return emailContact;
    }


    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getSiegeSocial() {
        return siegeSocial;
    }

    public void setSiegeSocial(String siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getNumImmatri() {
        return numImmatri;
    }

    public void setNumImmatri(String numImmatri) {
        this.numImmatri = numImmatri;
    }

    public Date getDateImmatri() {
        return dateImmatri;
    }

    public void setDateImmatri(Date dateImmatri) {
        this.dateImmatri = dateImmatri;
    }

    public String getLieuImmatri() {
        return lieuImmatri;
    }

    public void setLieuImmatri(String lieuImmatri) {
        this.lieuImmatri = lieuImmatri;
    }

    public String getNumIdentSocial() {
        return numIdentSocial;
    }

    public void setNumIdentSocial(String numIdentSocial) {
        this.numIdentSocial = numIdentSocial;
    }

    public String getNumContribuable() {
        return numContribuable;
    }

    public void setNumContribuable(String numContribuable) {
        this.numContribuable = numContribuable;
    }

    public Date getDateNumContri() {
        return dateNumContri;
    }

    public void setDateNumContri(Date dateNumContri) {
        this.dateNumContri = dateNumContri;
    }

    public String getLieuNumContri() {
        return lieuNumContri;
    }

    public void setLieuNumContri(String lieuNumContri) {
        this.lieuNumContri = lieuNumContri;
    }

    public String getNumPatente() {
        return numPatente;
    }

    public void setNumPatente(String numPatente) {
        this.numPatente = numPatente;
    }

    public Date getDateValPatente() {
        return dateValPatente;
    }

    public void setDateValPatente(Date dateValPatente) {
        this.dateValPatente = dateValPatente;
    }

    public String getLieuNumPatente() {
        return lieuNumPatente;
    }

    public void setLieuNumPatente(String lieuNumPatente) {
        this.lieuNumPatente = lieuNumPatente;
    }

    public Double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(Double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Integer getEffectif() {
        return effectif;
    }

    public void setEffectif(Integer effectif) {
        this.effectif = effectif;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getEmailDir() {
        return emailDir;
    }

    public void setEmailDir(String emailDir) {
        this.emailDir = emailDir;
    }

    public String getTelDir() {
        return telDir;
    }

    public void setTelDir(String telDir) {
        this.telDir = telDir;
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

    public List<ContactCli> getAutresContact() {
        return autresContact;
    }

    public void setAutresContact(List<ContactCli> autresContact) {
        this.autresContact = autresContact;
    }

    public String getDateDelivPieceModif() {
        return dateDelivPieceModif;
    }

    public void setDateDelivPieceModif(String dateDelivPieceModif) {
        this.dateDelivPieceModif = dateDelivPieceModif;
    }

    public String getDateValiditePieceModif() {
        return dateValiditePieceModif;
    }

    public void setDateValiditePieceModif(String dateValiditePieceModif) {
        this.dateValiditePieceModif = dateValiditePieceModif;
    }

    public String getDateNaissanceModif() {
        return dateNaissanceModif;
    }

    public void setDateNaissanceModif(String dateNaissanceModif) {
        this.dateNaissanceModif = dateNaissanceModif;
    }
	
}
