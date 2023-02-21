package com.afriland.cbsobjects.dtos.customer;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Narcisse
 */
public class CustomerPersonneMorale implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String numCompte;
    private String raisonSocial;
    private String siegeSocial;
    private String sigle;
    private String secteurActivite;
    private String numImmatri;
    private Date dateImmatri;
    private String lieuImmatri;
    private String autoriteImm;
    private String numIdentSocial;
    private String numContribuable;
    private Date dateNumContri;
    private String lieuNumContri;
    private String numPatente;
    private Date dateValPatente;
    private String lieuNumPatente;
    private Double chiffreAffaire;
    private Integer effectif;
    private String origineFonds;
    private String tel;
    private String adresse;
    private String email;
    private String siteWeb;
    private String fax;
    private String localisation1;
    private String localisation2;
    private String ville;
    
    private String nomContact;
    private String prenomContact;
    private String telContact;
    private String emailContact;
    
    private String nomDir1;
    private String nationaliteDir1;
    private String typePieceDir1;
    private String numeroPieceDir1;
    private Date dateDelivPieceDir1;
    private String LieudelivPieceDir1;
    private Date dateValiditePieceDir1;
    private Date dateNaissanceDir1;
    private String villeNaissanceDir1;
    private String paysNaissDir1;
    private String num1Dir1;
    private String num2Dir1;
    private String emailDir1;
    private String intituleDir1;
    private String fonctionDir1;
    
    private String nomDir2;
    private String nationaliteDir2;
    private String typePieceDir2;
    private String numeroPieceDir2;
    private Date dateDelivPieceDir2;
    private String LieudelivPieceDir2;
    private Date dateValiditePieceDir2;
    private Date dateNaissanceDir2;
    private String villeNaissanceDir2;
    private String paysNaissDir2;
    private String num1Dir2;
    private String num2Dir2;
    private String emailDir2;
    private String intituleDir2;
    private String fonctionDir2;
    
    
    private String dateDelivPieceDir1Modif;
    private String dateValiditePieceDir1Modif;
    private String dateNaissanceDir1Modif;
    
    private String dateDelivPieceDir2Modif;
    private String dateValiditePieceDir2Modif;
    private String dateNaissanceDir2Modif;
    
    private List<ContactCli> autresContact;
    private List<DirigeantEntreprise> autresDirigeants;

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
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

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
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

    public String getAutoriteImm() {
        return autoriteImm;
    }

    public void setAutoriteImm(String autoriteImm) {
        this.autoriteImm = autoriteImm;
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

    public String getOrigineFonds() {
        return origineFonds;
    }

    public void setOrigineFonds(String origineFonds) {
        this.origineFonds = origineFonds;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
    
    public void setDirigeant1(DirigeantEntreprise dir){
        this.nomDir1 = dir.getNomDir();
        this.nationaliteDir1 = dir.getNationaliteDir();
        this.typePieceDir1 = dir.getTypePieceDir();
        this.numeroPieceDir1 = dir.getNumeroPieceDir();
        this.dateDelivPieceDir1 = dir.getDateDelivPieceDir();
        this.LieudelivPieceDir1 = dir.getLieudelivPieceDir();
        this.dateValiditePieceDir1 = dir.getDateValiditePieceDir();
        this.dateNaissanceDir1 = dir.getDateNaissanceDir();
        this.villeNaissanceDir1 = dir.getVilleNaissanceDir();
        this.paysNaissDir1 = dir.getPaysNaissDir();
        this.num1Dir1 = dir.getNum1Dir();
        this.num2Dir1 = dir.getNum2Dir();
        this.emailDir1 = dir.getEmailDir();
        this.intituleDir1 = dir.getIntituleDir();
        this.fonctionDir1=dir.getFonctionDir();
    }
    
    public void setDirigeant2(DirigeantEntreprise dir){
        this.nomDir2 = dir.getNomDir();
        this.nationaliteDir2 = dir.getNationaliteDir();
        this.typePieceDir2 = dir.getTypePieceDir();
        this.numeroPieceDir2 = dir.getNumeroPieceDir();
        this.dateDelivPieceDir2 = dir.getDateDelivPieceDir();
        this.LieudelivPieceDir2 = dir.getLieudelivPieceDir();
        this.dateValiditePieceDir2 = dir.getDateValiditePieceDir();
        this.dateNaissanceDir2 = dir.getDateNaissanceDir();
        this.villeNaissanceDir2 = dir.getVilleNaissanceDir();
        this.paysNaissDir2 = dir.getPaysNaissDir();
        this.num1Dir2 = dir.getNum1Dir();
        this.num2Dir2 = dir.getNum2Dir();
        this.emailDir2 = dir.getEmailDir();
        this.intituleDir2 = dir.getIntituleDir();
        this.fonctionDir2 = dir.getFonctionDir();
    }

    public String getNomDir1() {
        return nomDir1;
    }

    public String getNationaliteDir1() {
        return nationaliteDir1;
    }

    public String getTypePieceDir1() {
        return typePieceDir1;
    }

    public String getNumeroPieceDir1() {
        return numeroPieceDir1;
    }

    public Date getDateDelivPieceDir1() {
        return dateDelivPieceDir1;
    }

    public String getLieudelivPieceDir1() {
        return LieudelivPieceDir1;
    }

    public Date getDateValiditePieceDir1() {
        return dateValiditePieceDir1;
    }

    public Date getDateNaissanceDir1() {
        return dateNaissanceDir1;
    }

    public String getVilleNaissanceDir1() {
        return villeNaissanceDir1;
    }

    public String getPaysNaissDir1() {
        return paysNaissDir1;
    }

    public String getNum1Dir1() {
        return num1Dir1;
    }

    public String getNum2Dir1() {
        return num2Dir1;
    }

    public String getEmailDir1() {
        return emailDir1;
    }

    public String getNomDir2() {
        return nomDir2;
    }


    public String getNationaliteDir2() {
        return nationaliteDir2;
    }

    public String getTypePieceDir2() {
        return typePieceDir2;
    }

    public String getNumeroPieceDir2() {
        return numeroPieceDir2;
    }

    public Date getDateDelivPieceDir2() {
        return dateDelivPieceDir2;
    }

    public String getLieudelivPieceDir2() {
        return LieudelivPieceDir2;
    }

    public Date getDateValiditePieceDir2() {
        return dateValiditePieceDir2;
    }

    public Date getDateNaissanceDir2() {
        return dateNaissanceDir2;
    }

    public String getVilleNaissanceDir2() {
        return villeNaissanceDir2;
    }

    public String getPaysNaissDir2() {
        return paysNaissDir2;
    }

    public String getNum1Dir2() {
        return num1Dir2;
    }

    public String getNum2Dir2() {
        return num2Dir2;
    }

    public String getEmailDir2() {
        return emailDir2;
    }

    public String getIntituleDir1() {
        return intituleDir1;
    }

    public String getIntituleDir2() {
        return intituleDir2;
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

    public String getFonctionDir1() {
        return fonctionDir1;
    }

    public String getFonctionDir2() {
        return fonctionDir2;
    }

    public List<ContactCli> getAutresContact() {
        return autresContact;
    }

    public void setAutresContact(List<ContactCli> autresContact) {
        this.autresContact = autresContact;
    }

    public List<DirigeantEntreprise> getAutresDirigeants() {
        return autresDirigeants;
    }

    public void setAutresDirigeants(List<DirigeantEntreprise> autresDirigeants) {
        this.autresDirigeants = autresDirigeants;
    }

    public String getDateDelivPieceDir1Modif() {
        return dateDelivPieceDir1Modif;
    }

    public void setDateDelivPieceDir1Modif(String dateDelivPieceDir1Modif) {
        this.dateDelivPieceDir1Modif = dateDelivPieceDir1Modif;
    }

    public String getDateValiditePieceDir1Modif() {
        return dateValiditePieceDir1Modif;
    }

    public void setDateValiditePieceDir1Modif(String dateValiditePieceDir1Modif) {
        this.dateValiditePieceDir1Modif = dateValiditePieceDir1Modif;
    }

    public String getDateNaissanceDir1Modif() {
        return dateNaissanceDir1Modif;
    }

    public void setDateNaissanceDir1Modif(String dateNaissanceDir1Modif) {
        this.dateNaissanceDir1Modif = dateNaissanceDir1Modif;
    }

    public String getDateDelivPieceDir2Modif() {
        return dateDelivPieceDir2Modif;
    }

    public void setDateDelivPieceDir2Modif(String dateDelivPieceDir2Modif) {
        this.dateDelivPieceDir2Modif = dateDelivPieceDir2Modif;
    }

    public String getDateValiditePieceDir2Modif() {
        return dateValiditePieceDir2Modif;
    }

    public void setDateValiditePieceDir2Modif(String dateValiditePieceDir2Modif) {
        this.dateValiditePieceDir2Modif = dateValiditePieceDir2Modif;
    }

    public String getDateNaissanceDir2Modif() {
        return dateNaissanceDir2Modif;
    }

    public void setDateNaissanceDir2Modif(String dateNaissanceDir2Modif) {
        this.dateNaissanceDir2Modif = dateNaissanceDir2Modif;
    }

    public void setNomDir1(String nomDir1) {
        this.nomDir1 = nomDir1;
    }

    public void setNumeroPieceDir1(String numeroPieceDir1) {
        this.numeroPieceDir1 = numeroPieceDir1;
    }

    public void setDateDelivPieceDir1(Date dateDelivPieceDir1) {
        this.dateDelivPieceDir1 = dateDelivPieceDir1;
    }

    public void setDateValiditePieceDir1(Date dateValiditePieceDir1) {
        this.dateValiditePieceDir1 = dateValiditePieceDir1;
    }

    public void setDateNaissanceDir1(Date dateNaissanceDir1) {
        this.dateNaissanceDir1 = dateNaissanceDir1;
    }

    public void setVilleNaissanceDir1(String villeNaissanceDir1) {
        this.villeNaissanceDir1 = villeNaissanceDir1;
    }

    public void setNomDir2(String nomDir2) {
        this.nomDir2 = nomDir2;
    }

    public void setNumeroPieceDir2(String numeroPieceDir2) {
        this.numeroPieceDir2 = numeroPieceDir2;
    }

    public void setDateDelivPieceDir2(Date dateDelivPieceDir2) {
        this.dateDelivPieceDir2 = dateDelivPieceDir2;
    }

    public void setDateValiditePieceDir2(Date dateValiditePieceDir2) {
        this.dateValiditePieceDir2 = dateValiditePieceDir2;
    }

    public void setDateNaissanceDir2(Date dateNaissanceDir2) {
        this.dateNaissanceDir2 = dateNaissanceDir2;
    }

    public void setVilleNaissanceDir2(String villeNaissanceDir2) {
        this.villeNaissanceDir2 = villeNaissanceDir2;
    }

    public void setLieudelivPieceDir1(String LieudelivPieceDir1) {
        this.LieudelivPieceDir1 = LieudelivPieceDir1;
    }

    public void setLieudelivPieceDir2(String LieudelivPieceDir2) {
        this.LieudelivPieceDir2 = LieudelivPieceDir2;
    }

    
    
    
}