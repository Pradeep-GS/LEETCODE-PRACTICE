/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        List<Integer> dummy = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        inorder(root, dummy);

        for (int i : dummy) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        int max = 0;

        for (int freq : hmap.values()) {
            max = Math.max(max, freq);
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == max) {
                res.add(entry.getKey());
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }

    public void inorder(TreeNode root, List<Integer> dummy) {
        if (root == null) {
            return;
        }

        inorder(root.left, dummy);
        dummy.add(root.val);
        inorder(root.right, dummy);
    }
}