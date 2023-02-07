package step4_01.string;


import java.util.Iterator;
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		
		
		//우선 첫 쨰, 배열로 만들어서 하면 간단해진다. 하지만 short에는 '.'까지 붙어있어 이걸 빼주고 배열로 만들어보자
		
		
		String[] textArr = text.split(" ");
		String text1 = "";
		
		for (int i = 0; i < textArr.length; i++) {
			
			if(i == 3) {
				text1 += textArr[i].substring(0,5);
			}
			else {
				text1 +=textArr[i];
			}
			
			text1 += " ";
		}
		
		System.out.println(text1);
		
		// 둘 째, 배열로 만들자 
		
		String[] text2 = text1.split(" ");
		
				
		
	
		
		
		
		//셋 째, 단어 존재유무 확인하기
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		for (int i = 0; i < text2.length; i++) {
			if(text2[i].equals(word)) {
				System.out.println(true);
			}
			
			
			
		}

	}

}
