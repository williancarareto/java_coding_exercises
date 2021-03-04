package com.techreturners.exercise001;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        

        return "";
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
                
        DecimalFormat df = new DecimalFormat("0.00");
        double vatAddedPrice = Double.valueOf(df.format(originalPrice + (originalPrice * (vatRate / 100))));
		return vatAddedPrice;
    }

    public String reverse(String sentence) {
        // Add your code here

        return sentence;
    }

    public int countLinuxUsers(List<User> users) { 
        // Add your code here
        List<User> linuxUsers = new ArrayList<User>();
			for (User u : users) {
			if (u.getType().compareToIgnoreCase("Linux") == 0) {
				linuxUsers.add(u);
			}
		}
		return linuxUsers.size();
	}
    
}
