package model;

public class BookInfo {
	private String mBookName;
	private int mPrice;
	
	public BookInfo(String mBookName, int mPrice) {
		super();
		this.mBookName = mBookName;
		this.mPrice = mPrice;
	}

	public String getmBookName() {
		return mBookName;
	}

	public int getmPrice() {
		return mPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		BookInfo bookInfo = (BookInfo) obj;
		
		if (
				this.mBookName.equals(bookInfo.getmBookName()) &&
				this.mPrice == bookInfo.getmPrice())
			return true;
		else return false;
	}

	@Override
	public int hashCode() {
		return mBookName.hashCode() + mPrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
}
