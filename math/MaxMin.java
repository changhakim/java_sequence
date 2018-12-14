package math;
/**
 3개반의 학생의 몸무게를 측정하였다
 각반의 학생의 수는 30명이다
 각반의 학생 몸무게의 최대 최소 값을 구하시오.
 단 몸무게는 40~100사이에서만 랜덤으로 생성시키시오
 * */
import java.util.Random;

public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] class1 = new int[30];
		int[] class2 = new int[30];
		int[] class3 = new int[30];
		int min= 100;
		int max= 40;
		String ran = "";
		for(int i=0;i<class1.length;i++) {
			class1[i] = random.nextInt(61)+40;
			class2[i] = random.nextInt(61)+40;
			class3[i] = random.nextInt(61)+40;
			ran += class1[i]+",";
			
		}
		for(int i=0;i<class1.length;i++) {
			if(class1[i]>max) {
				max = class1[i];
			}
		}
		for(int i=0;i<class1.length;i++) {
			if(class1[i]<min) {
				min = class1[i];
			}
		}
		System.out.printf("최대값%d 최소값%d\n"
				+ " %s",max,min,ran);
		
	}
}
