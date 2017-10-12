import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj1 {

    public static void main(String[] args){
        Set<String> nums = new HashSet<>();

        System.out.print("enter a value for n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        String l = "";
        int o = n;
        String p = "";
        String m;


        nums.add(Integer.toString(n));


        for(int d = 1; d <n; d++) {
            o = o-1;
            p = p + " + 1";

            nums.add(o + p);
        }


        if(n%2 == 0) {
            m = doubles(n, nums, l, i);
            nums.add(m);
        }
        else{
            m = doubles(n-1, nums, l, i);
            nums.add(m + " + 1");
        }

        System.out.println(nums);
    }


    public static String doubles(int n, Set nums, String l, int i){

        for(int j = 0; j<i ; j++) {
            l = Integer.toString(n / 2) + " + " + Integer.toString(n / 2);

            for (int k = 0; k < i; k++) {
                l = l + " + " + l;
            }


            i++;

            return l;
        }
        return l;
    }

}
