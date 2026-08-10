class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        solve(s,0,new ArrayList<>());
        return ans;
    }
    public void solve(String s , int index , List<String> temp){
        if (index == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(ispalindrome(s,index,i)){
                temp.add(s.substring(index, i + 1));
                solve(s , i+1 ,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String s , int l , int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}