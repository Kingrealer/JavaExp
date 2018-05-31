import java.util.InputMismatchException;
import java.util.Scanner;

public class IgnoreNonInteger {
	
	private static final int STOP = 999;
	
	public static void main(String[] args) {
		int sum = 0;
		int x = 0;
		while (x != STOP) {
			Scanner sc = new Scanner(System.in);	//写在内部防止不清除scanner数据
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
