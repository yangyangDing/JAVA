public class Niuke02 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("hello world2");

        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {

        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
           // System.out.println(temp);
            if(temp == ' ') {
                res += "%20";
            }else {
                res += temp;
            }
        }
        return res;
    }
}
