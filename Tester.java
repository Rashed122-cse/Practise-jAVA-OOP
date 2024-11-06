
 class Teachers {
    String name , gender ;
    int phn  ;

    //method
  /*  void setInformation(String n , String g , int ph){
        name = n ;
        gender = g ;
        phn = ph ;

    }*/

     Teachers(String n , String g , int ph){
         name = n ;
         gender = g ;
         phn = ph ;
     }


    //METHOD
    void displayInformation (){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phn);
        System.out.println("");
    }
}



public class Tester {
    public static void main(String[] args) {

        Teachers teachers1 = new Teachers("Rashed" , "male" , 1639592905) ;
        teachers1.displayInformation();

       // teachers1.name = "RASHED" ;
       // teachers1.gender = "Male" ;
        //teachers1.phn = 1639592905 ;
        // new1


        //new2
       // teachers1.setInformation("Rashed" , "male" , 1639592905);

        // old1
       // System.out.println("Teacher Name : " + teachers1.name);
        //System.out.println("Teacher Gender : " + teachers1.gender);
        //System.out.println("Teacher Phone Number : " + teachers1.phn);

       // Teachers teachers2 = new Teachers() ;

      //  teachers2.name = "Zaman" ;
        //teachers2.gender = "Male" ;
        //teachers2.phn = 1590099154 ;
        // new1
        //teachers2.displayInformation();

        //new2
       // teachers2.setInformation("Roman" ,"male" ,1590099154 );

      //  System.out.println("Teacher Name : " + teachers2.name);
        //System.out.println("Teacher Gender : " + teachers2.gender);
        //System.out.println("Teacher Phone Number : " + teachers2.phn);
    }
}