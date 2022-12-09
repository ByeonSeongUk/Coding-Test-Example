package wb0x02;
// 별 찍기 - 4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 조건 2개를 잘 생각 - 홀수로 오름 차순 -> 2n - 1, 나머지 앞에칸 빈칸 -> n / 2 - 1
public class Ctn2442 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int n = fr.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for(int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");


            System.out.println();
        }

    }
    // 1 3 5 7 9
    //
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}