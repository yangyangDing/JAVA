import java.util.ArrayList;
public class Niuke19 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return null;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0, bot = row - 1, left = 0, right = col - 1;

        ArrayList<Integer> arrlist = new ArrayList();
        while (top <= bot && left <= right) {
            //往右
            for(int j = left; j <= right; j++) {
                arrlist.add(matrix[top][j]);
            }

            //往下
            for(int i = top + 1; i <= bot; i++) {
                arrlist.add(matrix[i][right]);
            }

            //往左
            for(int j = right - 1; j >= left && top < bot; j--) {
                arrlist.add(matrix[bot][j]);
            }

            //往上
            for(int i = bot - 1; i > top && left < right; i--) {
                arrlist.add(matrix[i][left]);
            }
            left++;top++;right--;bot--;
        }
        return arrlist;
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1},{2},{3},{4},{5}};
        ArrayList al = printMatrix(matrix);
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i) + ",");
        }
    }
}
