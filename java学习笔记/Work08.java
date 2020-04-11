import java.util.Scanner;

/**
 * @author zhang
 */
public class Work08 {
    public static void main(String[] args) {
        System.out.println("请输入要打印的杨辉三角的行数:");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println("二维数组实现：");
        demo1(number);
        System.out.println("一维数组实现：");
        demo2(number);


    }

    public static void demo1(int number){
        int [][] arr =new int[number][];
        for(int i = 0;i<number;i++){
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][arr[i].length-1]=1;
        }
        for(int i = 2;i<arr.length;i++){
            for(int j = 1;j<arr[i].length-1;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for (int[] ints : arr) {

            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void demo2(int number){
        int [] arr =new int [number];
        for(int i =0;i<number;i++){
            arr[i]=1;
            for(int j = i -1;j>0;j--){
                arr[j]=arr[j-1]+arr[j];
            }
            for(int j = 0;j<=i;j++){
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }


    }

}
