package day02;

public class CharType {
	public static void main(String[] args) {
		//字符类型可以表示单个字char符，字符类型是char，是两个字节(可以存放汉字)，多个字符串我们用String
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '张';
		char c4 = 97; //可以直接存放数字
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); //当输出c4的时候会输出97表示的字符(编码)
		
		
		//1.字符常量是单引号括起来的单个字符
		//2.转义字符“\”将期其后的字符转换为特殊字符常量
		//3.java中char的本质是一个整数，输出时，时Unicode码对应的字符
		//4.char类型是可以进行运算的，相当于一个整数
		char c5 = 98;
		System.out.println(c5); //b
		
		char c6 = 'd';  //输出d对应得数字
		System.out.println((int)c6);//100
		char c7 = '张';
		System.out.println((int)c7);//24352 
		
		
		//测试
		char c8 = 'a'+1; //97+1==> 98
		System.out.println((int)c8); //98
		System.out.println(c8); //98对应的字符
		
		//字符型存储到计算机中需要将对应的码值(整数)找出来
		//存储：'a'==>码值97==>二进制==>存储
		//读取：二进制==>97==>'a'==>显示
		
	}
}
