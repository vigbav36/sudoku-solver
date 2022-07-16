
public class Check{
    public boolean check(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    board[i][j]='.';
                    if( !checkCol(board, c, i, j))
                        return false;
                    if( !checkRow(board, c, i, j))
                        return false;
                    if( !checkBox(board, c, i, j))
                        return false;
                    board[i][j]=c;
                }
            }
            
        }
        return true;    
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
    
    
