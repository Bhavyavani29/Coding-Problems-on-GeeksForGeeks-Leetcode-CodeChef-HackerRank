import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int N = Integer.parseInt(line.trim());

        long[] A = new long[N];
        long totalSum = 0;
        long curScore = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
            totalSum += A[i];
            curScore += (long)i * A[i];
        }

        long maxScore = curScore;

        for (int k = 1; k < N; k++) {
            curScore = curScore - totalSum + (long)N * A[k - 1];
            if (curScore > maxScore) {
                maxScore = curScore;
            }
        }

        System.out.println(maxScore);
    }
}