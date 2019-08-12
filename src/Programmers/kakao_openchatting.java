import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kakao_openchatting {

	static class obj {
		String doit, uid, nick;

		public obj(String doit, String uid, String nick) {
			this.doit = doit;
			this.uid = uid;
			this.nick = nick;
		}
	}

	public static void main(String[] args) {
		String[] temp = solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
				"Enter uid1234 Prodo", "Change uid4567 Ryan" });

		System.out.println(Arrays.toString(temp));
	}

	public static String[] solution(String[] record) {
		Queue<obj> q = new LinkedList<obj>();
		HashMap<String, String> uid = new HashMap<String, String>();
		int cnt = 0;
		for (int i = 0; i < record.length; i++) {
			StringTokenizer st = new StringTokenizer(record[i]);
			String tempDo = st.nextToken();
			String tempUid = st.nextToken();
			String tempNick = "";
			if (tempDo.equals("Leave")) {
				q.add(new obj(tempDo, tempUid, ""));
				cnt++;
			} else {
				if(tempDo.equals("Enter")) cnt++;
				tempNick = st.nextToken();
				uid.put(tempUid, tempNick);
				q.add(new obj(tempDo, tempUid, tempNick));
			}
		}
		
		String [] answer = new String[cnt];
		cnt = 0;
		while(!q.isEmpty()) {
			obj current = q.poll();
			switch(current.doit) {
			case "Enter" :
				answer[cnt++] = uid.get(current.uid)+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
				break;
			case "Leave" :
				answer[cnt++] = uid.get(current.uid)+"´ÔÀÌ ³ª°¬½À´Ï´Ù.";
				break;
			}
		}

		return answer;
	}

}

//
//
//
//
