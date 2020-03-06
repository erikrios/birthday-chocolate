
import java.util.*;public class Test {
	
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		
		String myS = "3 5 4 1 2 5 3 4 3 2 1 1 2 4 2 3 4 5 3 1 2 5 4 5 4 1 1 5 3 1 4 5 2 3 2 5 2 5 2 2 1 5 3 2 5 1 2 4 3 1 5 1 3 3 5";
		String[] my = myS.split(" ");
		for (int i = 0; i < my.length; i++) {
			s.add(Integer.parseInt(my[i]));
		}
		
		int result = Solution.birthday(s, 18, 6);
		System.out.println(result);
	}
}
