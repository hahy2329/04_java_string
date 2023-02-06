package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_풀이2 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random ran = new  Random();
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int count = 0;
		boolean isRun = true;
		
		
		while(i<30) {
			int a = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[a];
			words[a] = temp;
			i++;
		}
		
		while(isRun) {
			System.out.println("문제 : " + words[count] );
		
			System.out.println("정답을 입력하시오: ");
			String userStr = scan.next();
			
		
			if(words[count].equals(userStr) ) {
				System.out.println("정답!");
				count +=1;
			}
			
			else {
				continue;
			}
		
			if(count == 4) {
				isRun = false;
			}
		
		}
		
	}

}
