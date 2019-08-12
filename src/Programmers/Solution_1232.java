import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1232 {

	private static String[] array;
	private static int N;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int testcase = 1; testcase <= 10; testcase++) {
			
			N = Integer.parseInt(br.readLine());
			array = new String[N+1];
			for (int i = 1; i < N+1; i++) {
				array[i] = br.readLine();
			}
			
			sb.append('#').append(testcase).append(' ').append(findWay(1)).append('\n');
		}
		System.out.print(sb.toString());
	}
	
	public static int findWay(int n) {
		StringTokenizer st = new StringTokenizer(array[n]);
		int node = Integer.parseInt(st.nextToken());
		String data = st.nextToken();
		char temp = data.charAt(0);
		if(temp-48>= 0 && temp-48<10) {
			return Integer.parseInt(data);
		} else {
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			switch (temp) {
			case '+':
				return findWay(first) + findWay(second);
			case '-':
				return findWay(first) - findWay(second);
			case '*':
				return findWay(first) * findWay(second);
			case '/':
				return (int) Math.floor(findWay(first) / findWay(second));
			}
		}
		return 0;
	}
}

//
//
//
//
//
//
//
//
//
//
