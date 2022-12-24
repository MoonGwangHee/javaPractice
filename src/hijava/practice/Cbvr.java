package hijava.practice;

public class Cbvr {
	int m = 2;
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i=" +i);
		
		change1(i);
		System.out.println("i=" +i);
	}
	public static void change1(int x) {
		x = 100;
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}
}
