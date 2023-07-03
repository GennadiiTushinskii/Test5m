public class TicTacToe {
    String [][] field;
    String player;

    TicTacToe(){
        newGame();
    }

    String [][] getField(){
        return this.field;
    }

    void newGame(){
        this.field = new String [][] {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        player = "X";
    }

    String makeMove(int x, int y){
        x-=1;
        y-=1;

        String check = this.checkGame();

        if (check != (null)) return "Game is ended";

        //proverim zanyata li kletka
        if (!field[x][y].equals("-")){
            return "Cell " + (x+1) + ", " + (y+1) + " is already occupied";
        }
        if (field[x][y].equals("-")) {
            field[x][y] = player;
        }

        check = this.checkGame();

        //proverim mozhet uzhe est winner
        if (check != (null)){
        if (check.equals("X")) return "Player X won";
        else if (check.equals("0")) return "Player 0 won";
        else return "Draw";
        }

        player = player.equals("X") ? "0" : "X";
        return "Move completed";
    }

    String checkGame(){

        //proverka po strokam na nalichie X
        for(int i = 0; i < 3; i++){
            boolean check = true;
            for(int j = 0; j < 3; j++ ){
                if(field[i][j].equals("0") || field[i][j].equals("-")) check = false;
            } if (check) return "X";
        }


        //proverka po strokam na nalichie 0
        for(int i = 0; i < 3; i++){
            boolean check = true;
            for(int j = 0; j < 3; j++ ){
                if(field[i][j].equals("X") || field[i][j].equals("-")) check = false;
            } if (check) return "0";
        }


        //proverka po stolbcam na nalichie X
        for(int i = 0; i < 3; i++){
            boolean check = true;
            for(int j = 0; j < 3; j++ ){
                if(field[j][i].equals("0") || field[j][i].equals("-")) check = false;
            } if (check) return "X";
        }


        //proverka po stolbcam na nalichie 0
        for(int i = 0; i < 3; i++){
            boolean check = true;
            for(int j = 0; j < 3; j++ ){
                if(field[j][i].equals("X") || field[j][i].equals("-")) check = false;
            } if (check) return "0";
        }

        //proverka po diagonali
        if (field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X")){
            return "X";
        }
        else if (field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X")){
            return "X";
        }
        if (field[0][0].equals("0") && field[1][1].equals("0") && field[2][2].equals("0")){
            return "0";
        }
        else if (field[0][2].equals("0") && field[1][1].equals("0") && field[2][0].equals("0")){
            return "0";
        }

        //ostalis li pustye polya
        for(int i = 0; i < 3; i++){
            boolean check = true;
            for(int j = 0; j < 3; j++ ){
                if(field[i][j].equals("-"))return null;
            }
        }
        return "D";
    }
}
