package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		while(true) {
			int size = start.length();
			System.out.println("제시어:  "+ start);
			
			System.out.println("입력: ");
			String user = scan.next();
			
			if(user.equals("quit")) {
				break;
			}
			
			if(start.charAt(size-1) == user.charAt(0)) {
				start = user;
			}
			
			
			
			
		}

	}

}
