import java.util.LinkedHashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = { 5, 4, 7, 7, 9, 3, 9, 3, 9, 7, 9, 7, 5 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		int res = 0;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) == null)
				map.put(A[i], 1);
			else {
				int cnt = map.get(A[i]) + 1;
				map.put(A[i], cnt);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0)
				res = entry.getKey();
		}

		return res;
	}
}
