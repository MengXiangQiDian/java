package day02;

public class ConversionOfPrimitiveDataTypesAndStringTypes {
    public static void main(String[] args) {
        //基本数据类型转换成String
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String str1 = n1 + "";
        String str2 = f1 + "";
        String str3 = d1 + "";
        String str4 = b1 + "";
        System.out.println(str1 + "" + str2 + "" + str3 + "" + str4 + "");

        //String转换对应的基本类型
        String str5 = "123";
        //通过基本类型的包装类parseXX对象和方法
        //使用基本数据类型对应的包装类的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(str5);
        double num2 = Double.parseDouble(str5);
        float num3 = Float.parseFloat(str5);
        long num4 = Long.parseLong(str5);
        byte num5 = Byte.parseByte(str5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(str5);


        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);//true

        //String -> char 得到字符串的第一个字符
        //str5.charAt(0)的到字符串的第一个字符 '1'
        System.out.println(str5.charAt(0));


        //注意事项
        //1.在将String类型转换成基本数据类型时，要确保string类型能够转换成有效的数据
        //如：我们可以将"123"转成一个整数，不能将"hello"转成一个整数
        //2.格式不正确会抛出异常
    }
}
