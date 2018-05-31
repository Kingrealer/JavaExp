import java.util.InputMismatchException;
import java.util.Scanner;

public class IgnoreMinus {
	private static final int STOP = 999;
	
	public static void main(String[] args) {
		int sum = 0;
		int x = 0;
		while (x != STOP) {
			Scanner sc = new Scanner(System.in);	//д���ڲ���ֹ�����scanner����
			try {
				sum += x;
				x = sc.nextInt();
				if (x < 0)
					throw new MinusException();
			} catch (InputMismatchException e) {
				//e.printStackTrace();
				x = 0;
			} catch (MinusException e) {
				//e.printStackTrace();
				x = 0;
			}
		}
		System.out.println(sum);
	}
	
}

class MinusException extends Exception {
	public MinusException() {
		super();
	}
}