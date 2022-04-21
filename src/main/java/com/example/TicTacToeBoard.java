package com.example;

/**
 * Takes in and evaluates a string representing a tic tac toe board.
 */
public class TicTacToeBoard {
  String board1;
  public TicTacToeBoard(String board) {
     board1=board.toLowerCase();
  }
public Evaluation evaluate(){
    int x_count=0;
    int o_count=0;
    if(board1.length()!=9)
    {
      return Evaluation.invalidInput;
    }
    for(int i=0;i<board1.length();i++)
    {
        if(board1.charAt(i)== 'x')
        {
            x_count++;
        }
        else{
            o_count++;
        }
    }
    
    boolean player_x=winner_of_the_game('x',board1);
    boolean player_o=winner_of_the_game('o',board1);
    
  
    if(Math.abs(x_count - o_count)<=2){
      return Evaluation.unreachableState;
    }

    if(player_o && player_x){
      return Evaluation.unreachableState;
    }
    else if(player_x){
      return Evaluation.xwins;
    }
    else if(player_o){
      return Evaluation.owins;
    }
    else{
      return Evaluation.noWinner;
    }

}

public static boolean winner_of_the_game(char val,String board1){
  
  if((board1.charAt(0)==val)&&(board1.charAt(1)==val)&&(board1.charAt(2)==val))
      return true;
  if((board1.charAt(3)==val)&&(board1.charAt(4)==val)&&(board1.charAt(5)==val))
      return true;
  if((board1.charAt(6)==val)&&(board1.charAt(7)==val)&&(board1.charAt(8)==val))
      return true;
  if((board1.charAt(0)==val)&&(board1.charAt(3)==val)&&(board1.charAt(6)==val))
      return true;
  if((board1.charAt(1)==val)&&(board1.charAt(4)==val)&&(board1.charAt(7)==val))
      return true;
  if((board1.charAt(2)==val)&&(board1.charAt(5)==val)&&(board1.charAt(8)==val))
      return true;
  if((board1.charAt(0)==val)&&(board1.charAt(4)==val)&&(board1.charAt(8)==val))
      return true;
  if((board1.charAt(2)==val)&&(board1.charAt(4)==val)&&(board1.charAt(6)==val))
      return true;
  return false;
}

public static void main(String args[]){
	TicTacToeBoard v1=new TicTacToeBoard("XXX...oo.");
  System.out.println(v1.evaluate());

}
}
