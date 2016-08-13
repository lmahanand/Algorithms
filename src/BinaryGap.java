
public class BinaryGap {

	public static void main(String[] args) {
		int N = 123456;
		String s = Integer.toBinaryString(N);
		System.out.println(s);
		System.out.println(solution(N));
	}

	public static int solution(int N) {
		int gap = 0;
		int maxGap = 0;

		while (N % 2 == 0) {
			N = N / 2;
		}
		while (N / 2 > 0) {
			if (N % 2 == 0) {
				gap++;
				if (maxGap < gap)
					maxGap = gap;

			}
			N = N / 2;
			if (N % 2 > 0)
				gap = 0;
		}

		return maxGap;
	}
}
