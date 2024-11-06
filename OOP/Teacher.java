package OOP;

public class Teacher {
    String name , gender ;
    int phn  ; 

    Teacher(String na , String ge , int pho ){
        name = na;
        gender = ge ;
        phn = pho ;
    }
    void setInformation(String n , String g , int ph){
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
