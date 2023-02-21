package com.afriland.cbsobjects.dtos.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBase implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String matricule;
	
	private String customerName;
	
	private String nomJeuneFille;
	
	private String dateNaissance;
		
	private String villeNaissance;
		
	private Date departementNaissance;
	
	private String adresse1;
		
	private String adresse2;
		
	private String adresse3;
		
	private String profil;
		
	private String codeProfil;
	
	private String agenceClient;
	
	private String sexe;
	
	private String codeGes;
	
	private String nomGes;
	
	private String typeClient;
	
	private String secteurActivite;
	
	private String typePieceIdentite;
		
	private String numeroPiece;
		
	private Date dateValiditePiece;
		
	private String formeJuridique;
		
	private String categorieInterne;
		
	private String titre;
		
	private String categorieBanqueCentrale;
		
	private String profession;
		
	private String nationalite;
		
	private String paysResidence;
		
	private String nomMere;
		
	private String nomPere;
		
	private String prenomMere;
		
	private String prenomPere;
		
	private String raisonSociale;
		
	private String raisonSociale2;
		
	private String sigle;
	
	private String registreCommerce;
		
	private String validiteRegistreCommerce;
		
	private String numeroPatente;
		
	private String validitePatente;
	
	private String groupe;
		
	private String numeroIdentiteSociale;
		
	private String numeroIdentiteFiscale;
		
	private String ville;
		
	private String numeroCasier;
		
	private String emailClient;
		
	private String residence;
	
	private String langue;
		
	
	private List<String> comptes = new ArrayList<String>();	
	
	private List<String> telephones = new ArrayList<String>();
	
	private List<String> adresseMails = new ArrayList<String>();
	
	

	public CustomerBase() {
		super();
	}



	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}



	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}



	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	/**
	 * @return the nomJeuneFille
	 */
	public String getNomJeuneFille() {
		return nomJeuneFille;
	}



	/**
	 * @param nomJeuneFille the nomJeuneFille to set
	 */
	public void setNomJeuneFille(String nomJeuneFille) {
		this.nomJeuneFille = nomJeuneFille;
	}



	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}



	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	/**
	 * @return the villeNaissance
	 */
	public String getVilleNaissance() {
		return villeNaissance;
	}



	/**
	 * @param villeNaissance the villeNaissance to set
	 */
	public void setVilleNaissance(String villeNaissance) {
		this.villeNaissance = villeNaissance;
	}



	/**
	 * @return the departementNaissance
	 */
	public Date getDepartementNaissance() {
		return departementNaissance;
	}



	/**
	 * @param departementNaissance the departementNaissance to set
	 */
	public void setDepartementNaissance(Date departementNaissance) {
		this.departementNaissance = departementNaissance;
	}



	/**
	 * @return the adresse1
	 */
	public String getAdresse1() {
		return adresse1;
	}



	/**
	 * @param adresse1 the adresse1 to set
	 */
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}



	/**
	 * @return the adresse2
	 */
	public String getAdresse2() {
		return adresse2;
	}



	/**
	 * @param adresse2 the adresse2 to set
	 */
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}



	/**
	 * @return the adresse3
	 */
	public String getAdresse3() {
		return adresse3;
	}



	/**
	 * @param adresse3 the adresse3 to set
	 */
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}



	/**
	 * @return the profil
	 */
	public String getProfil() {
		return profil;
	}



	/**
	 * @param profil the profil to set
	 */
	public void setProfil(String profil) {
		this.profil = profil;
	}



	/**
	 * @return the codeProfil
	 */
	public String getCodeProfil() {
		return codeProfil;
	}



	/**
	 * @param codeProfil the codeProfil to set
	 */
	public void setCodeProfil(String codeProfil) {
		this.codeProfil = codeProfil;
	}



	/**
	 * @return the agenceClient
	 */
	public String getAgenceClient() {
		return agenceClient;
	}



	/**
	 * @param agenceClient the agenceClient to set
	 */
	public void setAgenceClient(String agenceClient) {
		this.agenceClient = agenceClient;
	}



	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}



	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	/**
	 * @return the codeGes
	 */
	public String getCodeGes() {
		return codeGes;
	}



	/**
	 * @param codeGes the codeGes to set
	 */
	public void setCodeGes(String codeGes) {
		this.codeGes = codeGes;
	}



	/**
	 * @return the nomGes
	 */
	public String getNomGes() {
		return nomGes;
	}



	/**
	 * @param nomGes the nomGes to set
	 */
	public void setNomGes(String nomGes) {
		this.nomGes = nomGes;
	}



	/**
	 * @return the typeClient
	 */
	public String getTypeClient() {
		return typeClient;
	}



	/**
	 * @param typeClient the typeClient to set
	 */
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}



	/**
	 * @return the secteurActivite
	 */
	public String getSecteurActivite() {
		return secteurActivite;
	}



	/**
	 * @param secteurActivite the secteurActivite to set
	 */
	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}



	/**
	 * @return the typePieceIdentite
	 */
	public String getTypePieceIdentite() {
		return typePieceIdentite;
	}



	/**
	 * @param typePieceIdentite the typePieceIdentite to set
	 */
	public void setTypePieceIdentite(String typePieceIdentite) {
		this.typePieceIdentite = typePieceIdentite;
	}



	/**
	 * @return the numeroPiece
	 */
	public String getNumeroPiece() {
		return numeroPiece;
	}



	/**
	 * @param numeroPiece the numeroPiece to set
	 */
	public void setNumeroPiece(String numeroPiece) {
		this.numeroPiece = numeroPiece;
	}



	/**
	 * @return the dateValiditePiece
	 */
	public Date getDateValiditePiece() {
		return dateValiditePiece;
	}



	/**
	 * @param dateValiditePiece the dateValiditePiece to set
	 */
	public void setDateValiditePiece(Date dateValiditePiece) {
		this.dateValiditePiece = dateValiditePiece;
	}



	/**
	 * @return the formeJuridique
	 */
	public String getFormeJuridique() {
		return formeJuridique;
	}



	/**
	 * @param formeJuridique the formeJuridique to set
	 */
	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}



	/**
	 * @return the categorieInterne
	 */
	public String getCategorieInterne() {
		return categorieInterne;
	}



	/**
	 * @param categorieInterne the categorieInterne to set
	 */
	public void setCategorieInterne(String categorieInterne) {
		this.categorieInterne = categorieInterne;
	}



	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}



	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}



	/**
	 * @return the categorieBanqueCentrale
	 */
	public String getCategorieBanqueCentrale() {
		return categorieBanqueCentrale;
	}



	/**
	 * @param categorieBanqueCentrale the categorieBanqueCentrale to set
	 */
	public void setCategorieBanqueCentrale(String categorieBanqueCentrale) {
		this.categorieBanqueCentrale = categorieBanqueCentrale;
	}



	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}



	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}



	/**
	 * @return the nationalite
	 */
	public String getNationalite() {
		return nationalite;
	}



	/**
	 * @param nationalite the nationalite to set
	 */
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}



	/**
	 * @return the paysResidence
	 */
	public String getPaysResidence() {
		return paysResidence;
	}



	/**
	 * @param paysResidence the paysResidence to set
	 */
	public void setPaysResidence(String paysResidence) {
		this.paysResidence = paysResidence;
	}



	/**
	 * @return the nomMere
	 */
	public String getNomMere() {
		return nomMere;
	}



	/**
	 * @param nomMere the nomMere to set
	 */
	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}



	/**
	 * @return the nomPere
	 */
	public String getNomPere() {
		return nomPere;
	}



	/**
	 * @param nomPere the nomPere to set
	 */
	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}



	/**
	 * @return the prenomMere
	 */
	public String getPrenomMere() {
		return prenomMere;
	}



	/**
	 * @param prenomMere the prenomMere to set
	 */
	public void setPrenomMere(String prenomMere) {
		this.prenomMere = prenomMere;
	}



	/**
	 * @return the prenomPere
	 */
	public String getPrenomPere() {
		return prenomPere;
	}



	/**
	 * @param prenomPere the prenomPere to set
	 */
	public void setPrenomPere(String prenomPere) {
		this.prenomPere = prenomPere;
	}



	/**
	 * @return the raisonSociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}



	/**
	 * @param raisonSociale the raisonSociale to set
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}



	/**
	 * @return the raisonSociale2
	 */
	public String getRaisonSociale2() {
		return raisonSociale2;
	}



	/**
	 * @param raisonSociale2 the raisonSociale2 to set
	 */
	public void setRaisonSociale2(String raisonSociale2) {
		this.raisonSociale2 = raisonSociale2;
	}



	/**
	 * @return the sigle
	 */
	public String getSigle() {
		return sigle;
	}



	/**
	 * @param sigle the sigle to set
	 */
	public void setSigle(String sigle) {
		this.sigle = sigle;
	}



	/**
	 * @return the registreCommerce
	 */
	public String getRegistreCommerce() {
		return registreCommerce;
	}



	/**
	 * @param registreCommerce the registreCommerce to set
	 */
	public void setRegistreCommerce(String registreCommerce) {
		this.registreCommerce = registreCommerce;
	}



	/**
	 * @return the validiteRegistreCommerce
	 */
	public String getValiditeRegistreCommerce() {
		return validiteRegistreCommerce;
	}



	/**
	 * @param validiteRegistreCommerce the validiteRegistreCommerce to set
	 */
	public void setValiditeRegistreCommerce(String validiteRegistreCommerce) {
		this.validiteRegistreCommerce = validiteRegistreCommerce;
	}



	/**
	 * @return the numeroPatente
	 */
	public String getNumeroPatente() {
		return numeroPatente;
	}



	/**
	 * @param numeroPatente the numeroPatente to set
	 */
	public void setNumeroPatente(String numeroPatente) {
		this.numeroPatente = numeroPatente;
	}



	/**
	 * @return the validitePatente
	 */
	public String getValiditePatente() {
		return validitePatente;
	}



	/**
	 * @param validitePatente the validitePatente to set
	 */
	public void setValiditePatente(String validitePatente) {
		this.validitePatente = validitePatente;
	}



	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}



	/**
	 * @param groupe the groupe to set
	 */
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}



	/**
	 * @return the numeroIdentiteSociale
	 */
	public String getNumeroIdentiteSociale() {
		return numeroIdentiteSociale;
	}



	/**
	 * @param numeroIdentiteSociale the numeroIdentiteSociale to set
	 */
	public void setNumeroIdentiteSociale(String numeroIdentiteSociale) {
		this.numeroIdentiteSociale = numeroIdentiteSociale;
	}



	/**
	 * @return the numeroIdentiteFiscale
	 */
	public String getNumeroIdentiteFiscale() {
		return numeroIdentiteFiscale;
	}



	/**
	 * @param numeroIdentiteFiscale the numeroIdentiteFiscale to set
	 */
	public void setNumeroIdentiteFiscale(String numeroIdentiteFiscale) {
		this.numeroIdentiteFiscale = numeroIdentiteFiscale;
	}



	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}



	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}



	/**
	 * @return the numeroCasier
	 */
	public String getNumeroCasier() {
		return numeroCasier;
	}



	/**
	 * @param numeroCasier the numeroCasier to set
	 */
	public void setNumeroCasier(String numeroCasier) {
		this.numeroCasier = numeroCasier;
	}



	/**
	 * @return the emailClient
	 */
	public String getEmailClient() {
		return emailClient;
	}



	/**
	 * @param emailClient the emailClient to set
	 */
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}



	/**
	 * @return the residence
	 */
	public String getResidence() {
		return residence;
	}



	/**
	 * @param residence the residence to set
	 */
	public void setResidence(String residence) {
		this.residence = residence;
	}



	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}



	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}



	/**
	 * @return the comptes
	 */
	public List<String> getComptes() {
		return comptes;
	}



	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<String> comptes) {
		this.comptes = comptes;
	}



	/**
	 * @return the telephones
	 */
	public List<String> getTelephones() {
		return telephones;
	}



	/**
	 * @param telephones the telephones to set
	 */
	public void setTelephones(List<String> telephones) {
		this.telephones = telephones;
	}



	/**
	 * @return the adresseMails
	 */
	public List<String> getAdresseMails() {
		return adresseMails;
	}



	/**
	 * @param adresseMails the adresseMails to set
	 */
	public void setAdresseMails(List<String> adresseMails) {
		this.adresseMails = adresseMails;
	}
	


}
