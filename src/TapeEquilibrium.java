
public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3, 3, 4, 5, 7, 4, 2, 3, 4, 5, 8, 9, 5, 9, 2, 3, 4, 7 };
		// int [] A = {3,1,2,4,3};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int res = 0;
		long sumL = 0;
		long sumR = 0;
		for (int p = 1; p < A.length; p++)
			sumR += A[p];
		sumL = A[0];
		res = (int) Math.abs(sumL - sumR);
		for (int p = 1; p < A.length; p++) {
			if (Math.abs(sumL - sumR) < res) {
				res = (int) Math.abs(sumL - sumR);
			}
			sumL += A[p];
			sumR -= A[p];
		}
		return res;
	}

}
