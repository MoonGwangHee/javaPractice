package hijava.practice;

public class problem2 {

	public static void main(String[] args) {
		int add = 0;
		
		for(int i=1; i<=1000; i++) {
			if((i%2) == 1) {
				add += i;
			}
		}
		System.out.println("1���� 1000������ Ȧ�� ���� = " + add );

	}

}
