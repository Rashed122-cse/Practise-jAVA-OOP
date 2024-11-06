import java.util.Scanner;

class Box {
    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double volume = height * width * depth;
        System.out.println("Volume is: " + volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the first box
        System.out.println("Enter dimensions for the first box:");
        System.out.print("Height: ");
        double h1 = scanner.nextDouble();
        System.out.print("Width: ");
        double w1 = scanner.nextDouble();
        System.out.print("Depth: ");
        double d1 = scanner.nextDouble();
        
        // Creating the first box object
        Box box1 = new Box(h1, w1, d1);

        // User input for the second box
        System.out.println("Enter dimensions for the second box:");
        System.out.print("Height: ");
        double h2 = scanner.nextDouble();
        System.out.print("Width: ");
        double w2 = scanner.nextDouble();
        System.out.print("Depth: ");
        double d2 = scanner.nextDouble();
        
        // Creating the second box object
        Box box2 = new Box(h2, w2, d2);

        // Displaying the volumes
        box1.displayVol();
        box2.displayVol();

        scanner.close();
    }
}
