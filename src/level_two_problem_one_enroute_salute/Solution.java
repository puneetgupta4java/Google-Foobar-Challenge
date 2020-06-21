package level_two_problem_one_enroute_salute;

public class Solution {

	public static int solution(String s) {
		int sum = 0, count = 0;
		String str[] = s.split("");
		for (String checkString : str) {
			if (checkString.equalsIgnoreCase(">"))
				count++;
			else if (checkString.equalsIgnoreCase("<"))
				sum += count;
		}
		return sum * 2;
	}

}
