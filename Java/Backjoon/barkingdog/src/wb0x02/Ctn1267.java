package wb0x02;
// 핸드폰 요금
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ctn1267 {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int cnt = fr.nextInt();
        int[] time = new int[cnt];
        int priceY = 0;
        int priceM = 0;

        for(int i = 0; i < cnt; i++) {
            time[i] = fr.nextInt();
        }

        for(int i = 0; i < cnt; i++) {

            if(time[i] < 30)
                priceY += 10;
            else if(time[i] % 30 == 0)
                priceY += (time[i] / 30 + 1) * 10;
            else if(time[i] > 30)
                priceY += Math.ceil((float) time[i] / 30) * 10;


            if(time[i] < 60)
                priceM += 15;
            else if(time[i] % 60 == 0)
                priceM += (time[i] / 60 + 1) * 15;
            else if(time[i] > 60)
                priceM += Math.ceil((float) time[i] / 60) * 15;


        }

        if(priceY > priceM) {
            System.out.print("M ");
            System.out.print(priceM);
        }
        else if(priceM > priceY) {
            System.out.print("Y ");
            System.out.print(priceY);
        }
        else {
            System.out.print("Y ");
            System.out.print("M ");
            System.out.print(priceY);
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