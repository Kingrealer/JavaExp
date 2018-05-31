import java.util.InputMismatchException;
import java.util.Scanner;

public class IgnoreNonInteger {
	
	private static final int STOP = 999;
	
	public static void main(String[] args) {
		int sum = 0;
		int x = 0;
		while (x != STOP) {
			Scanner sc = new Scanner(System.in);	//д���ڲ���ֹ�����scanner����
			try {
				sum += x;
				x = sc.nextInt();
			} catch (InputMismatchException e) {
				x = 0;
			}
		}
		System.out.println(sum);
	}
}
