
public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(10, 200, 30));
		// after the first jump, at position 10 + 30 = 40
		// after the second jump, at position 10 + 30 + 30 = 70
		// after the third jump, at position 10 + 30 + 30 + 30 = 100
	}

	public static int solution(int X, int Y, int D) {
		int jumps = 0;
		if (X > Y)
			return 0;
		int distance = Y - X;

		int initialJump = distance / D;
		int initialDis = initialJump * D;
		if (initialDis == distance)
			return initialJump;
		int remainD = distance - initialDis;
		if (remainD > 0)
			jumps = initialJump + 1;
		return jumps;
	}
}
