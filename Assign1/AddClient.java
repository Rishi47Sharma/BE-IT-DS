import java.rmi.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String args[]) {
        try {
            // Get reference to the remote object
            String addServerURL = "rmi://localhost/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

            // Read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double d1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double d2 = scanner.nextDouble();

            // Invoke remote method to add numbers
            System.out.println("The sum is: " + addServerIntf.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
