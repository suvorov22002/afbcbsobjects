package com.afriland.cbsobjects.dtos.customer;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Yves LABO
 */
public class CustomerParticulier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String numCompte;
    private String intitule;
    private String nom;
    private String nomSimple;
    private String prenom;
    private String nationalite;
    private String typePiece;
    private String numeroPiece;
    private Date dateDelivPiece;
    private String LieudelivPiece;
    private Date dateValiditePiece;
    private String profession;
    private String adresse;
    private String localisation1;
    private String localisation2;
    private String ville;
    private String num1;
    private String num2;
    private String fax;
    private String email;
    private String revenu;
    private Date dateNaissance;
    private String villeNaissance;
    private String paysNaiss;
    private String regimeMat;
    private String nomJeuneFille;
    private String employeur;
    private String sitmat;
    private String nomContact;
    private String prenomContact;
    private String telContact;
    private String emailContact;
    private String nomConjoint;
    private Date dateNaissanceConj;
    private String villeNaissanceConj;
    private String nomMere;
    private String nomPere;
    private String typeLienCotitu;
    
    
    private String dateDelivPieceModif;
    private String dateValiditePieceModif;
    private String dateNaissanceModif;
    
    private List<ContactCli> autresContact;

    public CustomerParticulier() {
    }

    public CustomerParticulier(Cotitulaire cotitulaire) {
        nom = cotitulaire.getFullName();
        typeLienCotitu = cotitulaire.getTypeLien().trim();
    }

    public String getTypeLienCotitu() {
        return typeLienCotitu;
    }

    public void setTypeLienCotitu(String typeLienCotitu) {
        this.typeLienCotitu = typeLienCotitu;
    }
    
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRevenu() {
        return revenu;
    }

    public void setRevenu(String revenu) {
        this.revenu = revenu;
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
    
    public String getRegimeMat() {
        return regimeMat;
    }

    public void setRegimeMat(String regimeMat) {
        this.regimeMat = regimeMat;
    }

    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    public String getEmployeur() {
        return employeur;
    }

    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }

    public String getSitmat() {
        return sitmat;
    }

    public void setSitmat(String sitmat) {
        this.sitmat = sitmat;
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


    public String getNomConjoint() {
        return nomConjoint;
    }

    public void setNomConjoint(String nomConjoint) {
        this.nomConjoint = nomConjoint;
    }

    public Date getDateNaissanceConj() {
        return dateNaissanceConj;
    }

    public void setDateNaissanceConj(Date dateNaissanceConj) {
        this.dateNaissanceConj = dateNaissanceConj;
    }

    public String getVilleNaissanceConj() {
        return villeNaissanceConj;
    }

    public void setVilleNaissanceConj(String villeNaissanceConj) {
        this.villeNaissanceConj = villeNaissanceConj;
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

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<ContactCli> getAutresContact() {
        if(autresContact == null)
            return new ArrayList<>();
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
