package com.afriland.cbsobjects.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Format Nombre 
 * @author Owner
 *
 */
public class FormatNumber {
	
	protected static NumberFormat formatter = java.text.NumberFormat.getInstance(java.util.Locale.FRENCH); 
	protected static DecimalFormatSymbols symbols = new DecimalFormatSymbols(java.util.Locale.FRENCH);
	protected static String pattern = "##,###";

	public static FormatNumber getInstance(){
		return new FormatNumber();
	}
	
	public String format(Double value){
		symbols.setDecimalSeparator(' ');
		symbols.setGroupingSeparator(' ');
		DecimalFormat formatter = new DecimalFormat(pattern, symbols);
		//DecimalFormat formatter = new DecimalFormat(pattern);
		formatter.setGroupingSize(3);		
		return formatter.format(value);
	}
	
}
