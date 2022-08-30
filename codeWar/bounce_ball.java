package codeWar;

public class bounce_ball {

	public static void main(String[] args) {

		System.out.println(bouncingBall(30, 0.66, 1.5));

	}

	public static int bouncingBall(double h, double bounce, double window) {

		if (h <= 0 || (bounce <= 0 || 1 <= bounce) || (window > h))
			return -1;

		int count = 0;
		while (h > window) {
			h *= bounce;
			count += 2;
		}

		return count-1;
	}

}
