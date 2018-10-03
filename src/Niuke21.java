import java.util.ArrayList;
public class Niuke21 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i = 0;
        for(int j = 0; j < pushA.length; j++) {
            al.add(pushA[j]);
            while(i <= popA.length - 1 && al.get(al.size() - 1) == popA[i]) {
                al.remove(al.size() - 1);
                i++;
            }
        }
        return al.size() == 0? true: false;

    }

    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
        int[] pop = {4,5,3,2,1};
        System.out.println(IsPopOrder(push,pop));
    }
}
