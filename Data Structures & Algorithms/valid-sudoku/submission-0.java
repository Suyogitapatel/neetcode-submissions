class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set st = new HashSet();
        for(int i=0; i<9; ++i){
            for(int j=0; j<9; ++j){
                char num = board[i][j];
                if(num != '.'){
                    if(!st.add(num + "row" + i)||
                       !st.add(num + "column" + j)||
                       !st.add(num + "block" + i/3 + j/3))
                       return false;
                }
            }
        }
        return true;
        
    }
}
