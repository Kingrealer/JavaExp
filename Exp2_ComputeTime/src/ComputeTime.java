import java.lang.NumberFormatException;
import java.lang.reflect.InvocationTargetException;

import model.Car007;
import model.Plane;
import support.Common;

/**
 * java ComputeTime <String Model Name> <int Arg1> <int Arg2> <int Arg3>
 * */

public class ComputeTime {
	
	private static final String PACKAGE = "model.";
	private static final String WRONG_ARGS = "参数个数不正确！";
	
	public static void main(String[] args) {
		
		if (args.length != 4) {
			System.out.println(WRONG_ARGS);
			return;
		}
		
		Common common;
		
		String targetClass = PACKAGE + args[0];
		
		try {
			double a = Double.valueOf(args[1]);
			double b = Double.valueOf(args[2]);
			double c = Double.valueOf(args[3]);
			common = (Common) Class
					.forName(targetClass)
					.getConstructor(double.class, double.class, double.class)
					.newInstance(a, b, c);
			System.out.println(common.getTime());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("参数格式错误");
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("没有这个类");
		}
	}
}
