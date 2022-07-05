package day02;

public class FloatType {
	public static void main(String[] args) {
		//java的浮点类型可以表示一个小数
		//浮点型：单精度float，双精度double
		//浮点数在计算机中存放形式：浮点数=符号位+指数位+尾数位(尾数位可能丢失)
		//java的浮点型常量默认位double型，声明float型，在后面必须加“f”或者“F”
		//
		//float n1 = 1.1;错误
		float n1 = 1.1F;
		double n2 = 1.1;
		double n3 = 1.1F;
	
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		//浮点型常量的两种表现形式：
		//十进制
		double n4 = .123; //等价于0.123
		System.out.println(n4);
		//科学计数法
		System.out.println(5.12e2);//512.0 小数点往前移动2位
		System.out.println(5.12E-2);//0.0512 小数点往后移动2位
		
		
		//通常情况，应使用double型，比float型更精确
		double n5 = 2.1115848;
		float n6 = 2.1115848F;
		System.out.println(n5);
		System.out.println(n6);
		
		//使用陷阱
		//对运算结果是小数的结果进行判断时要注意
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		double n7 = 2.7;  //2.7
		double n8 = 8.1/3; //接近2.7
		
		if(Math.abs(n7-n8)<0.0000001) {
			System.out.println("差值非常小，到我认定的精度范围内，认为相等...");
		}
		System.out.println(Math.abs(n7=n8));
		//如果是直接赋值或者查询得到的小数可以直接进行判断
	}
}
