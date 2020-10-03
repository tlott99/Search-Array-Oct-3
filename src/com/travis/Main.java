package com.travis;

public class Main {
    public static String[] animals = {"Bear", "Cat", "Dog", "Cow", "Pig", "Wolf"};
    public static int yes = 0;
    public static void main(String[]args){
        String w = "Cow";
        for (int i = 0; i < animals.length; i ++){
            if(animals[i].equals(w)){
            yes++;}
        }
        if (yes > 0){
            System.out.println("animals has the word " + w + " in it");
        }
        else{
            System.out.println("animals does not have the word " + w + " in it");
        }
    }
}
