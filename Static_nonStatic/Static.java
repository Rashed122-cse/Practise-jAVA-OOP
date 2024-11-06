package Static_nonStatic;

 class Static {
     // Static variable 
     static int staticCount = 0;

     // Static block
     static {
         System.out.println("Static block executed.");
         staticCount = 10;
     }

     public Static() {
         staticCount++;
     }
     // Static method
     public static void displayStaticCount()
     {
         System.out.println("Static count: " + staticCount);
     }
}
