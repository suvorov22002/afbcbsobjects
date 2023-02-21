package com.afriland.cbsobjects.utils;


import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Base64;

// TODO: Auto-generated Javadoc
/**
 * Implementation de l'Interface Responsable du chiffrement et du dechiffrement.
 * 
 * @author Francis KONCHOU
 * @version V1
 */
public class Encrypter {

	/** La cle de cryptage. */
	//private String stringKey = "MuranoSakazakipapylus";
	private String stringKey = "sakazaki";

	/** Le cipher. */
	private Cipher cipher;

	/** Le Digester. */
	private MessageDigest digester;

	/** Instance unique de l'Encrypter. */
	//*** private static Encrypter _instance = null;



	/**
	 * Constructeur prive.
	 */
	public Encrypter(){

		try {

			// Initialisation du Digester
			digester = MessageDigest.getInstance("MD5");

			// Initialisation du Cipher
			cipher = Cipher.getInstance("DES");

		}catch(NoSuchAlgorithmException e){

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);
		} catch (NoSuchPaddingException e) {
			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Factory de l'Encrypter.
	 * 
	 * @return Encrypter
	 */
	/* public  static Encrypter getInstance() {

		// Si l'instance est nulle
		if(_instance == null) {

			// Instanciation
			_instance = new Encrypter();
		}

		// On retourne l'instance
		return _instance;
	}*/


	/**
	 * Methode de decryptage d'un texte.
	 * 
	 * @param text
	 *            Texte a decrypter
	 * @return Texte decrypte
	 */
	public  String decryptText(String text) {


		byte[] byteText = null;

		try {

			// Mise en mode Decrypt
			cipher.init(Cipher.DECRYPT_MODE, this.createDESSecretKey(stringKey));

			// Obtention des bytes
			byte[] encodedByteText = Base64.decodeBase64(text);
			//			byte[] encodedByteText = new BASE64Decoder().decodeBuffer(text);

			// Decryption
			byteText = cipher.doFinal(encodedByteText);

		} catch (InvalidKeyException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (IllegalBlockSizeException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (BadPaddingException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

			//		} catch (IOException e) {

			// On relance l'exception
			//			e.printStackTrace();
			//			throw new IllegalStateException(e);
			//
		}	

		// Retour de la chaine
		return new String(byteText);
	}

	/**
	 * Methode d'encryptage d'un texte.
	 * 
	 * @param text
	 *            Texte a encrypter
	 * @return Texte encrypte
	 */
	public  String encryptText(String text) {

		String value = null;

		try {
			// Mise en mode Encrypt
			cipher.init(Cipher.ENCRYPT_MODE, this.createDESSecretKey(stringKey));

			// Obtention des bytes
			byte[] byteText = text.getBytes();

			// Encodage
			byte[] encodedByteText = cipher.doFinal(byteText);

			// Retour de la chaine encodee
			//			value = new BASE64Encoder().encode(encodedByteText);
			value = Base64.encodeBase64String(encodedByteText);

		} catch (InvalidKeyException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (IllegalBlockSizeException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (BadPaddingException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		}

		return value;

	}

	/**
	 * Methode de hachage d'un texte.
	 * 
	 * @param text
	 *            Texte a hacher
	 * @return Texte hache
	 */
	public  String hashText(String text) {

		// Hachage du texte
		//		return new BASE64Encoder().encode(digester.digest(text.getBytes()));
		return Base64.encodeBase64String(digester.digest(text.getBytes()));
	}

	/**
	 * Methode de generation de cle prives sur la base d'un mot de passe.
	 * 
	 * @param keytext
	 *            the keytext
	 * @return the secret key
	 */
	private SecretKey createDESSecretKey(String keytext){

		SecretKey secretKey = null;

		try {

			// Generation de la cle DES basees sur une mot de passe
			DESKeySpec desKeySpec = new DESKeySpec(keytext.getBytes());

			// On retourne la cle DES
			secretKey =  SecretKeyFactory.getInstance("DES").generateSecret(desKeySpec);

		} catch (InvalidKeyException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (InvalidKeySpecException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		} catch (NoSuchAlgorithmException e) {

			// On relance l'exception
			//			e.printStackTrace();
			throw new IllegalStateException(e);

		}

		return secretKey;
	}
}
