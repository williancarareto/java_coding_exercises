package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person){
        // Add your code here
        return person.getCity().equals("Manchester"); 
    }     

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        return person.getAge()>=ageLimit;
    }  
}

