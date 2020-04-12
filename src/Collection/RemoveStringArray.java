package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringArray {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("abs","cde", "fgr", "ide"));
        System.out.println(removeStringArray(arr1));

    }

    public static ArrayList<String> removeStringArray(ArrayList<String> name) {
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < name.size(); i++) {
            if (!(name.get(i).contains("a") || name.get(i).contains("e") || name.get(i).contains("i"))) {
                arr.add(name.get(i));
            }
        }
        return arr;
    }
}