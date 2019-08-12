import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8189 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int testcase = 1; testcase <= T; testcase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 편지 개수
			int A = Integer.parseInt(st.nextToken()); // ~개 이상
			int B = Integer.parseInt(st.nextToken()); // ~시간
			int [] letter = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				letter[i] = Integer.parseInt(st.nextToken());
			}
			
			if(A==1) {
				sb.append('#').append(testcase);
				for (int i = 0; i < letter.length; i++) {
					sb.append(' ').append(letter[i]);
				}
				sb.append('\n');
				continue;
			} 
			
			sb.append('#').append(testcase).append(' ');
		
			int pointer = 0;
			for (int i = 1; i < letter.length; i++) {
				if(letter[pointer] + B <= letter[i]) {
					int loop = (i-pointer)/2 + (i-pointer)%2;
					for (int k = 0; k < loop; k++) {
						sb.append(letter[pointer] + B).append(' ');
					}
					pointer = pointer + loop;
				} else if (i+1-pointer >= A){
					int loop = (i-pointer)/2 + (i-pointer)%2;
					for (int k = 0; k < loop; k++) {
						sb.append(letter[i]).append(' ');
					}
					pointer = pointer + loop;
				}
			}
			
			while(pointer != N-1) {
				int loop = (N-pointer)/2 + (N-pointer)%2;
				for (int k = 0; k < loop; k++) {
					sb.append(letter[pointer] + B).append(' ');
				}
				pointer = pointer + loop;
			}
			if(pointer==N-1) {
				sb.append(letter[N-1]+B);
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
	
}
//
//
//
//
//
