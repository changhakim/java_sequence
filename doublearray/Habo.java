package doublearray;

import java.util.Scanner;

public class Habo {
	public static void main(String[] args) {
		int[][] res1 = {};
		int[][] res = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				res[i][j] = scanner.nextInt();
			}
		}



		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println("");
		}
	}
}
