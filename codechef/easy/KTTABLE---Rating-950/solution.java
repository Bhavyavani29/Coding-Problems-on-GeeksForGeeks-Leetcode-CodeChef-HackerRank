import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T--> 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                int allocatedTime = 0;
                if (i == 0) {
                    allocatedTime = A[i];
                }
                else {
                    allocatedTime = A[i] - A[i - 1];
                }
                if (B[i] <= allocatedTime) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}