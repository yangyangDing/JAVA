public class Niuke01 {

    /*      1,2,8,9
            2,4,9,12
            4,7,10,13
            6,8,11,15
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 ||array[0] == null || array[0].length == 0)
            return false;
        else {
            int row = array.length - 1;
            int col = 0;

            while(row >= 0 && col <= array[0].length - 1) {
                if(target > array[row][col]) {
                    col++;
                }else if (target < array[row][col]) {
                    row--;
                }else {
                    return true;
                }
            }

            return false;
        }

    }

}
