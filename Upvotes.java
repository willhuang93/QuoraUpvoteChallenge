import java.util.*;

public class Upvotes {
	public static void main (String [] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int k = 3;

		calculate2(arr, k);	
	}

	public static void calculate2(int[] arr, int k) {
		int windows = arr.length - k + 1;
		int nonDecCnt;
		int nonIncCnt;
		int nonDecTotal = 0;
		int nonIncTotal = 0;
		int next;
		int curr;

		for (int x = 0; x < windows; x++) {
			curr = arr[x];

			nonDecCnt = 0;
			nonIncCnt = 0;
			nonDecTotal = 0;
			nonIncTotal = 0;

			System.out.println("**Window: " + x);

			for(int y = x + 1; y < k + x; y++) {
				next = arr[y];

				if (next > curr) {
					nonDecCnt += 1;
					nonDecTotal += nonDecCnt;
					nonIncCnt = 0;
				}

				if (next < curr) {
					nonIncCnt += 1;
					nonIncTotal += nonIncCnt;
					nonDecCnt = 0; 
				}

				if (next == curr) {
					nonIncCnt += 1;
					nonIncTotal += nonIncCnt;
					nonDecCnt += 1;
					nonDecTotal += nonDecCnt;
				}

				curr = next;

			}

			System.out.println("nonDecTotal " + nonDecTotal);
			System.out.println("NonIncTotal " + nonIncTotal);
			System.out.println();

		}
		
	}