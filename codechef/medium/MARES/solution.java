import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int start = (N - K) / 2;
        int end = start + K - 1;

        long sum = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());

                boolean border =
                    i == 0 || i == N - 1 || j == 0 || j == N - 1;

                boolean diagonal =
                    Math.abs(i - j) <= 1;

                boolean central =
                    i >= start && i <= end &&
                    j >= start && j <= end;

                if (border || diagonal || central) {
                    sum += x;
                }
            }
        }

        System.out.println(sum);
    }
}