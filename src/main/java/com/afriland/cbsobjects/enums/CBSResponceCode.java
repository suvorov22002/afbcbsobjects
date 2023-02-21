package com.afriland.cbsobjects.enums;

public enum CBSResponceCode {
	
	/** Compte Bancaire Fermé. */
	BANK_ACCOUNT_LOOK, 
	
	/** Debit Non authorise sur le Compte Bancaire */
	BANK_ACCOUNT_UNDEBIT, 
	
	/** Debit Non authorise sur le Compte Bancaire */
	BANK_PHONE_ERROR, 
	
	/** SUCCESS. */
	SUCCESS, 

	/** ERROR. */
	ERROR, 
	
	TRANSFER_NOT_FOUND,
		
	/** Souscription en cours doit être finalisé pour autoriser les opérations */
	SUBSCRITION_PROCESSING, 
	
	/** abonnement inconnu. */
	UNKNOWN_SUBSCRIBER, 
	
	/** abonnement inconnu. */
	PARAMETER_SUBSCRIBER_BRANCH, 
	
	INCORRECT_PASSWORD,
	
	/** Error lors de l envoi Flash Transfert */
	SENTFT_TRANSACTION_EXIST, 
	
	/** Le numero de compte n'appartient pas à l'abonne */
	UNKNOWN_SUBSCRIBER_ACCOUNT, 
	
	ERROR_SUBSCRIBER_ACCOUNT, 
	
	ERROR_ACCOUNT_EXIST, 
	
	/** code secret obligatoire pour les receptions Flash Transfert */
	SECRETCODE_REQUIRED,
	
	/** Code secret errone. */
	SECRETCODE_BAD,
	
	/** Compte du Partenaire inconnu pour les envois FlashTransfert */
	MISSING_SUBSCRIBER_PARTNER_ACCOUNT, 
	
	/** Partenaire inconnu pour les envois FlashTransfert */
	UNKNOWN_SUBSCRIBER_PARTNER, 
	
	/** Transfert incomplet opération annulée */
	UNCOMPLET_TRANSFERT,
	
	/** Solde insuffisant . */
	ACCOUNT_BALANCE, 
	
	/** Compte de l'abonne bloqué */
	ACCOUNT_LOOK, 
	
	/** Compte de l'abonne bloqué */
	ACCOUNT_SUSPEND, 

	/** Erreur lors du traitement cote Bank */
	BANK_ERROR, 

	/** Processus de fin de journée en cours */
	EOD_PROCESS;

}
