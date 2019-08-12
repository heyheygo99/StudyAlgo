import java.util.Arrays;

public class Solution {
	
	static int answer = 0;
	public static void main(String[] args) {
		solution(new int[] {1,2,7,6,4});
		
	}
	
	public static int solution(int[] nums) {
		answer = 0;
		findWay(nums, new boolean[nums.length], 0, 0);
		System.out.println(answer);
		return answer;
	}
	
	public static void findWay(int[] nums, boolean[] check, int cnt, int now) {
		if(cnt == 3) {
			int sum = 0;
			for (int i = 0; i < check.length; i++) {
				if(check[i]) {
					sum+= nums[i];
				}
			}
			boolean checkSum = false;
			for (int i = 2; i < sum; i++) {
				if(sum%i==0)
					checkSum = true;
			}
			if(!checkSum) {
				answer++;
			}
			return;
		}
		
		for (int i = now; i < check.length; i++) {
			if(!check[i]) { 
				check[i] = true;
				findWay(nums, check, cnt+1, i);
				check[i] = false;
			}
		}
		
	}
	

}
