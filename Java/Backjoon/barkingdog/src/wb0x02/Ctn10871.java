package wb0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

///**
// * @title : X보다 작은 수
// *
// * @input : 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
// *          둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
// *
// * @output : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
// *
// * @inputEx : 10 5
// *            1 10 4 9 2 3 8 5 7 6
// *
// * @outputEx : 1 4 2 3
// **/


public class Ctn10871{

    public static void main(String[] args) throws Exception {

        // Input Data
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        int x = fr.nextInt();

        int[] temp = new int[n];
        Boolean flag = true;

        do {
            for (int i = 0; i < n; i++) {
                temp[i] = fr.nextInt();
                if (x > temp[i]){
                    System.out.print(temp[i] + " ");
                    flag = false;
                }
            }
        } while(flag);




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