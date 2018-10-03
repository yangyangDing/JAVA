import org.omg.CORBA.DefinitionKind;

import java.util.ArrayList;

public class Niuke42 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList();
        if(array == null || array.length == 0) return list;
        if(array[0]*2 >= sum || array[array.length - 1]*2 <= sum) return list;

        int left = 0, right = array.length - 1;
        while(left < right) {
            int cur = array[left] + array[right];
            if(cur < sum ) {
                left++;
            }

            if(cur > sum) {
                right--;
            }

            if(cur == sum) {
                list.add(array[left]);

                list.add(array[right]);
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        ArrayList list = FindNumbersWithSum(a,21);
        System.out.println(list.toString());
    }
}
