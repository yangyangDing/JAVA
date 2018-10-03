public class Niuke37 {
    public static int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
        if(k < array[0] || k > array[array.length - 1]) return 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == k) {
                count++;
            }
            if(array[i] > k){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5};
        System.out.print(GetNumberOfK(a,3));
    }
}
