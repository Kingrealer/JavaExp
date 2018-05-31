
public class Flower{
	public static void main(String[] args){
		for (int i = 100; i < 1000; i++){
			int a = i / 100;	//百位
			int b = (i / 10) % 10;	//十位
			int c = i % 10;	//个位
			
			if (i == a * a * a + b * b * b + c * c * c)
				System.out.println(i);
		}
	}
}