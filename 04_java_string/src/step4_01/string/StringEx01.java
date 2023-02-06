package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String productNm = scan.next(); // 단어를 입력받는다.
		System.out.println("입력된 상품 : " + productNm);
		
		scan.close();
		
	}

}
