package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferencesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArr= new ArrayList<>( Arrays.asList(3,6,9));
        difference(myArr);
    }
    private static void difference(ArrayList<Integer> arr) {
        ArrayList<Integer> diff =new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            for (int j = i; j <arr.size() ; j++) {
                if(i!=j){
                    diff.add( Math.abs( arr.get( i ) -arr.get( j )) );
                }
            }
        }
        System.out.println(diff);
    }
}