package ch03_operation;

public class Ex01_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, k=3;
		System.out.printf("%d, %d, %d \n", k/i, i++, --k);
		System.out.printf("%.1f, %d, %d \n", (double)k/i, i++, --k);
		
		String s = new String("Hello");
		System.out.println(s.equals(5));
		
		//성적이 70 이상이면 합격, 아니면 불
		int score = 0;
		score = 40 + (int)(60 * Math.random());
		char grade = score >= 70 ? '급' : '낙';
		System.out.printf("%d, %c\n", score, grade);
	}

}
