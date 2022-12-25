package hijava.practice;

public class problem3 {
	// 구구단 2단 ~ 9단
	public static void main(String[] args) {
		int j = 1;
		int i;
		int sum;
		
		
		for(i = 2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				sum = i*j;
				System.out.println(i + "*" + j + "= " + sum);
			}
			System.out.println(" ");
		}

	}

}
