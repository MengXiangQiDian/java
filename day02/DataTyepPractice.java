package day02;

public class DataTyepPractice {
    public static void main(String[] args) {
            short s = 12;
            //s = s - 9;  //错误，int -> short
            byte b = 10;
            //b = b + 11; //错误，int ->byte
            b = (byte)(b + 11); //正确，强制转换
            char c = 'a'; 
            int i = 16;
            float d = .314F;
            double result = c + i + d; //float -> double(选取精度最高的数据类型)
            byte m = 16 ;
            short n = 14;
            //short t = m + n; //错误，byte和short自动转换成int，int -> short
    }
}
