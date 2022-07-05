package day02;

public class StringToBasicData {
    public static void main(String[] args) {
        String str = "123";
        //转换成int
        int n1 = Integer.parseInt(str); //123
        System.out.println(n1);
        //格式不正确会抛出异常，程序终止(异常处理)
    }
}
