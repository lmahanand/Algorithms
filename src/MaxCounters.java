/*if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:

    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)*/
public class MaxCounters {

	public static void main(String[] args) {
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;
		// int [] A = {4,8,8,6,1,2};
		// int N = 7;
		int[] res = solution(N, A);
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + " ");
		}
	}

	public static int[] solution(int N, int[] A) {
		int res[] = new int[N];
		int max = 0;
		int lastMax = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1) {
				lastMax = max;

			} else {
				if (res[A[i] - 1] < lastMax) {
					res[A[i] - 1] = lastMax + 1;
				} else
					res[A[i] - 1]++;

				if (res[A[i] - 1] > max)
					max = res[A[i] - 1];

			}

		}

		for (int i = 0; i < res.length; i++) {
			if (res[i] < lastMax) {
				res[i] = lastMax;
			}
		}
		return res;
	}

}
