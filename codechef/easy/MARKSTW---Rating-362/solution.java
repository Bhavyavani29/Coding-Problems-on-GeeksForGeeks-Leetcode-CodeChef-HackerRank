import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Checking if Alice's marks are at least twice of Bob's marks
        if (x >= 2 * y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close(); // Good practice to close the scanner
    }
}