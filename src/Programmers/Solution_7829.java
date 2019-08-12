import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7829 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int testCase = 1; testCase <= T; testCase++) {
			
			int P = Integer.parseInt(br.readLine());
			int min =1000000, max = 0;
			StringTokenizer st =  new StringTokenizer(br.readLine().trim());
			for (int i = 0; i < P; i++) {
				int temp = Integer.parseInt(st.nextToken());
				min = min > temp ? temp : min;
				max = max < temp ? temp : max;
			}
		
			sb.append("#").append(testCase).append(" ").append(min*max).append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	
}
