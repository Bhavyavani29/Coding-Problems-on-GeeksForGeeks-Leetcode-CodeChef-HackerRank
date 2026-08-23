import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take length and width as input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = calculateArea(length, width);
        System.out.println(area);    
    }
    
    public static int calculateArea(int length, int width) {
        // Complete this method
        return (length * width);
    }
}