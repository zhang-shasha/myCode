import java.util.Scanner;

/**
 * @author zhang
 */
public class Work04 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        if(number<2){
            System.out.println("输入的数据有误！");
        }else{
            if(isPrime(number)){
                System.out.println(number+"是素数");
            }else{
                System.out.println(number+"不是素数");
            }
        }
    }

    /**
     *
     * 用来判断是否为素数的方法
     * 
     */
    public static boolean isPrime(int number){
        boolean flag =true;
        for(int i = 2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }



}
