package EX1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MOD = 15746;

	static int[] dpArray = new int[1000000];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		dpArray[1] = 1;
		dpArray[2] = 2;

		for (int i = 3; i <= N; i++) {

			dpArray[i] = (dpArray[i - 1] + dpArray[i - 2]) % MOD;
		}

		System.out.println(dpArray[N]);
	}

}