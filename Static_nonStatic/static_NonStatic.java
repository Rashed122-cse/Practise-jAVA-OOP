package Static_nonStatic;

public class static_NonStatic {
    public static void main(String[] args) {
        
        //////static and nonstatic calling

        //// Calling the static method
        Static.displayStaticCount();

        ////Calling none static method
        //to call none static method first have to create an object
        nonStatic obj1 = new nonStatic ();
        obj1.displayNonStaticCount();

    }
}
