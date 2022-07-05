package day02;

public class PlusSign {
	public static void main(String[] args) {
		//两边都是数值型时做加法运算
		//当左右两边有一个为字符串型则做拼接运算
		System.out.println(100+98); //198
		System.out.println("100"+98); //10098
		System.out.println(100+3+"hello"); //103hello
		System.out.println("hello"+100+3); //hello1003
	}
}
