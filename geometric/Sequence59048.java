package geometric;
/**
 등비수열=각 항이 그 앞 항과. 일정한 비를 가지는 수열
 일정한 비를 =공비(共比, common ratio)
 2+6+18+54 = 80 4항까지의 합이다
 10항까지의 합은 무엇인가
 
 
 2 + 6 + 18 + 54 =80
 2 + (2*3 )+ (2 * 3 * 3 )+ (2 * 3 * 3 * 3)
 * */
public class Sequence59048 {
	public static void main(String[] args) {
		int A = 2;
		int R = 3;
		int S = A;
		int N = 2;
		while(true) {
			N++;
			A =A*R;
			S+=A;
			
			
			if(N < 10) {
				break;
			}
		}
		
		System.out.printf("S is %s", S);
	}
}
