package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		System.out.println("바꿀 단어를 입력해주세요: ");
		String chageWord = scan.next();
		
		String[] text1 = text.split(" ");
		
		for (int i = 0; i < text1.length; i++) {
			if(text1[i].equals(word)) {
				text1[i] = chageWord;
			}
			else {
				System.out.println("해당 단어가 존재하지 않습니다.");
				break;
			}
		}
		
		String finalShot ="";
		for (int i = 0; i < text1.length; i++) {
			if(i == 3) {
				finalShot += text1[i];
			}
			else if(i!= text1.length-1){
				finalShot += text1[i];
				finalShot +=" ";
			}
			
		}
		
		System.out.println(finalShot);
		
		
		
	}

}
