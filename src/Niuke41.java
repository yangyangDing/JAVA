import java.util.ArrayList;

public class Niuke41 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {


        ArrayList<ArrayList<Integer>> list = new ArrayList();
        if (sum < 3) return list;
        for (int i = 1; i <= sum / 2; i++) {
            ArrayList<Integer> arr = new ArrayList();
            int res = 0;
            int j = i;
            while (res < sum) {
                arr.add(j);
                res = res + j;
                j++;
            }
            if (res == sum)
                list.add(arr);

        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(9);
        System.out.println(list.toString());

    }
}
