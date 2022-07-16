//solves sudoko puzzles

class solution{
    char[][] board;
    solution(char[][] Board){
        board=Board.clone();
    }

    public void solveSudoku(char[][] board) {
        solve(board,0,0);
        displayBoard(board);
    }

    public void displayBoard(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean solve(char[][] board , int row ,int col ){
        if(row==8 && col==9)
        return true;

        if(col==9){
            row++;
            col=0;
        }
        if(board[row][col]!='.')
        return solve(board,row,col+1);
        for(int i=1;i<=9;i++){
            char c =(char)(i+'0');
            if(checkBox(board,c,row,col) && checkRow(board, c, row, col) && checkCol(board, c, row, col)){
                board[row][col]=c;
                if(solve(board,row,col+1))
                return true;
            }
            board[row][col]='.';
        }

        return false;
    }

    public boolean checkBox(char[][] board , char x ,int row , int col){
        if( row <=2 && col <=2){
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    if(board[i][j]==x)
                    return false;
                }
            }
        }
        if(col>2 && col<=5 && row<=2){
            for(int i =0;i<=2;i++){
                for(int j=3;j<=5;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(col>5 && col<=8 && row<=2){
            for(int i =0;i<=2;i++){
                for(int j=6;j<=8;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>2 && row<=5 && col<=2){
            for(int i =3;i<=5;i++){
                for(int j=0;j<=2;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>2 && row<=5 && col>2 && col<=5){
            for(int i =3;i<=5;i++){
                for(int j=3;j<=5;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>2 && row<=5 && col>5 && col<=8){
            for(int i =3;i<=5;i++){
                for(int j=6;j<=8;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>5 && row<=8 && col<=2){
            for(int i =6;i<=8;i++){
                for(int j=0;j<=2;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>5 && row<=8 && col>2 && col<=5){
            for(int i =6;i<=8;i++){
                for(int j=3;j<=5;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        if(row>5 && row<=8 && col>5 && col<=8){
            for(int i =6;i<=8;i++){
                for(int j=6;j<=8;j++){
                    if(board[i][j]==x)
                    return false;                   
                }
            }
        }
        return true;
    }

    public boolean checkCol(char[][] board,char x,int row,int col){
        
        for(int i=0;i<9;i++){
            if(board[i][col]==x){
                return false;
            }
        }
        return true;
    }
    public boolean checkRow(char[][] board , char x , int row , int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==x){
                return false;
            }
        }
        return true;
    }
}

