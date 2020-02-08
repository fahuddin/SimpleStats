import java.util.*;


public class SimpleStats {

    public static void printMenu() {
        System.out.println("(0) Enter new numbers");
        System.out.println("(1) Find the largest");
        System.out.println("(2) Compute the sum");
        System.out.println("(3) Compute the range (largest - smallest)");
        System.out.println("(4) Compute the average");
        System.out.println("(5) Print the numbers in ascending order");
        System.out.println("(6) Quit");
        System.out.println();
    }
    
    /*** PUT YOUR SEPARATE HELPER METHODS FOR OPTIONS 1-5 HERE ***/

   //gets the smallest integer
    public static int smallest(int n1, int n2, int n3) {
        int x = n1;
        for (int i = 0; i <= 3; i++) {
            if (x > n2) {
                x = n2;
            } else if (x > n3) {
                x = n3;
            }

        }
        return x;
    }

// Find the largest integer
    public static int largest(int n1,int n2, int n3){
        int x = n1;
        for (int i = 0; i <= 3; i++){
            if (x < n2){
                x = n2;
            }else if (x < n3) {
                x = n3;
            }
        }
        return x;
    }
//Find the sum of the integers
    public static int sum(int n1, int n2, int n3){
        int result = n1 + n2 + n3;
        return result;

    }
//Compute the median of the integers
    public static int middle(int n1,int n2, int n3) {
        if (n1 != largest(n1, n2, n3) && (n1 != smallest(n1, n2, n3))) {
            return n1;
        } else if (n2 != largest(n1, n2, n3) && (n2 != smallest(n1, n2, n3))) {
            return n2;
        } else if (n3 != largest(n1, n2, n3) && (n3 != smallest(n1, n2, n3))) {
            return n3;
        }
        return n1;
    }



    //Compute the range (largest - smallest)
    public static int range(int n1, int n2, int n3) {

        int x = largest(n1, n2, n3);
        int y = smallest(n1, n2, n3);
        int z = x - y;
        return z;
    }
    //compute the average of the integers
    public static double average(int n1, int n2, int n3){
        double n = 3;
        double z = sum(n1,n2,n3);
        double x = z/n;
        return x;
    }
    //print the ascending order of the integers
    public static void printAscending(int n1,int n2,int n3){
        int x = smallest(n1,n2,n3);
        int y = largest(n1,n2,n3);
        int z = middle(n1,n2,n3);
        System.out.println(x + " " + z + " "  + y);

    }


    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        

        // the three integers
        int n1 = 2;
        int n2 = 4;
        int n3 = 6;

        boolean more_input = true;
        
        do {
            System.out.print("The current numbers are: ");
            System.out.println(n1 + " " + n2 + " " + n3);

            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();


            if (choice == 0) {
                System.out.print("Enter three new numbers: ");
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                n3 = scan.nextInt();
            } else if(choice == 1) {
                System.out.print("The largest of the number: " + largest(n1,n2,n3));
            }
            else if(choice == 2) {
                System.out.print("The sum of the numbers is " + sum(n1,n2,n3));
            }
            else if(choice == 3){
                System.out.print("The range of the numbers is " + range(n1,n2,n3));
            }
            else if(choice == 4){
                System.out.print("The average of the numbers is " + average(n1,n2,n3));
            }
            else if(choice == 5) {
                printAscending(n1,n2,n3);
            } else if (choice == 6) {
                more_input = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (more_input);
        
        System.out.println("Have a nice day!");
    }
}
