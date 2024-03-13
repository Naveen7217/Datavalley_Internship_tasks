import java.util.*;
class Sum {
    public static void main(String[] args)
    {
        int []values={45,1,7,25,21,66};
        Arrays.sort(values);
        int length=values.length;
        int sum=values[length-2]+values[length-3];
        System.out.println(sum);

    }
}