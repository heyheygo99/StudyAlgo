import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15954 {

	private static double min;
	private static int N;
	private static int K;
	private static int[] num;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		num = new int[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		min = Double.MAX_VALUE;

		while ((N - K) != -1) {
			for (int i = 0; i <= (N - K); i++) {
				findWay(i);
			}
			K++;
		}

		System.out.println(String.format("%.11f", min));

	}

	public static void findWay(int start) {
		int sum = 0;
		for (int i = start; i < start + K; i++) {
			sum += num[i];
		}
		double m = (Double.valueOf(sum) / Double.valueOf(K));
		double tSum = 0;
		for (int i = start; i < start + K; i++) {
			tSum += (num[i] - m) * (num[i] - m);
		}
		double t = (Double.valueOf(tSum) / Double.valueOf(K));
		double ans = Math.sqrt(t);
		min = min > ans ? ans : min;
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
