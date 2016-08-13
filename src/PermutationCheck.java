import java.util.*;

public class PermutationCheck {

	public static int solution(int[] A) {
		int check = 0;
		long N = A.length;
		N = N * (N + 1) / 2;
		int sum = 0;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > A.length)
				return 0;
			if (A[i] <= A.length && map.get(A[i]) == null) {
				map.put(A[i], 1);
			} else if (A[i] <= A.length) {
				map.put(A[i], (map.get(A[i]) + 1));
			}
			if (map.get(A[i]) > 1)
				return 0;

		}
		for (int i = 0; i < A.length; i++)
			sum += A[i];
		if (sum == (int) N) {
			check = 1;
		}

		return check;
	}

}
