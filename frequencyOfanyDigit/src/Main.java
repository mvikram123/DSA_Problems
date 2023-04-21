import java.util.*;

public class Main {

    static int FrequencyofDigits(long n, int d) {
        // write code here
        int count=0;
        while(n>0)
        {
            if(n%10==d)
            {
                count++;
            }
            n=n/10;
        }
        return count;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}
// input : 8944890545
           // 4
//output : 3