import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

	private static boolean[][] visited;
	static int[] dy = {0,0,1,-1};
	static int[] dx = {1,-1,0,0};
	private static int R;
	private static int C;
	private static int[][] map;
	private static int cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int LL = Integer.parseInt(st.nextToken());
		int RR = Integer.parseInt(st.nextToken());
		
		int startY = 0;
		int startX = 0;
		
		map = new int[R][C];
		for(int i=0;i<R;i++) {
			String Line = br.readLine();
			for(int j=0;j<C;j++) {
				map[i][j] = Integer.parseInt(Line.substring(j,j+1));
				if(map[i][j]==2) {
					startY = i;
					startX = j;
					map[i][j]=0;
				}
			}
		}
		
		visited = new boolean[R][C];
		cnt = 0;
		findWay(startY, startX, LL, RR, new boolean[R][C]);
		System.out.println(cnt==0?1:cnt);
	
	} // end of main

	public static void findWay(int y, int x, int l, int r, boolean [][] visit) {
		for(int i=3;i>=0;i--) {
			if(i==0 && r ==0) continue;
			if(i==1 && l ==0) continue;
			int ny = y + dy[i];
			int nx = x + dx[i];
			if(ny>=0&&ny<R&&nx>=0&&nx<C&&!visit[ny][nx]&&map[ny][nx]==0) {
				if(i==0) r--;
				if(i==1) l--;
				visit[ny][nx] = true;
				if(!visited[ny][nx]) {
					visited[ny][nx] = true;
					cnt++;
				}
				findWay(ny, nx, l, r, visit);
				if(i==0) r++;
				if(i==1) l++;
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
