public class GameEngine{
private char[][]board;
private char currentPlayer;

public GameEngine(){
board = newchar[3][3];
currentPLayer = 'X';
initializeBoard();
}

private void initializeBoard(){
for(int i = 0; i < 3; i++){
for(int j = 0; j < 3; j++){
board[i][j] = '-';
}
}
}
//TODO: Implement game logic methods
}
public boolean makeMove(int row, int col){
if(row < 0 || row >= 3 || col < 0 || col >= 3){
return false; //invalid position
}
if(board[row][col]!= '-'){
return false; //Position already taken
}
board[row][col] = currentPlayer;
return true;
}

public void switchPlayer(){
currentPLayer = (currentPLayer == 'X')?'O' : 'X';
}
}
