class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        char chr []  = word.toCharArray();
        boolean [][] flag = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==chr[0]){
                    if(search(i,j,0,board,chr,flag)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(int r , int c , int index , char[][] board, char chr [] ,boolean [][] flag){
        if(index==chr.length){
            return true;
        }

        if(r<0 || c<0 ||  r>=board.length || c>= board[0].length){
            return false;
        }
        if(flag[r][c]){
            return false;
        }
        if(board[r][c]!=chr[index]){
            return false;
        }
        flag[r][c] = true;
        boolean res = search(r+1,c,index+1,board,chr,flag) || search(r-1,c,index+1,board,chr,flag) || search(r,c+1,index+1,board,chr,flag) || search(r,c-1,index+1,board,chr,flag);
        flag[r][c] = false;
        return res;
    }
}