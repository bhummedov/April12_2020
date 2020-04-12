package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class DerivativeArray {
    public static void main(String[] args) {
        ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(derivative(num2));

    }
    public static ArrayList<Integer> derivative(ArrayList<Integer> num1){
        ArrayList<Integer> num3 = new ArrayList<>();
            for(int i=0; i<num1.size()-1; i++){
                num3.add(num1.get(i+1)-num1.get(i));
        }
        return num3;
    }
}
