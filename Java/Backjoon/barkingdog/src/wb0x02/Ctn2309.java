package wb0x02;
// 일곱 난쟁이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ctn2309 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        final int ARR_LENGTH = 9;

        int[] a = new int[ARR_LENGTH];
        int[] temp = new int[ARR_LENGTH];
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            do {
                a[i] = fr.nextInt();
            } while (
                    (!(a[i] > 0 && a[i] < 100))
            );
            sum += a[i];
            System.out.println(a[i]);
        }

        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            boolean flag = false;
            for(int j = 0; j < temp.length; j++){
                if(a[i] == temp[j]){
                    flag= true;
                }
            }
            // 중복이 배제된 값이 저장.
            if(!flag){
                temp[cnt++] = a[i];
            }
        }
        // 0을 배제 해주기 위한 부분
        int[] result = new int[cnt];
        for(int i = 0; i < result.length; i++){
            result[i] = temp[i];
        }
        System.out.println(Arrays.toString(result));


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