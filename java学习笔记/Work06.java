import java.util.Scanner;

/**
 * @author zhang
 */
public class Work06 {
    public static void main(String[] args) {
        System.out.println("请输入一个十进制数");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        String str = Integer.toHexString(number);
        System.out.println(number+"的十六进制是:"+str);


    }

}
