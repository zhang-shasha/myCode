import java.util.Scanner;

/**
 * @author zhang
 */
public class Work05 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number+"的因子有：");
        for(int i =1 ;i<=number;i++){
            if(number%i==0){
                System.out.print(i+",");
            }
        }
    }

}
