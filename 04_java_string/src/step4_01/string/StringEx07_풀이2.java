package step4_01.string;


public class StringEx07_풀이2 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
				
		
		String[] str1 = str.split(",");
		
		for (int i = 0; i < str1.length; i++) {
			String[] a = str1[i].split("/");
			
			name[i] = a[0];
			score[i] = Integer.parseInt(a[1]);
		}
		
		//결과
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+ " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+ " ");
		}
		System.out.println();
	}

}
