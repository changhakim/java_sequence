package newarray;

import java.util.Random;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {



		String[] vivace = {"은지","지은","창준","서우","현일"};
		String[] royal = {"창하","수호","정욱","은영",""};
		String[] atlas = {"동준","종협","이레","지은",""};
		String[] ntom = {"정우","태혁","승아","기호",""};

		String[][] res = new String[4][5];
		String[][] myClass = {vivace,royal,atlas,ntom};
		Random random = new Random();
		int[][] score = new int[4][5];
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				score[i][j] = random.nextInt(100);
				res[i][j] =  myClass[i][j];	
			}
		}

		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				if(res[i][j].equals("")) {
					res[i][j] = "이름없음";
					score[i][j] = 0;
				}
				
			}
		}
		
		for(int i =0;i<res.length;i++) {
			for(int j =1;j<res[i].length;j++) {
				if(score[i][j-1]<score[i][j]) {
					int temp = score[i][j-1];
					score[i][j-1]= score[i][j];
					score[i][j]=temp;
					String temps = res[i][j-1];
					res[i][j-1] = res[i][j];
					res[i][j] = temps;	
				}
					
				}
			}
		for(int i =0;i<res.length;i++) {
			for(int j =1;j<res[i].length;j++) {
				if(score[i][j-1]<score[i][j]) {
					int temp = score[i][j-1];
					score[i][j-1]= score[i][j];
					score[i][j]=temp;
					String temps = res[i][j-1];
					res[i][j-1] = res[i][j];
					res[i][j] = temps;	
				}
					
				}
			}
		for(int i =0;i<res.length;i++) {
			for(int j =1;j<res[i].length;j++) {
				if(score[i][j-1]<score[i][j]) {
					int temp = score[i][j-1];
					score[i][j-1]= score[i][j];
					score[i][j]=temp;
					String temps = res[i][j-1];
					res[i][j-1] = res[i][j];
					res[i][j] = temps;	
				}
					
				}
			}
		
		





		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				
				System.out.println("이름:"+res[i][j]+",점수:"+score[i][j]);
			}
			System.out.println("--------------------------");
		}






	}
}




/*
		 String[] vivace = {"은지","지은","창준","서우","현일"};
		String[] royal = {"창하","수호","정욱","은영",""};
		String[] atlas = {"동준","종협","이레","지은",""};
		String[] ntom = {"정우","태혁","승아","기호",""};
		System.out.println("팀장만");
		String[] res = new String[4];
		String[][] myClass = {vivace,royal,atlas,ntom}; 



		 		for(int i=0;i<1;i++) {
			for(int j=0;j<4;j++) {
				res[j]  = myClass[j][i];

				for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t");
		}
			}
 */

/*		for(int i=0;i<4;i++) {

			for(int j=0;j<1;j++) {
				res[i]  = myClass[i][j];

			}

		}
 */










/*
		String[] res = {};
		String[] class1 = new String[20];
		String[] vivace = {"은지","지우","창준","서우","현일"};
		String[] javachung = {"창하","수호","정욱","은영",""};
		String[] atlas = {"동준","종협","이레","지은",""};
		String[] nm = {"정우","태혁","승아","기호",""};

		System.out.println("팀을 입력하세요");
		String team = scanner.next();
		switch(team) {
		case "vivace" :res = vivace;break;
		case "javachung" :res = javachung;break;
		case "atals" :res = atlas;break;
		case "nm" :res = nm;break;
		default : break;
		}
		for(int i=0;i<res.length;i++) {
			System.out.printf("%s",res[i]);
		}
 */










/*
		while(true) {
			System.out.println("팀명을 입력하세요");
			String team = scanner.next();
			switch(team) {

			case"vivace":for(int i =0;i<vivace.length;i++) {
				System.out.print(vivace[i]+"\t");
			}
			break;
			case"javachung":for(int i =0;i<vivace.length;i++) {
				System.out.print(javachung[i]+"\t");
				}break;
			case"atlas":for(int i =0;i<vivace.length;i++) {
				System.out.print(atlas[i]+"\t");
				}break;
			case"nm":for(int i =0;i<vivace.length;i++) {
				System.out.print(nm[i]+"\t");
			}break;




			}
			}*/







