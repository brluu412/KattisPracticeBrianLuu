package kattisPractice;

import java.util.Scanner;

public class Damaged {
	private boolean dividedByZero = false;
	public Damaged(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		/*
		 * 
		 * a ? b = c ? d
		 * use +, -, *, or /
		 * 
		 * two arrays of results for a ? b and c ? d
		 * compare indices
		 * 
		 */
		
		int[] arr1 = fillArrayWithResults(a,b);
		int[] arr2 = fillArrayWithResults(c,d);
		
		String result = "";
		
		boolean flag = true;
		for(int k = 0; k < arr1.length; k++) {
			if(dividedByZero && k == 3) {
				continue;
			}
			for(int i = 0; i < arr2.length; i++) {
				result = "";
				if(dividedByZero && i == 3) {
					continue;
				}
				if(arr1[k] == arr2[i]) {
					flag = false;
					switch (k) {
					case 0: result += a + " * " + b; break;
					case 1: result += a + " + " + b; break;
					case 2: result += a + " - " + b; break;
					case 3: result += a + " / " + b; break;
					}
					result += " = ";
					
					switch (i) {
					case 0: result += c + " * " + d; break;
					case 1: result += c + " + " + d; break;
					case 2: result += c + " - " + d; break; 
					case 3: result += c + " / " + d; break;
					}
					System.out.println(result);
				}
			}
		}
		
		if(flag) {
			System.out.println("problems ahead");
		}
		
	}
	
	private int[] fillArrayWithResults(int x, int y) {
		int[] arr = new int[4];
		arr[0] = x * y;
		arr[1] = x + y;
		arr[2] = x - y;
		try {
		arr[3] = x / y;
		}catch(Exception e){
			dividedByZero = true;
		}
		return arr;
	}
	
	public static void main(String [] args) {
		Damaged d = new Damaged();
	}
}
