
public class Ticket {
	public static void main(String[] args) {
//		new Thread(new Seller(1)).start();
//		new Thread(new Seller(2)).start();
//		new Thread(new Seller(3)).start();
//		new Thread(new Seller(4)).start();
//		new Thread(new Seller(5)).start();
//		new Thread(new Seller(6)).start();
//		new Thread(new Seller(7)).start();
//		new Thread(new Seller(8)).start();
		new Seller(1).start();
		new Seller(2).start();
		new Seller(3).start();
		new Seller(4).start();
		new Seller(5).start();
	}
}


class Seller extends Thread {
	
	public static final int TICKET_NUM = 100;
	public static boolean[] sTickets;
	
	private static Object LOCK;
	
	static {
		sTickets = new boolean[TICKET_NUM];
		for (int i = 0; i < TICKET_NUM; i++) {
			sTickets[i] = true;
		}
		
		LOCK = new Object();
	}
	
	private int mSellerNum;
	
	public Seller(int mSellerNum) {
		super();
		this.mSellerNum = mSellerNum;
	}


	@Override
	public void run() {
		super.run();
		for (int i = TICKET_NUM - 1; i >= 0; i--) {
			synchronized (LOCK) {
				if (sTickets[i]) {
					sTickets[i] = false;
					System.out.println(mSellerNum + "_____" + (i + 1));
					try {
						LOCK.notify();
						LOCK.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
					}
				}
			}
		}
	}
	
}