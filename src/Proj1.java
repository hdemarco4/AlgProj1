import java.util.*;
import java.util.Scanner;

public class Proj1 {

    public static void main(String[] args){
        Set<String> nums = new HashSet<>();

        System.out.print("enter a value for n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        String l = "";


        nums.add(Integer.toString(n));

        splitter(n, n, nums, l, i);

        System.out.println(nums);
    }

    public static void splitter(int n,int o, Set nums, String l, int i){
        i++;

        do{
            o = o - i;
            l = l + " + " + i;
            nums.add(o+l);
        }while(o>1);

        if(i < n/2){
            splitter(n, n, nums, "", i);
        }

    }

}