package com.afriland.cbsobjects.dtos.customer;


import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Yves LABO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String matricule;
	private String customerName;
	private String departementNaissance;
	private String adresse1;
	private String adresse2;
	private String adresse3;
	private String profil;
	private String codeProfil;
	private String agenceClient;
    private String codeAgenceClient;
	private String sexe;
	private String codeGes;
	private String nomGes;
	private String typeClient;
	private String typePieceIdentite;
	private String formeJuridique;
	private String categorieInterne;
    private String codeCategorieInterne;
	private String titre;
	private String categorieBanqueCentrale;
	private String paysResidence;
	private String prenomMere;
	private String prenomPere;
	private String raisonSociale;
	private String raisonSociale2;
	private String registreCommerce;
	private String validiteRegistreCommerce;
	private String numeroPatente;
	private String validitePatente;
	private String groupe;
	private String numeroIdentiteSociale;
	private String numeroIdentiteFiscale;
	private String numeroCasier;
	private String emailClient;
	private String residence;
	private String langue;
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
    private String profession;
    private String numTelephone1;
    private String numTelephone2;
    private String revenu;
    private String regimeMat;
    private String employeur;
    private String sitmat;
    private String nomConjoint;
    private Date dateNaissanceConj;
    private String villeNaissanceConj;
    private String typeLienCotitu;
    private String nomMere;
    private String nomPere;
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
    private String numTelephoneDir1;
    private String numTelephoneDir2;
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
    private String utiCreation;
    private String utiModification;
    private Date dateCreation;
    private Date dateModification;
    private String segment;


    
    public void setContactCli(ContactCli cc){
        nomContact = cc.getNomContact();
        prenomContact = cc.getPrenomContact();
        telContact = cc.getTelContact();
        emailContact = cc.getEmailContact();
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
        this.numTelephoneDir1 = dir.getNum1Dir();
        this.numTelephoneDir2 = dir.getNum2Dir();
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

}