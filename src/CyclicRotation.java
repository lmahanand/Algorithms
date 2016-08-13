
public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		rotateCyclically(A, 3);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}

	public static int[] rotateCyclically(int[] A, int K) {
		if (A.length == 0)
			return A;
		for (int i = 0; i < K; i++) {
			int lastEle = A[A.length - 1];
			System.arraycopy(A, 0, A, 1, A.length - 1);
			A[0] = lastEle;
		}
		return A;
	}

}
