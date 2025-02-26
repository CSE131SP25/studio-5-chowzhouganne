package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		StdDraw.setPenColor(0, 109, 219);
		StdDraw.filledCircle(x, y, (3.0 / 4.0) * radius);

		StdDraw.setPenColor(146, 0, 0);
		StdDraw.filledCircle(x, y, (1.0 / 2.0) * radius);

		StdDraw.setPenColor(255, 255, 109);
		StdDraw.filledCircle(x, y, (1.0 / 4.0) * radius);
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 *
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		return source.replace(String.valueOf(target), replacement);
	}

	/**
	 * Compute the sum of elements in an array
	 *
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 *
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return an array of size length filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[i] = value;
		}
		return values;
	}

	/**
	 * Compute the mean (average) of an array of integers.
	 *
	 * @param values an array of integers
	 * @return the mean (average) of the elements in values
	 */
	public static double arrayMean(int[] values) {
		if (values.length == 0) {
			return 0; // Avoid division by zero
		}
		return (double) arraySum(values) / values.length;
	}
}
