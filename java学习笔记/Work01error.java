import java.util.Scanner;

/**
 * @author zhang
 */
public class Work01error {
    public static void main(String[] args) {
        System.out.println("请输入一个浮点数：");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int num1 = (int)(number);
        double num3= number - num1;
        System.out.println(number+"的整数部分:"+num1);
        System.out.println(number+"的小数部分是:"+num3);
    }
}
