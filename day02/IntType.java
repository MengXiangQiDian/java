package day02;

public class IntType {
	public static void main(String[] args) {
		//byte[1]范围-128~127
		//short[2]范围-(2^15)~2^15-1
		//int[4]范围2^31~2^31-1
		//long[8]范围2^63~2^63-1
		
		//java的整型常量默认值为int型，声明long型常量需后加“l”或者“L”
		//bit计算机最小的存储单位，1byte = 8 bit
		int n1 = 1;
		Long n2 = 2L;
		System.out.println(n1);
		System.out.println(n2);
		
	}
}
