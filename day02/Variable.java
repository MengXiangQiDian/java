package day02;
//变量是程序的基本组成单位
public class Variable {
	public static void main(String[] args) {
		//声明变量
		int a;
		//赋值
		a = 100;
		System.out.println(a);
		
		//声明并赋值
		int b =200; 
		System.out.println(b);
		
		int age = 30;
		double score = 90;
		String gender = "男";
		String name = "张佳";
		
		System.out.println(age);
		System.out.println(score);
		System.out.println(gender);
		System.out.println(name);

		//注意事项：
		//变量表示内存中的储存单位 int 4个字节 double 8个字节
		//变量必须先声明后使用
		//变量的值可以在同一类型内不断变化
		//变量在同一作用域不能重名
	}
}
