package math;

import java.util.Scanner;

/**
 공배수(公倍數)란 두 개 이상의 자연수의 공통인 배수를 말한다. 예를 들어 3과 4의 공배수는 3의 배수이기도 하고 4의 배수이기도 한 수이다. 
 두 수의 공배수 중에서 가장 작은 수를 최소공배수라고 하는데, 모든 공배수는 최소공배수의 배수이다
Least Common Multi => LCM


정수들의 공약수(公約數, 영어: common divisor)는 동시에 그들 모두의 약수인 정수다. 
적어도 하나가 0이 아닌 정수들의 최대공약수는 공약수 가운데 가장 큰 하나다. 
다항식이나 환의 원소에 대해서도 정의할 수 있다.
 * */
public class CommonMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대공약수와 최대공배수를 구할 두수를 구하세요");
		int small = 12,
				big =18,
				lcm = 0,
				gcd = 0,
				mok = 0,
				nmg = 0;
				
	/*		
		for(int i=0;i<a;i++) {
			if(small % (i+1)==0 && big % (i+1)==0 ) {
				gcd = i+1; 
				
			}
			
		}
		*/
		while(nmg != 0) {
			if(nmg < small) {
				mok = nmg;
				nmg = small;
				small = mok;
			}
			nmg = nmg % small;
		}
			gcd = nmg;
			lcm = (small * big) / gcd;
		
		
		System.out.printf("%d 와 %d의 최소공배수는 %d최대공약수는%d",small,big,lcm,gcd);
		
	}
}
