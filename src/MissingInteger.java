
import java.util.HashSet;

/* Given a non-empty zero-indexed array A of N integers as input, 
 * and the method should
 * return the minimal positive integer (greater than 0) 
 * that does not occur in A.*/

public class MissingInteger {

	public static void main(String[] args) {
		// int[] A = { 2, 3, 6, 4, 1, 2 };// 1 1 2 3 4 6
		// int[] A = { 5,6,5,6,5 };
		// int[] A = { 1,2};
		// int[] A = { 3 };
		//int[] A = { -3, -2, -5, -6 };
		// int[] A = { -1,-1,5,6,7,-3,-78,-1234,9,5,3,9 };
		 int[] A = { Integer.MIN_VALUE, Integer.MAX_VALUE };
		System.out.println(solution(A));
		
		

	}

	public static int solution(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			hset.add(A[i]);//2, 3, 6, 4, 1, 2

			while (hset.contains(num)) {
				num++;
			}
		}
		
		return num;
	}
}
