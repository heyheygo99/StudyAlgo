import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1222 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int testcase = 1; testcase <= 10; testcase++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "+");
			int cnt = 0;
			while(st.hasMoreTokens()) {
				cnt += Integer.parseInt(st.nextToken());
			}
			sb.append('#').append(testcase).append(' ').append(cnt).append('\n');
		}
		System.out.print(sb.toString());
	}
	
	
}
