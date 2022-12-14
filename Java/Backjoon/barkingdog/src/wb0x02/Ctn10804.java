package wb0x02;
// 카드 역배치 -- 입출력은 같으나 틀림, 분석하고 다시 제출
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn10804 {

    public static void main(String[] args) throws Exception {

        // Input Data
        FastReader fr = new FastReader();

        int[] arr = new int[20];

        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }

        int start;
        int end;

        for(int i = 0; i < 10; i++) {

            start = fr.nextInt() - 1;
            end = fr.nextInt() - 1;


            int num = (Math.abs(start - end + 1) / 2);
            int cnt = 0;

            for(int j = 0; j < num; j++) {
                int temp = arr[start + cnt];
                arr[start + cnt] = arr[end - cnt];
                arr[end - cnt] = temp;
                cnt++;
            }

        }

        for(int rt : arr) {
            System.out.print(rt + " ");
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