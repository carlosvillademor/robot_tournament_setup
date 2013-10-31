package robot;


public class Robot {
    private final String board;

    public Robot(String board) {
        //To change body of created methods use File | Settings | File Templates.
        this.board = board;
    }

    public int move() {
        char[] boardArray = board.toCharArray();
        return (checkHorizontalBlocks(boardArray)) ;
    }

    private int checkHorizontalBlocks(char[] boardArray) {
        for (int position = 0; position < 7; position+=3) {
            if(boardArray[position] == boardArray[position + 2] && boardArray[ position+1] == '-') return position +1;
        }
        for (int position = 0; position < 3; position++) {
            if(boardArray[position] == boardArray[position + 6] && boardArray[ position+3] == '-') return position +3;
            if(boardArray[position] == boardArray[position + 3] && boardArray[ position+6] == '-') return position +6;
        }
        return board.indexOf("-");
    }

    public String player() {
        int count = 0;
        for (int i = 0; i < board.length(); i++) {
            if (board.toCharArray()[i] == '-') {
                count += 1;
            }
        }
        if (count % 2 == 1) return "0";
        else return "X";
    }

}
