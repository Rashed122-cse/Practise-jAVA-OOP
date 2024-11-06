package OverloadingC;

public class Teacher {

    String name , gender ; 
    int phn  ;

    Teacher(){
        System.out.println("no information");
    }
    
    Teacher(String n, String g ){
        name = n ;
        gender = g ;
    }
    
    Teacher(String n, String g, int ph){
    
     name = n ;
     gender = g ;
     phn = ph ;
    }

    void displayInformation (){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phn);
    }
}
