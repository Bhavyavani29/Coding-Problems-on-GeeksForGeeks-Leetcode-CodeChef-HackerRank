import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0;i < N;i++){
                A[i] = sc.nextInt();
            }
            int max = A[0];
            for(int i = 1;i < N;i++){
                if(A[i] > max){
                    max = A[i];
                }
            }
            System.out.println(max);
        }
	}
}
