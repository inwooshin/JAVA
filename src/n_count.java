import java.io.*;
import java.util.StringTokenizer;

public class n_count {
    public static void main(String ar[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int st = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0 ; i < st ; i++){
            StringTokenizer strToken = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());

            bw.write(a + b + "\n");
        }

        bw.flush();
    }
}
