import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author zhang
 */
public class Work01 {
    public static void main(String[] args) {
        System.out.println("请输入一个浮点数：");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        String s = String.valueOf(number);

        // 将浮点数 转换成 BigDecimal 类
        BigDecimal bd1 = new BigDecimal(s);
        BigDecimal bd2 = new BigDecimal((int)(number));

        //调用 substract 方法 进行 减法计算
        BigDecimal bd3 = bd1.subtract(bd2);

        //输出结果
        System.out.println(number+"的整数部分:"+bd2);
        System.out.println(number+"的小数部分是:"+bd3);

    }
}
