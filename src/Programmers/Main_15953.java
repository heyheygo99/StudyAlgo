import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15953 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] prizeA = new int[] {
				500, 300, 300, 200, 200, 200,
				50, 50, 50, 50, 30, 30, 30, 30, 30,
				10, 10, 10, 10, 10, 10
		};
		int [] prizeB = new int[] {
			512, 256, 256, 128, 128, 128, 128,
			64, 64, 64, 64, 64, 64, 64, 64,
			32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
			32, 32, 32, 32, 32, 32
		};
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int test = 1; test <= T; test++) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum  = 0;
			sum += (a == 0 ? 0 : (a > 21 ? 0: prizeA[a-1]));
			sum += (b == 0 ? 0 : (b > 31 ? 0: prizeB[b-1]));			
			
			sb.append(sum*10000).append('\n');
		}
		
		System.out.print(sb.toString());
	}
	
}
