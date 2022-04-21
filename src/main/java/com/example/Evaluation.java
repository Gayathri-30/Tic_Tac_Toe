package com.example;


/**
 * Created by zilles on 8/31/17.
 *
 * This enumeration specifies the possible results of the evaluation of a Tic-Tac-Toe board.
 */
public enum Evaluation {
  noWinner, /* valid board, but the game hasn't been won by either player yet */
  xwins, /* valid board, and the game was won by player X */
  owins,invalidInput, /* valid board, and the game was won by player O */
  unreachableState /* string describes a board, but not a board state that is reachable from a valid game */
}
