package problem_one;
public class Solution {
    public static int[] solution(int area) {
       int[] areas = {};
		while (area > 0) {
			int val = (int) squareRoot(area);
			int squareArea = val * val;
			area = area - squareArea;
			areas = updateArray(areas, squareArea);
		}
		return areas;
	}

	public static double squareRoot(int number) {
		if (number == 1) {
			return 1;
		}
		double temp;
		double sr = number / 2;
		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);
		return sr;
	}

	public static int[] updateArray(int[] oldArr, int val) {
		int[] newArr = new int[oldArr.length + 1];
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		newArr[newArr.length - 1] = val;
		return newArr;
	}
}

