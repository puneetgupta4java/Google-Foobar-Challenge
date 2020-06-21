package level_two_problem_two_elevator_maintainence;

import java.util.regex.Pattern;

public class Solution {

	public static String[] solution(String[] l) {
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l.length; j++) {
				String[] a = l[i].split(Pattern.quote("."));
				String[] b = l[j].split(Pattern.quote("."));

				if (Integer.parseInt(a[0]) < Integer.parseInt(b[0])) {
					String temp = l[i];
					l[i] = l[j];
					l[j] = temp;
				} else if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])) {
					if (a.length > 1 && b.length > 1) {
						if (Integer.parseInt(a[1]) < Integer.parseInt(b[1])) {
							String temp = l[i];
							l[i] = l[j];
							l[j] = temp;
						} else if (Integer.parseInt(a[1]) == Integer.parseInt(b[1])) {
							if (a.length > 2 && b.length > 2) {
								if (Integer.parseInt(a[2]) < Integer.parseInt(b[2])) {
									String temp = l[i];
									l[i] = l[j];
									l[j] = temp;
								}
							} else {
								if (a.length < b.length) {
									String temp = l[i];
									l[i] = l[j];
									l[j] = temp;
								}
							}
						}
					} else {
						if (a.length < b.length) {
							String temp = l[i];
							l[i] = l[j];
							l[j] = temp;
						}
					}
				}
			}
		}
		return l;
	}
}
