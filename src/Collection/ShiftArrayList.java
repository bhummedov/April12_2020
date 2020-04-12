package Collection;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;

public class ShiftArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(removeStringArray(arr2, 2));
    }
    public static ArrayList<Integer> removeStringArray(ArrayList<Integer> arr, int num) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i =num; i < arr.size(); i++) {
            arr1.add(arr.get(i));

            }
        return arr1;
        }
    }

