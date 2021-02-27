package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EX11653 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(in.readLine());
		int num2 = 2;
		
		while(num != 1 ) {
			if(num % num2 == 0) {
				resultList.add(num2);
				num = num / num2;
			}else {
				num2 ++;
			}
		}

		for (Integer integer : resultList) {
			System.out.println(integer);
		}

	}
}
