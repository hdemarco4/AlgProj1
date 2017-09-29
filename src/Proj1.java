import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj1 {

    public static void main(String[] args){
        Set<String> nums = new HashSet<>();

        System.out.print("enter a value for n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        String ones = "1";
        String l = "";
        int o = n;
        String p = "";

        nums.add(Integer.toString(n));

        int m = doubles(n, nums, l, i);

        for(int d = 1; d <n; d++) {
            o = o-1;
            p = p + " + 1";

            nums.add(o + p);

        }

        System.out.println(nums);
    }


    public static int doubles(int n, Set nums, String l, int i){


        if (n%2 == 0) {

                l = Integer.toString(n / 2) + " + " + Integer.toString(n / 2);

                for(int k = 0; k < i; k++) {
                    l = l + " + " + l;
                }

                nums.add(l);
                i++;

                doubles(n / 2, nums, l, i);
            }

        return n/2;

    }

}
