package my.test.pack.geeksForGeeks;

public class TrappingWater {

	public static void main(String[] args) {
		int[] wallHeights = { 3, 0, 0, 2, 0, 4 };
//		int[] wallHeights = { 7, 4, 0, 6 };
		TrappingWater.trappingWaterMethod(wallHeights.length, wallHeights);
	}

	public static long trappingWaterMethod(int n, int[] array) {

		int minWall = array[0];
		if (array[0] > array[n - 1])
			minWall = array[n - 1];
		long waterVolume = 0;
		for (int wallHeight : array) {
			if (minWall > wallHeight) {
				waterVolume = waterVolume + (minWall - wallHeight);
			}
		}
		System.out.println("Water Volume: " + waterVolume);

		return waterVolume;

	}

}
