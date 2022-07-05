package day02;

public class BooleanType {
	public static void main(String[] args) {
		//java语言不可以用0或者非0的整数代替false和true;
		//定义了一个布尔变量
		//boolean isPass = true;
		boolean isPass = false;
		if (isPass == true) {
			System.out.println("考试通过，恭喜！");
		} else {
			System.out.println("考试不通过，下次努力！");
		}
	}
}
