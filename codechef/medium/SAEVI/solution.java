import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0;i < N;i++){
		    A[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0;i < N; i = i + 2){
		    if(A[i] > 2 * K){
		        sum += A[i];
		    }
		}
		System.out.println(sum);

	}
}
