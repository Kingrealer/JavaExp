import java.util.Scanner;

import model.BookInfo;
import model.ShoppingCart;

public class ShoppingEntry {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the name of the book:");
			String name = sc.next();
			System.out.println("Please enter the price of the book:");
			int price = sc.nextInt();
			System.out.println("Please enter the number of the book:");
			int num = sc.nextInt();
			BookInfo bookInfo = new BookInfo(name, price);
			shoppingCart.add(bookInfo, num);
		}
		System.out.println(ShoppingCart.getSum(shoppingCart.getmBooks()));
	}
}
