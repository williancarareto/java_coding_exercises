package com.techreturners.exercise002;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise002 {

    public boolean isFromManchester(Person person){
        // Add your code here
        if(person.getCity().equals("Manchester")){
            return true;
        } 
            return false;
    }     
    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        if(person.getAge()){
            return true;
        }
        return false;
    }  
}
