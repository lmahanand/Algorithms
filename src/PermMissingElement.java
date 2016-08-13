public class PermMissingElement {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		long N = A.length + 1;
		long total = N * (N + 1) / 2;
		for (int i : A)
			total -= i;
		return (int) total;
	}
}
