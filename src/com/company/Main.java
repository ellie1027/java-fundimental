package com.company;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //every java program should have this
    //main entry point to execute program
    public static void main(String[] args) {
        // write your code here
        // comment
        System.out.println("Hooray my first java program");
        //java variable ) primitive type or reference type
        //primitive type
        int number = 100; //long, double
        String brand = "Amigoscode";
        //reference type(more complex than primitive type
        Date date = new Date();

        //primitive data type
        //number
        byte theByte = -128; //1byte
        short theShort = 8_989; //2 bytes
        int theInt = 787_839_893; //4 bytes millions
        long theLong = 78_234_252_343L; // 8 bytes billions

        float pi = 3.14F;
        double doublePi = 3.1415;
        boolean isAdult = true;

        char nameInitial = 'A'; //single quote

        //reference type
        String name = new String("Amigoscode");
        int age = 20;
        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now);

        //difference  between primitives and reference types
        int a = 10;
        int b = a; //copy of a
        a = 100;
        //because of difference memory address, values were not same in primitives type
        System.out.println(a + " - " + b);


        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before");
        System.out.println(alex.name + " " + mariam.name);

        mariam.name = "Mariam";

        System.out.println("after");
        System.out.println(alex.name + " " + mariam.name);

        //they pointing same reference!!(Person) so name is changing together

        //String class

        //name2 is an object of type String
        String name2 = "amigoscode";
        //.toUpperCase is a behavior(method)
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1)); //character index
        String code = new String("code");
        System.out.println(name2.contains(code)); //character index
        System.out.println(name2.equals(code));

        //Packages and Import Keyword
        Date date2 = new Date();
        java.sql.Date date3 = new java.sql.Date(1);
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //Reserved Keywords

        //Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = ten + two;

        System.out.println(addition);
        System.out.println(10 - 2);
        // Bodmas
        System.out.println(10 * (2+7) - 4.5);
        System.out.println(10 % 2);

        // Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(2.5,3.7));
        System.out.println(Math.min(2.5,3.7));
        System.out.println((int) Math.pow(5.0,2.0));

        System.out.println(Math.sqrt((25)));
        System.out.println((int) Math.sqrt(25));

        System.out.println(Math.PI);

        //Comparison Operators
        int khalidAge = 20;
        int mariamAge = 20;

        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;

        System.out.println(khalidAge > mariamAge);
        System.out.println(khalidAge < mariamAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge);
        System.out.println(khalidAge >= mariamAge);
        System.out.println(khalidAge <= mariamAge);

        //Logical Operators
        boolean isAdult2 = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;

        System.out.println(isAdult2 && isStudent);
        System.out.println(isAdult2 || isStudent);
        System.out.println((isAdult2 &&  isStudent) && !isAmigoscodeMember);
        System.out.println(isAdult2 != true);
        System.out.println(10 > 8 || 2 <= 2 && isAdult2);

        //if statements
        int age3 = 17;

        if(!(age3 >= 18)){
            System.out.println("Hooray...I am an adult");

        } else if(age  == 16) {
            System.out.println("I am not an adult");
        }


        //Ternary Operator
        String message = age > 18 ? "Hooray.." : "not adult";

        //Switch statements
        String gender = "da";

        if(gender.equals("FEMALE")){

        }else if(gender.equals("MALE")){

        }else if(gender.equals("PREFER_NOT_SAY")){

        }else{

        }

        //just single value
        switch(gender.toUpperCase()){
            case "FEMALE" :
                System.out.println("I am a female");
                break; //java 12 dont need this
            case "MALE" :
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY" :
                System.out.println("prefer not say");
                break;
            default :
                System.out.println("Unknown gender");
        }

        //Arrays
        int zero = 0;
        int one = 1;
        int [] numbers = new int[2];
        boolean [] boo = new boolean[5];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(boo));

        //Enhanced for Loop
        Arrays.stream(numbers).forEach(System.out::println);

        //break and continue
        System.out.println(name);

        //while loop
        int count = 0;

        while(count <= 20) {
            System.out.println("hi");
            count++;
        }

        int count2 = 21;

        //do while loop
        do {
            System.out.println("hi iii");
            count2++;
        }while(count2 <= 20);

        //Scanner class
        //user input console
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("What is your name?");
        //String userName = scanner.nextLine();
        //int age2 = scanner.nextInt();
        //int year = LocalDate.now().minusYears(age2).getYear();

        //System.out.println("Hello " + userName);

        //methods
        //only runs when its called
        //use to perform any logic
        //what is methods ? println, toUpperCase
        System.out.println("Hello this is parameter");
        String brand2 = "Samsung";
        System.out.println(brand2.toUpperCase());
        boolean startsWithS =brand2.startsWith("S");
        System.out.println(brand2.endsWith("s"));

        //understanding Methods
        //own methods
        char[] letters = {'A','A','B','C','D','D','D'};

        int cnt = countOccurrences(letters, 'D');
        System.out.println(cnt);

        //classes and object
        //class ) blueprint to create anything that you want(object)
        //one class makes different objects
        //creating classes
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);

        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true);

        Lens lensThree = new Lens(
                "canon",
                "24-70mm",
                false);


        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);

        Passport ukPassport = new Passport(
                "1234", "UK", LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport(
                "5678", "US", LocalDate.of(2027, 12, 11));


    }

    //user defined methods
    //public means this method is accessible by other classes
    //static means this method belongs this class
    //int meas this method return number
    public static int countOccurrences(
            char[] letters, char searchLetters){
        int cnt = 0;
        for(char letter : letters){
            if(letter == searchLetters){
                cnt++;
            }
        }
        return cnt;
    }


    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }

    //template
    static class Lens {
        //properties of this class
        String brand ;
        String focalLength;
        String model;
        String colour;
        double price;
        double weight;
        boolean isPrime;

        //structure
        Lens(String brand,
             String focalLength,
             boolean isPrime) {

            //this ) current instance of current class
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;

        }
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

}
