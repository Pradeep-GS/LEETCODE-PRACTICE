class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean visited [] = new boolean[nums.length];
        solve(0,nums,arr,temp,visited);
        return arr;
    }
    public  void solve(int index , int []arr,List<List<Integer>> ans,List<Integer> temp,boolean visited []){
        if(index == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            temp.add(arr[i]);
            solve(index+1,arr,ans,temp,visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}