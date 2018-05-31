package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
	
	public static int getSum(Map<BookInfo, Integer> books) {
		Set<Map.Entry<BookInfo, Integer>> set = books.entrySet();
		int sum = 0;
		for (Iterator<Map.Entry<BookInfo, Integer>> it = set.iterator(); it.hasNext();) {
			Map.Entry<BookInfo, Integer> entry = it.next();
			sum += entry.getKey().getmPrice() * entry.getValue();
		}
		return sum;
	}
	
	private Map<BookInfo, Integer> mBooks;
	
	public ShoppingCart() {
		mBooks = new HashMap<BookInfo, Integer>();
	}
	
	public int add(BookInfo bookInfo, int num) {
		
		Integer oldValue = mBooks.get(bookInfo);
		if (oldValue != null ) {
			mBooks.put(bookInfo, oldValue + num);
			return oldValue + num;
		} else {
			mBooks.put(bookInfo, num);
			return num;
		}
		
		//返回现有数量
		
	}

	public Map<BookInfo, Integer> getmBooks() {
		return mBooks;
	}
	
}
