package com.afriland.cbsobjects.utils;

import com.afriland.cbsobjects.dtos.customer.Client;
import com.afriland.cbsobjects.responses.cbs.customer.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Slf4j
@Service
public class ObjectCustomerMapper implements Function<GetCustomerDetailResponse, Client> {

    @Override
    public Client apply(GetCustomerDetailResponse customerDetailResponse) {

        Client client = new Client();
        client.setMatricule(customerDetailResponse.getCustomerCode());
        client.setTypeClient(customerDetailResponse.getCustomerType());
        client.setLangue(customerDetailResponse.getLanguage().getDesignation());
        client.setIntitule(customerDetailResponse.getTitleCode().getDesignation());
        client.setCustomerName(customerDetailResponse.getNameToReturn());


        Optional<IndividualSpecInfo> optIndividualSpecInfo = Optional.ofNullable(customerDetailResponse.getSpecificInformation()
                .getIndividualSpecInfo());

        if(!optIndividualSpecInfo.isEmpty()) {
            try{
                client.setDepartementNaissance(optIndividualSpecInfo.get().getBirth().getBirthCounty());
                client.setSexe(optIndividualSpecInfo.get().getBirth().getHolderSex());
                client.setPrenom(optIndividualSpecInfo.get().getIndividualGeneralInfo().getFirstname());
                client.setNomJeuneFille("");
                client.setNationalite(customerDetailResponse.getSituation().getNationalityCode().getDesignation());
                client.setTypePiece(optIndividualSpecInfo.get().getIdPaper().getType().getCode());
                client.setNumeroPiece(optIndividualSpecInfo.get()
                        .getIdPaper().getIdPaperNumber());
                client.setDateDelivPiece(DateUtil.parse(optIndividualSpecInfo.get()
                        .getIdPaper().getIdPaperDeliveryDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setLieudelivPiece(optIndividualSpecInfo.get()
                        .getIdPaper().getIdPaperDeliveryPlace());
                client.setDateValiditePiece(DateUtil.parse(optIndividualSpecInfo.get()
                        .getIdPaper().getIdPaperValidityDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setDateNaissance(DateUtil.parse(optIndividualSpecInfo.get()
                        .getBirth().getBirthDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setVilleNaissance(optIndividualSpecInfo.get().getBirth()
                        .getBirthCity());
                client.setPaysNaiss(optIndividualSpecInfo.get().getBirth()
                        .getBirthCountry().getDesignation());
                client.setSitmat(optIndividualSpecInfo.get().getIndividualGeneralInfo().getFamilyStatusCode().getDesignation());
                client.setNomMere(optIndividualSpecInfo.get().getOtherAttributes().getHolderMotherName());
                client.setTypePieceIdentite(optIndividualSpecInfo.get().getIdPaper().getType().getCode());
            }
            catch (Exception e) {
                log.error(e.getMessage());
            }
        }

        Optional<CorporateSpecInfo> optCorporateSpecInfo = Optional.ofNullable(customerDetailResponse.getSpecificInformation()
                .getCorporateSpecInfo());

        if(!optCorporateSpecInfo.isEmpty()) {
            try{
                client.setRaisonSociale(optCorporateSpecInfo.get().getCorporateGeneralInfo().getTradeNameToDeclare());
                client.setFormeJuridique(optCorporateSpecInfo.get().getCorporateGeneralInfo().getLegalFormCode()
                        .getDesignation());
                client.setSigle(optCorporateSpecInfo.get().getCorporateId().getAbbreviation());
                client.setRegistreCommerce(optCorporateSpecInfo.get().getLegalInformation().getTradeRegisterNumber());
                client.setNumeroPatente(optCorporateSpecInfo.get().getLegalInformation().getLicenseNumber());
                client.setValiditePatente(DateUtil.parse(optCorporateSpecInfo.get().getLegalInformation().getValidityDateOfLicense(),
                        DateUtil.DATE_HOUR_FORMAT_UP));
            }
            catch (Exception e) {
                log.error(e.getMessage());
            }
        }

        try{
            client.setSegment(customerDetailResponse.getGeneralAttributes().getSegment().getCode());
        }
        catch(Exception e) {
            client.setSegment("");
        }

        try{
            List<CustomerAddressDetail> adresse = customerDetailResponse.getAddressesDetail().getCustomerAddressDetail();
            if(!adresse.isEmpty()){

                client.setAdresse1(adresse.get(0).getAddressLine1());
                client.setAdresse2(adresse.get(0).getAddressLine2());
                client.setAdresse3(adresse.get(0).getAddressLine3());

            }
        }
        catch(Exception e){
            client.setAdresse1("");
            client.setAdresse2("");
            client.setAdresse3("");
        }

        client.setProfil(customerDetailResponse.getActiveProfile().getActiveProfile().getDesignation());
        client.setCodeProfil(customerDetailResponse.getActiveProfile().getActiveProfile().getCode());

        // TODO: Add Exception catching
        client.setAgenceClient(customerDetailResponse.getGeneralAttributes().getBranchCode().getDesignation());
        client.setCodeAgenceClient(customerDetailResponse.getGeneralAttributes().getBranchCode().getCode());


        client.setCodeGes(customerDetailResponse.getGeneralAttributes().getCustomerOfficer().getCode());
        client.setNomGes(customerDetailResponse.getGeneralAttributes().getCustomerOfficer().getName());


        // TODO: forme juridique, categorie interne, titre

        client.setCategorieInterne(customerDetailResponse.getGeneralAttributes().getInternalCategoryCode().getDesignation());
        client.setCodeCategorieInterne(customerDetailResponse.getGeneralAttributes().getInternalCategoryCode().getCode());

        client.setTitre(customerDetailResponse.getFreeFieldCode3().getCode());
        client.setCategorieBanqueCentrale(customerDetailResponse.getReportingAttributes().getEconomicAgentCode().getDesignation());
        client.setSecteurActivite(customerDetailResponse.getReportingAttributes().getActivityFieldCode().getDesignation());
        client.setPaysResidence(customerDetailResponse.getSituation().getCountryOfResidence().getDesignation());
        client.setUtiCreation(customerDetailResponse.getAdditionnalInformation().getUserWhoCreated());
        client.setDateCreation(DateUtil.parse(customerDetailResponse.getAdditionnalInformation().getCreationDate(),
                DateUtil.DATE_HOUR_FORMAT_UP));
        client.setUtiModification(customerDetailResponse.getAdditionnalInformation().getUserWhoInitiated());
        client.setDateModification(DateUtil.parse(customerDetailResponse.getAdditionnalInformation().getLastModificationDate(),
                DateUtil.DATE_HOUR_FORMAT_UP));

        try{
            List<CustomerFreeAttributeDetail> customerFreeAttributeDetail =  customerDetailResponse.getFreeAttributesDetail()
                    .getCustomerFreeAttributeDetail();

            client.setPrenomMere(customerFreeAttributeDetail.get(0).getAdditionalDataValue().getAlphanumeric());
            client.setPrenomPere(customerFreeAttributeDetail.get(3).getAdditionalDataValue().getAlphanumeric());
            client.setNomPere(customerFreeAttributeDetail.get(2).getAdditionalDataValue().getAlphanumeric());

        }
        catch(Exception e) {
            client.setPrenomMere("");
            client.setPrenomPere("");
            client.setNomPere("");
        }

        // TODO: raison sociale

        client.setRaisonSociale2("");


        client.setGroupe("");
        client.setNumeroIdentiteSociale("");
        client.setNumeroIdentiteFiscale("");
        client.setNumeroCasier("");

        try{
            client.setEmailClient(customerDetailResponse.getEmailAdresses().getCustomerEmailAddress().getEmail());
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

        client.setResidence("");
        client.setPaysResidence(customerDetailResponse.getSituation().getCountryOfResidence().getDesignation());



        client.setNom(customerDetailResponse.getLastname());
        client.setNomSimple(customerDetailResponse.getLastname());

        try{
            List<CustomerPhoneNumber> customerPhoneNumber = customerDetailResponse.getPhoneNumbers().getCustomerPhoneNumber();
            Optional<CustomerPhoneNumber> optCustomerPhoneNumber1 = Optional.ofNullable(customerPhoneNumber.get(0));
            Optional<CustomerPhoneNumber> optCustomerPhoneNumber2 = Optional.ofNullable(customerPhoneNumber.get(1));
            if(!optCustomerPhoneNumber1.isEmpty()) {
                client.setNumTelephone1(optCustomerPhoneNumber1.get().getPhoneNumber());
            }
            if(!optCustomerPhoneNumber2.isEmpty()) {
                client.setNumTelephone2(optCustomerPhoneNumber2.get().getPhoneNumber());
            }
        }
        catch(Exception e){
            client.setNumTelephone1("");
            client.setNumTelephone2("");
        }

        client.setTelDir("");
        client.setEmailDir("");
        client.setProfession("");
        client.setRevenu("");
        client.setRegimeMat("");
        client.setEmployeur("");

        // TODO request to specificInformation->individualSpecInfo->family->spouseCode
        client.setNomConjoint("");
        try {
            client.setDateNaissanceConj(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
        }
        catch(Exception e){
            log.info(e.getMessage());
        }
        client.setVilleNaissanceConj("");

        // TODO: lien cotitulaires de comptes
        client.setTypeLienCotitu("");
        client.setNumCompte("");

        // TODO: raison sociale
        //client.setRaisonSocial("");
        client.setSiegeSocial("");
        client.setSecteurActivite("");
        client.setNumImmatri("");
        client.setLieuImmatri("");
        client.setAutoriteImm("");
        client.setNumIdentSocial("");
        client.setNumContribuable("");
        client.setLieuNumContri("");
        client.setNumPatente("");
        client.setLieuNumPatente("");

        client.setNumeroStatistique(customerDetailResponse.getGeneralAttributes().getStatisticNumber());

        try{
            client.setDateImmatri(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateNumContri(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateValPatente(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

        try{
            client.setChiffreAffaire(Double.parseDouble(""));
        }
        catch(Exception e){
            client.setChiffreAffaire(0.0);
        }
        try{
            client.setEffectif(Integer.parseInt(""));
        }
        catch(Exception e){
            client.setEffectif(0);
        }

        client.setOrigineFonds("");
        client.setTel("");
        client.setSiteWeb("");
        client.setFax("");
        client.setLocalisation1("");
        client.setLocalisation2("");
        client.setVille("");
        client.setNomContact("");
        client.setPrenomContact("");
        client.setTelContact("");
        client.setEmailContact("");
        client.setNomDir1("");
        client.setNationaliteDir1("");
        client.setTypePieceDir1("");
        client.setNumeroPieceDir1("");
        client.setLieudelivPieceDir1("");

        try{
            client.setDateDelivPieceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateValiditePieceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateNaissanceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
        }
        catch(Exception e) {
            log.error(e.getMessage());
        }
        client.setVilleNaissanceDir1("");
        client.setPaysNaissDir1("");
        client.setNumTelephoneDir1("");
        client.setEmailDir1("");
        client.setIntituleDir1("");
        client.setFonctionDir1("");
        client.setNomDir2("");
        client.setNationaliteDir2("");
        client.setTypePieceDir2("");
        client.setNumeroPieceDir2("");
        client.setLieudelivPieceDir2("");

        try{
            client.setDateDelivPieceDir2(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateValiditePieceDir2(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
            client.setDateNaissanceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
        }
        catch(Exception e){
            log.error(e.getMessage());
        }
        client.setVilleNaissanceDir2("");
        client.setPaysNaissDir2("");
        client.setNumTelephoneDir2("");
        client.setEmailDir2("");
        client.setIntituleDir2("");
        client.setFonctionDir2("");
        client.setDateDelivPieceDir1Modif("");
        client.setDateValiditePieceDir1Modif("");
        client.setDateNaissanceDir1Modif("");
        client.setDateDelivPieceDir2Modif("");
        client.setDateValiditePieceDir2Modif("");
        client.setDateNaissanceDir2Modif("");
        client.setAutresContact(new ArrayList<>());
        client.setAutresDirigeants(new ArrayList<>());
        client.setTaxable(customerDetailResponse.getGeneralAttributes().isTaxableCustomer());

        return client;
    }
}
