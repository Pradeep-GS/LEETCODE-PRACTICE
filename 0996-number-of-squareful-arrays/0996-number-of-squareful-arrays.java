class Solution {
    int count = 0;

    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        boolean vis[] = new boolean[len];
        List<Integer> lis = new ArrayList<>();
        solve(0, nums, vis, lis, len);
        return count;
    }

    public void solve(int index, int[] nums, boolean vis[], List<Integer> temp, int len) {
        if (index == len) {
            count++;
            return;
        }

        for (int i = 0; i < len; i++) {
            if(vis[i]){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue;
            }
            if(temp.size()>0){
                int prev = temp.get(temp.size() - 1);
                if(!isperfectSquare(prev+nums[i])){
                    continue;
                }
            }
            vis[i]=true;
            temp.add(nums[i]);
            solve(index+1, nums, vis, temp, len);
            temp.remove(temp.size() - 1);
            vis[i]=false;
        }
    }

    public static boolean isperfectSquare(int n) {
        int sqr = (int) Math.sqrt(n);
        return sqr * sqr == n;
    }
}