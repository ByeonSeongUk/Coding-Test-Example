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

        if(!(n >= 1)) {
            System.out.println("n을 다시 입력 해주세요. (조건 : 1 보다 커야함) 현재 n 값 : " + n);
            n = fr.nextInt();
        }

        if(!(x <= 10000)) {
            System.out.println("x을 다시 입력 해주세요. (조건 : 10,000 보다 작아야함) 현재 x 값 : " + x);
            x = fr.nextInt();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 한줄에 여러개 입력
        String[] line = br.readLine().split(" ");

        int[] arr = new int[line.length];


        while(arr.length != n) {
            br = new BufferedReader(new InputStreamReader(System.in)); // 한줄에 여러개 입력;
            line = br.readLine().split(" ");
            arr = new int[line.length];
        }


        System.out.println(line.length);

        for(int i = 0; i < n; i++) {
            if(x > Integer.parseInt(line[i])) {
                arr[i] = Integer.parseInt(line[i]);
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("n : " + n);
        System.out.println("x : " + x);

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