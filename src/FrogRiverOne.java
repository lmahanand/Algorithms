import java.util.*;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = { 5,5,5,5,5 };
		System.out.println(solution(5, A));
	}

	public static int solution(int X, int[] A) {
		int ed = -1;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (set.size() == X) {
				ed = i;
				break;
			}
		}

		return ed;
	}
}
