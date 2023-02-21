package com.afriland.cbsobjects.dtos.customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yves LABO 
 */
public class ContactCli implements Comparable<ContactCli>{
    private String nomContact;
    private String prenomContact;
    private String telContact;
    private String emailContact;
    private int point;

    public ContactCli() {
    }

    public ContactCli(String nomContact, String prenomContact, String telContact, String emailContact) {
        this.nomContact = nomContact;
        this.prenomContact = prenomContact;
        this.telContact = telContact;
        this.emailContact = emailContact;
    }
    
    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getPrenomContact() {
        return prenomContact;
    }

    public void setPrenomContact(String prenomContact) {    
        this.prenomContact = prenomContact;
    }

    public String getTelContact() {
        return telContact;
    }

    public void setTelContact(String telContact) {
        if(telContact != null && telContact.length() > 4){
            this.telContact = telContact;
            point++;
        }
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        if(emailContact != null && emailContact.length() > 1){
            this.emailContact = emailContact;
            point++;
        }
    }

    public int getPoint() {
        return point;
    }

    @Override
    public int compareTo(ContactCli o) {
        return this.point - o.point;
    }
    
}

