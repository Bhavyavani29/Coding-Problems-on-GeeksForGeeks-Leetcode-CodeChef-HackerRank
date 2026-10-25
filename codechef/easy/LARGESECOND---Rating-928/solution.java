import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for(int i = 0; i <n;i++){
                if(a[i] > max1){
                    max2 = max1;
                    max1 = a[i];
                    
                }
                else if(a[i] > max2 && a[i] != max1){
                    max2 = a[i];
                }
            }
            int sum = max1 + max2;
            System.out.println(sum);
        }
    }
}
