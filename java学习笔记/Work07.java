import java.util.Scanner;

/**
 * @author zhang
 */
public class Work07 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        // 字符串--> 字符数组
        char []arr1 =str.toCharArray();

        int []big =new int[26];
        int []small = new int[26];
        // 如果 字符串的字符 在 a~z 和 A~Z 之间 两个数组 的元素 + 1
        // 这里  big 和 small 存储的索引 都是 ASCII 码
        for(int i = 0;i<str.length();i++){
            if(arr1[i]>='A'&&arr1[i]<='Z'){
                big[arr1[i]-'A']++;
            }else if(arr1[i]>='a'&&arr1[i]<='z'){
                small[arr1[i]-'a']++;
            }
        }
        for(int i = 0;i<big.length;i++){
            if(big[i]!=0){
                System.out.print((char)('A'+i)+"出现的次数:"+big[i]+"\t");
            }
        }
        System.out.println();
        for(int i = 0;i<small.length;i++){
            if(small[i]!=0){
                System.out.print((char)('a'+i)+"出现的次数:"+small[i]+"\t");
            }
        }
    }
}
