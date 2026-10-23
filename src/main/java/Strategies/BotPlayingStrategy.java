package Strategies;

import Models.Board;
import Models.Cell;
import Models.Player;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board, Player player);
}
