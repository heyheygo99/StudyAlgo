import java.util.StringTokenizer;

public class program {

	
	
	public static void main(String[] args) {
		
		String s = "   ";
		System.out.println(solution(s));
		
	}
	
	public static String solution (String s) {
		String temp = s.toLowerCase();
		char [] toCh = temp.toCharArray();
		boolean[] check = new boolean[temp.length()];
		for (int i = 0; i < check.length; i++) {
			if(toCh[i]==' ') check[i] = true;
		}
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(temp);
		while(st.hasMoreTokens()) {
			String tt = st.nextToken();
			if(tt.charAt(0)>='a' && tt.charAt(0)<='z') {
				sb.append((tt.charAt(0)+"").toUpperCase()).append(tt.substring(1));
			} else {
				sb.append(tt);
			}
			sb.append(' ');
		}
		StringBuilder sb2 = new StringBuilder();
		st = new StringTokenizer(sb.toString());
		for (int i = 0; i < check.length; i++) {
			if(check[i]) {
				sb2.append(' ');
			} else {
				String te = st.nextToken(); 
				sb2.append(te);
				i += te.length()-1;
			}
			
		}
		
		return sb2.toString();
	}
	
	
	
}
