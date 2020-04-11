import java.util.Calendar;
import java.util.Scanner;

/**
 * @author zhang
 */
public class Work03 {
    public static void main(String[] args) {
        // 创建一个 Calendar 对象 
        Calendar cal = Calendar.getInstance();

        Scanner sc =new Scanner(System.in);
        System.out.print("请输入年份:");
        int year =sc.nextInt();
        System.out.print("请输入月份:");
        int month =sc.nextInt();
        System.out.print("请输入日期:");
        int date =sc.nextInt();

        // 为对象设定年月日
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,date);

        // 调用 方法 获取 结果
        int result1 = cal.get(Calendar.DAY_OF_YEAR);
        int result2 = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+"-"+month+"-"+date);
        System.out.println("是这一年的第："+result1+"天");

        // 在一星期的第几天 --> 星期几
        dayToWeek(result2);




    }
    public static void dayToWeek(int result2) {
        switch (result2) {
            case 1:
               System.out.print("星期日");break;
            case 2:
                System.out.print("星期一");break;
            case 3:
                System.out.print("星期二");break;
            case 4:
                System.out.print("星期三");break;
            case 5:
                System.out.print("星期四");break;
            case 6:
                System.out.print("星期五");break;

            case 7:
                System.out.print("星期六");break;
            default:
                System.out.println("输入的日期有误！");
        }
    }
}
