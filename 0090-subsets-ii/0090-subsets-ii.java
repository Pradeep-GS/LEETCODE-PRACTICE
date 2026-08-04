class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0,nums,ans,temp);
        return ans;
    }

    public void solve(int index,int nums[] , List<List<Integer>> ans,List<Integer> temp){
        if (index==nums.length){
            if(!ans.contains(temp)){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[index]);
        solve(index+1,nums,ans,temp);
        temp.remove(temp.size()-1);
        solve(index+1,nums,ans,temp);
    }
}