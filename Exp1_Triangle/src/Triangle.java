import java.awt.Point;
import java.util.Scanner;

public class Triangle {
	
	/*private Point2D.Double p1;
	private Point2D.Double p2;
	private Point2D.Double p3;
	
	public double getArea() {
		return Math.abs(0.5 * (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)));
	}
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1 = new Point2D.Double(x1, y1);
		p2 = new Point2D.Double(x2, y2);
		p3 = new Point2D.Double(x3, y3);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc.nextDouble());
		
		double x1, y1, x2, y2, x3, y3;
		
		System.out.println("请输入第一个点的坐标(x, y)");
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.println("x1: " + x1 + "   y1: " + y1);
		
		System.out.println("请输入第二个点的坐标(x, y)");
		
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		System.out.println("x2: " + x2 + "   y2: " + y2);
		
		System.out.println("请输入第三个点的坐标(x, y)");
		
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		System.out.println("x3: " + x3 + "   y3: " + y3);
		
		Triangle t = new Triangle(x1, y1, x2, y2, x3, y3);
		
		System.out.println("三角形的面积为：" + t.getArea());
	}*/
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	public double getArea() {
		return Math.abs(0.5 * (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)));
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, y1, x2, y2, x3, y3;
		
		System.out.println("请输入第一个点的坐标(x, y)");
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		
		System.out.println("x1: " + x1 + "   y1: " + y1);
		
		System.out.println("请输入第二个点的坐标(x, y)");
		
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		System.out.println("x2: " + x2 + "   y2: " + y2);
		
		System.out.println("请输入第三个点的坐标(x, y)");
		
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		
		System.out.println("x3: " + x3 + "   y3: " + y3);
		
		Triangle t = new Triangle(x1, y1, x2, y2, x3, y3);
		
		System.out.println("三角形的面积为：" + t.getArea());
	}
}
