package geometric;
/**
 1-2+3-4+5...-20 =-10
 * */
public class Switch10 {
public static void main(String[] args) {
	String res= "";
	int sum =0;
for(int i=0;i<21;i++) {
	/*if(i%2==1) {
		sum += i;
	}else {
		sum -= i;
	}*/
	sum += (i%2==1)?-i: i;
}
	System.out.println(sum);
}
}
