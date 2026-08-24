import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }

        }
    }

        public static boolean isEven(int num) {
            // Complete this method 
            return num % 2 == 0;
        }
    }