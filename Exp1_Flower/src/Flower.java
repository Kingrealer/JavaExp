
public class Flower{
	public static void main(String[] args){
		for (int i = 100; i < 1000; i++){
			int a = i / 100;	//��λ
			int b = (i / 10) % 10;	//ʮλ
			int c = i % 10;	//��λ
			
			if (i == a * a * a + b * b * b + c * c * c)
				System.out.println(i);
		}
	}
}