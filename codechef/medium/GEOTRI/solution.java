import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println(-1);
            return;
        }

        long[] A = new long[N];
        HashSet<Long> values = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            values.add(A[i]);
        }

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[j] % A[i] != 0) continue;

                long ratio = A[j] / A[i];
                // Check potential overflow before multiplying
                if (A[N - 1] / ratio < A[j]) {
                    break; // third would exceed A[N-1]
                }

                long third = A[j] * ratio;

                if (values.contains(third)) {
                    sb.append(A[i]).append(" ").append(A[j]).append(" ").append(third).append("\n");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        } else {
            System.out.print(sb.toString());
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            String s = next();
            return s == null ? -1 : Integer.parseInt(s);
        }

        long nextLong() {
            String s = next();
            return s == null ? -1L : Long.parseLong(s);
        }
    }
}