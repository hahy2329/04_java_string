package step4_01.string;


public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		String str = jumin.substring(0, 2);
		int strAge = Integer.parseInt(str);
		int age = 2023-(1900+strAge)+1;
		System.out.println(age);
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char sex = jumin.charAt(7);
		
		if(sex == 1) {
			System.out.println("남성");
		}
		else {
			System.out.println("여성");
		}
		

	}

}
