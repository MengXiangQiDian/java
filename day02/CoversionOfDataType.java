package day02;

public class CoversionOfDataType {
	public static void main(String[] args) {
		//java程序进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型(自动类型转换)
		//数据类型按精度大小排序：char<int<long<float<double
		//				   byte<short<int<long<float<double
		int num = 'a'; //char -> int
		double d = 80; // int -> double
		System.out.println(num); //97
		System.out.println(d); //80.0
		
		
		//注意事项:
		//1.有多种类型的数据混合运算时，系统首先将所有数据类型转化成容量最大的数据类型，在进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1;//错误 n1+1.1结果为double类型
		//double d1 = n1 + 1.1; //n1+1.1结果为double类型
		float d1 = n1 + 1.1F;//n1+1.1的结果为float类型
		//2.把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之会进行自动类型转换
		//int n2 = 1.1;
		//3.(byte,short)和char之间不会相互自动转换
		//当把一个具体的数赋值给byte时，先判断该数是否在byte范围内，如果在就可以
		byte b1 = 10; //对，-127到128之间
		int n2 = 1;
		//byte b2 = n2;//错误 ，变量赋值判断类型，int赋值给byte不行
		//char c1 = b1; //错误，byte不能自动转换为char
		
		//4.byte,short,char三者计算时，首先转换为int
		
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 3;
		//short s2 = b2 +s1;  //b2+s1 ->int,int不能转换成short
		int s2 = b2 + s1; //对
		//short b4 = b2 + b3; //b2+b3 ->int,int不能转换成short
		
		//5.boolean不参与自动转换
		boolean pass = true;
		//int num1 = pass; //错，boolean不参与自动转换
		
		//6.自动提升原则:表达式结果的类型自动提升为操作数中最大的类型
		
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double num5 = b4 + s3 + num200 +num300; //num300精度最高，选double类型
		System.out.println(num5);
		
		//强制类型转换
		//将精度高的数据类型转换为精度小的数据类型
		int n5 = (int)1.9;
		System.out.println("n5="+n5);//1,造成精度损失
		
		int n6 = 2000;
		byte b6 = (byte)n6;
		System.out.println("b6="+b6);//-48，造成数据溢出
		
		//int x = (int)10*3.5+6*1.5;//编译错误：double ->int
		int x = (int)(10*3.5+6*1.5);//(int)44.0
		System.out.println(x);
			
		
		char c1 = 100;
		int m = 100;
		//char c2 = m; //错，int ->char
		char c3 = (char)100;
		System.out.println(c3);
	}
}
