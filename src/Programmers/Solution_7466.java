import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7466 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int test = 1; test <= N; test++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());		
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a >= b) {
				sb.append('#').append(test).append(' ').append(b).append('\n');
				continue;
			}
			
			int num = 1;
			for (int i = a; i >= 1; i--) {
				if(b==1) break;
				int temp = b % i;
				if(temp == 0) {
					b = b / i;
					num *= i;
					if(b < i) {
						i = b + 1;
					}
				}
			}
			sb.append('#').append(test).append(' ').append(num).append('\n');
		}
		System.out.print(sb.toString());
	}
	
}
