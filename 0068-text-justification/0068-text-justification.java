class Solution {
    public List<String> fullJustify(String[] words, int  maxWidth) {
        List<String> list = new ArrayList<>();
        int tc = 0;
        int wc = 0;
        int start = 0;
        for(int i=0;i<words.length;i++){
            tc+=words[i].length();
            wc++;
            if(tc+wc-1 > maxWidth){
                i--;
                text(words,maxWidth,list,start,i,false);
                start=i+1;
                tc=0;
                wc =0;
            }
        }
        text(words,maxWidth,list,start,words.length-1,true);
        return list;
    }

    public static void text(String [] words,int max , List<String> list , int start , int end , boolean last){
        if(last || start==end){
            StringBuilder sb = new StringBuilder();
            for(int i=start;i<=end;i++){
                sb.append(words[i]);
                if(i!=end){
                    sb.append(" ");
                }
            }
            while(sb.length() < max){
                sb.append(" ");
            }
            list.add(sb.toString());
            return;
        }
        int tc = 0;
        List<StringBuilder> temp = new ArrayList<>();

        for(int i=start;i<=end;i++){
            temp.add(new StringBuilder(words[i]));
            tc+=words[i].length();
        }

        int rem = max-tc;
        int index = 0;

        while(rem>0){
            temp.get(index).append(" ");
            index++;
            rem--;
            if(index==temp.size()-1){
                index=0;
            }
        }
        StringBuilder ss = new StringBuilder();
        for(StringBuilder s:temp){
            ss.append(s);
        }
        list.add(ss.toString());
        

    }
}