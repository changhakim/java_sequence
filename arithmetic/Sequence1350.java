package arithmetic;

public class Sequence1350 {
	public static void main(String[] args) {
		 int i = 0, d = 1, sum = 1;

	        while (true) {
	           // 딱3줄 이곳을 채우시오
	        	i++;
	        	if(i<20) {
	        		d =  d+i;
	        		sum = sum + d;
	        		
	        		continue;
	        	}else {
	        		break;
	        	}
	        }
	        System.out.println(sum);
	        /*System.out.printf(
	                  "======================================================\n"
	                + "1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
	                + "======================================================\n"
	                + "sum \n"
	                + "=======================================================",sum);*/

		
	}
}