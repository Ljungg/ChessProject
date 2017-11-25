import Enumerators.Team;
import Pieces.Pieces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameLogic{
    private Team playerTurn = Team.WHITE;
    private Board board;
    private ArrayList<ArrayList<Pieces>> currentBoard;
    public GameLogic() throws IOException{
        this.board = new Board();
        this.currentBoard = board.getInstanceBoard();
    }
    public Team getPlayerTurn(){
        return this.playerTurn;
    }

}
