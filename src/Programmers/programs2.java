import java.util.PriorityQueue;
import java.util.Queue;

public class programs2 {
	// 스코빌 지수
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1,2,3,9,10,12}, 7));
		
	}
	
	public static int solution(int[] scoville, int K) {

		Queue<Integer> q = new PriorityQueue<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			q.add(scoville[i]);
		}
		int cnt = 0;
		while(q.size() > 1) {
			int temp = q.poll();
			if(temp >= K) {
				return cnt;
			}
			cnt++;
			q.add(temp + q.poll()*2);
		}
		
		if(q.poll() < K) {
			return -1;
		}
		
		return cnt;
	}
	
	
}
