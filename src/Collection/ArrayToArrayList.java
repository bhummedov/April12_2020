package Collection;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
    int[] num1 = {1,2,3,4};
    System.out.println(arrayList(num1));
}
    public static ArrayList<Integer> arrayList(int [] num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            arr.add(num[i]);
        }
        return arr;
    }
}
