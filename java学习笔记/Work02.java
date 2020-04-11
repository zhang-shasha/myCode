import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhang
 */
public class Work02 {
    public static void main(String[] args) {
        System.out.println("请输入10 个整型数字：");
        int []arr =new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i = 0;i<arr.length;i++) {
            arr[i] =sc.nextInt();
        }
        //调用 Array 类的 sort 升序排列方法
        Arrays.sort(arr);
        System.out.println("最大值："+arr[arr.length-1]);

        System.out.println("升序输出:");
        for(int x:arr){
            System.out.print(x+",");
        }
        System.out.println('\n');
        System.out.println("降序输出:");

        // 自编写 降序输出 方法 ，采用冒泡排序
        lowSort(arr);

        for(int x:arr){
            System.out.print(x+",");
        }

    }
    /**
     * 冒泡排序
     * 降序输出输入的整型数字
     */
    public static  void lowSort(int[] arr){
        int temp;
        for(int i = 0;i<arr.length;i++){
            for(int j =arr.length-1;j>i;j--){
                if(arr[j]>arr[j-1]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}





