package com.afriland.cbsobjects.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Format String  
 * @author Yves LABO
 *
 */
public class FormatString {
	
	 public static int LEFT = 1;
	    public static int RIGHT = 2;
	    public static int TAILLE_CODE_EVE = 6;
	    public static int PHONES_LENGTH = 12;
	    public static String PHONES_MASK = "2376";
	    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH':'mm");
	    public static SimpleDateFormat sdf_DATE = new SimpleDateFormat("dd/MM/yyyy");
	    public static SimpleDateFormat sdf_HOUR = new SimpleDateFormat("HH':'mm");
	    
	   
	 
	    /**
	     * 
	     * @param text
	     * @param direction
	     * @param lenght
	     * @param addString
	     * @return
	     */
	    public static String padText(String text, int direction, int lenght, String addString ){
	        
	        String s = text;
	        
	        if(s == null){
	            
	            for(int i=1; i<=lenght; i++) s += addString;
	            
	        }else{
	            
	            if(s.length() < lenght){
	                
	                while(s.length() < lenght){
	                    s = direction == LEFT ? addString + s : s + addString;
	                }
	                
	            }
	            
	        }
	        
	        s = s.substring(0, lenght);
	        
	        return s;
	    }
	    
	    
	        
	    public static String getCode(){
	        return new SimpleDateFormat("ddMMyyhhmmss").format(new java.util.Date());
	    }
	         
	    public static String getCode2(){
	        return new SimpleDateFormat("ddMMyy").format(new java.util.Date());
	    }
	       
	    
	    
	    public static String espacement(double montant){
	        try{
	            return espacement(new DecimalFormat("#0.###").format(new BigDecimal(montant)).replaceAll(",", "."));
	        }catch(Exception e){
	            return "0";
	        }
	    }


	    public static String espacement(String mnt){
	        try{
	        if(mnt.isEmpty()) return "0";
	        String partieDeci = ((mnt.indexOf(".")>=0)?(mnt.substring(mnt.indexOf("."), mnt.length()) ):(""));
	        if(mnt.indexOf(".")>=0) mnt = mnt.substring(0, mnt.indexOf("."));
	        if(mnt.indexOf(" ")>=0) mnt = mnt.replaceAll(" ", "");
	        
	        if(mnt.length()<=3){
	            return mnt + partieDeci;
	        }else{
	            
	            int nbreParties = ((mnt.length()%3)==0)?( (int)Math.ceil( (mnt.length()/3)  ) ):(  (int)Math.ceil(Double.parseDouble( String.valueOf( (mnt.length()/3) ).split(",")[0] + ".8" ))    );
	            //System.out.println("Montant : " + mnt + ", nbre de parties = " + nbreParties);
	            int i=0; String s = "";
	            while(i<nbreParties && mnt.length()>0){
	                s = " " + mnt.substring( ((mnt.length()>=3)?(mnt.length()-3):(0)) , mnt.length()) + s;
	                mnt = mnt.substring(0, ((mnt.length()>=3)?(mnt.length()-3):(mnt.length())) );
	                i++;
	            }
	            if(s.startsWith(" ")) s = s.substring(1, s.length());
	            return s + partieDeci;
	        }
	        }catch(Exception e){
	            e.printStackTrace();
	            return mnt;
	        }
	    }

	    
	    public static long getNbreJoursBetween(Date date1, Date date2){
	        if(date1 == null || date2 == null) return 0;
	        return (date2.getTime() - date1.getTime()) / (long)(1000 * 60 * 60 * 24);
	    }
	
}
