package math;

import java.util.Scanner;

/**
 소인수 분해:합성수를 소수의 곱으로 나타내는 방법
20=2×2×5
 * */

public class Factorization {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수 분해할 수를 입력하세요");
		int target = scanner.nextInt();
		int count = 5;
		int[] res = new int[count]; 
		int nmg = 0;
		int mok = target / 2;
		int dd = 2;

		if(target < 2){
			return;
		}
		count = 0;
		while(true) {
			
			if(target % dd ==0 &&count<=3) {
				System.out.println(count+"카운트");
				res[count] = dd; 
				target = target / dd;
				count++;



			}
			if(target == 1) {
				break;
			}else {
				dd++;
			}



		}
		for(int i =0;i<res.length;i++) {
		System.out.println(res);
		}
			
	}
}