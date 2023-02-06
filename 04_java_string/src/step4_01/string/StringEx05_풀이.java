package step4_01.string;


public class StringEx05_풀이 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		String strAge = jumin.substring(0,2);
		int intAge = Integer.parseInt(strAge);
		int Age = 2023 -(1900+intAge) +1;
		System.out.println(Age);
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char a = jumin.charAt(7);
		
		if(a == '1') {
			System.out.println("남성");
		}
		else if(a=='2') {
			System.out.println("여성");
		}
		
		
		
		

	}

}
