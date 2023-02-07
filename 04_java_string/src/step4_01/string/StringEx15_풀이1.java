package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_풀이1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		int count=0;
		
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if(num[i] == text.charAt(j)) {
					count ++;
				}
			}
		}
		
		
		if(count == text.length()) {
			System.out.println("숫자로만 이루어져 있습니다.");
		}
		else if(count > 0 && count<text.length()) {
			System.out.println("문자와 숫자로 이루어져 있습니다.");
		}
		
		else {
			System.out.println("문자로만 이루어져 있습니다.");
		}

	}

}
