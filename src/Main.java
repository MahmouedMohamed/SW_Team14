import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();

        for(int i = 0 ; i < n; ++i){
            int x = sc.nextInt();
            a.add(x);
        }

        findMedian();
    }

    public static void max3(ArrayList<Integer> a){
        Collections.sort(a); // sorted in ascending order
        Collections.reverse(a); // now is sorted in descending order
        System.out.println("First Maximum Number : " + a.get(0));
        System.out.println("Second Maximum Number : " + a.get(1));
        System.out.println("Third Maximum Number : " + a.get(2));
    }
     public static void findMedian(ArrayList<Integer> a)
    {
       System.out.println("to get median of elements ");
        System.out.println("please  enter number of elements");
        Scanner s=new Scanner(System.in);
       

        Arrays.sort(a);
        double median;
        if (a.length % 2 == 0) {
            median = ((double) a[a.length / 2] + (double) a[a.length / 2 - 1]) / 2;
            System.out.println("the median is "+median);
        }
        else {
            median = (double) a[a.length / 2];
            System.out.println("the median is "+median);
        }



    }
}
