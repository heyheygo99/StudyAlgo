package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2004 {

	private static long cnt2;
	private static long cnt5;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());

		cnt2 = 0;
		cnt5 = 0;
		plusCnt5(n);
		plusCnt2(n);
		minusCnt5(m);
		minusCnt2(m);
		minusCnt5(n-m);
		minusCnt2(n-m);
		
		System.out.println(cnt2 < cnt5 ? cnt2 : cnt5);
	}
	
	public static void plusCnt2(long num) {
		for (long i = 2; i <= num; i *= 2) {
			cnt2 += num /i;
		}
	}
	
	public static void plusCnt5(long num) {
		for (long i = 5; i <= num; i *= 5) {
			cnt5 += num /i;
		}
	}
	
	public static void minusCnt2(long num) {
		for (long i = 2; i <= num; i *= 2) {
			cnt2 -= num /i;
		}
	}
	
	public static void minusCnt5(long num) {
		for (long i = 5; i <= num; i *= 5) {
			cnt5 -= num /i;
		}
	}
	
}
