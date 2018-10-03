public class Niuke04 {

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if(pre.length == 1) {
            TreeNode node = new TreeNode(pre[0]);
            node.left = null;
            node.right = null;
            return node;
        }else if(pre.length == 0) {
            return null;
        }
        else{
            int mid = pre[0];
            int index = 0;
            for(int i = 0; i < in.length; i++) {
                if(in[i] == mid) {
                    index = i;
                    break;
                }
            }
            int[] leftPre = new int[index];
            int[] leftIn = new int[index];
            int[] rightPre = new int[pre.length - index - 1];
            int[] rightIn = new int[in.length - index - 1];

            //左子树
            for(int i = 0; i < index; i++) {
                leftPre[i] = pre[i + 1];
                leftIn[i] = in[i];
            }

            //右子树
            for(int i = 0; i < rightPre.length; i++) {
                rightPre[i] = pre[index + 1 + i];
                rightIn[i] = in[index + 1 + i];
            }

            TreeNode node = new TreeNode(mid);
            node.left = reConstructBinaryTree(leftPre,leftIn);
            node.right = reConstructBinaryTree(rightPre,rightIn);
            return node;
        }

    }

    public static void main (String[] args) {
         int[] pre = {1,2,4,3,5,6};
         int[] in = {4,2,1,5,3,6};

         TreeNode testNode = new TreeNode(0);

        testNode = reConstructBinaryTree(pre,in);

        System.out.println(testNode.left.val);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}