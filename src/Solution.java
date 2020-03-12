import java.util.*;
import java.io.*;

public class Solution {
	
	static int birthday(List<Integer> s, int d, int m) {
		
		static int birthday(List<Integer> s, int d, int m) {

        	int result = 0;

        	if (s.size() == 1) {
            		if (s.get(0) == d)
                	   result = s.size();
        	} else {
            		for (int i = 0; i < s.size() - m + 1; i++) {
                		int sum = 0;
                		for (int j = i; j < i + m; j++) {
                    		    sum += s.get(j);
                		}
                	if (sum == d)
                    	   result++;
            		}
        	}

        	return result;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		List<Integer> s = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int sItem = Integer.parseInt(sItems[i]);
			s.add(sItem);
		}
		
		String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		int d = Integer.parseInt(dm[0]);
		int m = Integer.parseInt(dm[1]);
		
		int result = birthday(s, d, m);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
