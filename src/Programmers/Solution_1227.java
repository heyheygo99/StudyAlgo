import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1227 {

	private static int[][] map;
	static int [] dy = {0,0,1,-1};
	static int [] dx = {1,-1,0,0};
	static boolean isTrue = false;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int testcase = 1; testcase <= 10; testcase++) {
			int N = Integer.parseInt(br.readLine());
			map = new int[16][16];
			int [] start = new int[2];
			int [] end = new int[2];
			isTrue = false;
			for (int i = 0; i < 16; i++) {
				String temp = br.readLine();
				for (int j = 0; j < 16; j++) {
					int a = (int)(temp.charAt(j)-48);
					map[i][j] = a;
					switch (a) {
					case 2:
						start[0] = i;
						start[1] = j;
						break;
					case 3:
						end[0] = i;
						end[1] = j;
					}
				}
			} // end of make map
			
			findWay(start[0], start[1]);
			sb.append('#').append(N).append(' ').append(isTrue?1:0).append('\n');
		} // end of testcase
		System.out.print(sb.toString());
		
	} // end of main
	
	public static void findWay(int y, int x) {
		if(map[y][x]==3) {
			isTrue = true;
			return;
		}
		
		map[y][x] = 1;
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if(ny<16&&nx<16&&ny>0&&nx>0 && map[ny][nx]!=1) {
				findWay(ny, nx);
				if(isTrue) return;
			}
		}
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
