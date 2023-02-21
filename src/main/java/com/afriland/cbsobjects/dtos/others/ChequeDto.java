package com.afriland.cbsobjects.dtos.others;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChequeDto {


    /**
     * Numero de la demande dans Delta
     */
	private String numDemande;
    
    /**
     * Date de la demande
     */
    private Date dateDemande;
    
    /**
     *  Nom du client (36)
     */
    private String customerName;
    
    /**
     *  Addresse du client (30)
     */
    private String customerAddress;
    
    /**
     *  ville du client (30)
     */
    private String customerTown;
    
    /**
     *  Code banque (5)
     */
    private String bankCode;
    
    /**
     *  Code Agence (5)
     */
    private String branchCode;
    
    /**
     *  Nom de l'agence (30)
     */
    private String branchName;
    
    /**
     *  Adresse de l'agence (36)
     */
    private String branchAddress;
    
    /**
     *  Telephone de l'agence (20)
     */
    private String branchTelephone;
    
    /**
     *  Code devise du compte (3)
     */
    private String currencyCode;
    
        
    /**
     *  N de compte (11)
     */
    private String accountNumber;
    
    /**
     *  Cle de compte (2)
     */
    private String clc;
    
    
    /**
     *  Nbre de carnets demandes
     */
    private Integer quantity = 1;

	
}
