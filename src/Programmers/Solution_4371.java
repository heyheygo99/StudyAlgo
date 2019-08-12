import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4371 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= tc; testcase++) {
            int N = Integer.parseInt(br.readLine()); // 즐거운날
            int[] day = new int[N];
            for (int i = 0; i < day.length; i++) {
                day[i] = Integer.parseInt(br.readLine());
            }
            int cnt = 0;
            boolean [] check = new boolean[N];
            check[0] = true; // 첫날은 항상 1일
             
            for (int i = 1; i < check.length; i++) {
                if(!check[i]) {
                    cnt++;
                    int temp = day[i] - 1;
                    for (int j = day[i]; j <= day[N-1]; j = j + temp) {
                        for (int j2 = i; j2 < check.length; j2++) {
                            if(j == day[j2]) {
                                check[j2] = true;
                                break;
                            }
                        }
                    }
                     
                }
            }
             
            sb.append('#').append(testcase).append(' ').append(cnt).append('\n');
        }
        System.out.print(sb.toString());
    }
}
