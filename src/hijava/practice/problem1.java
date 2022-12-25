package hijava.practice;

public class problem1 {
	// 1부터 100까지의 답을 구하시오 
	public static void main(String[] args) {
		int add = 0;
		
		// for 문을 돌면서 1부터 100까지의 답을 연산함.
		for(int i=1; i<=100 ; i++) {
			add = add + i;
		}
		System.out.println("1부터 100까지의 합은 " + add);
	}

}
