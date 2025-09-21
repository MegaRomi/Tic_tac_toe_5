package com.example.tictactoe_5_therightone;
public class GameModule {
    //public static int xwin=0;
    //public static int owin=1;

    public int Is_Win(Cell[][] arr) {
        // 0=x win
        // 1=o win
        // 2 = no win
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 5; k++) {
                if (arr[i][k].get_value() == 0 &&
                        arr[i + 1][k].get_value() == 0 &&
                        arr[i + 2][k].get_value() == 0 &&
                        arr[i + 3][k].get_value() == 0) {
                    return 0;
                }
                if (arr[k][i].get_value() == 0 &&
                        arr[k][i + 1].get_value() == 0 &&
                        arr[k][i + 2].get_value() == 0 &&
                        arr[k][i + 3].get_value() == 0) {
                    return 0;
                }
                if (arr[i][k].get_value() == 1 &&
                        arr[i + 1][k].get_value() == 1 &&
                        arr[i + 2][k].get_value() == 1 &&
                        arr[i + 3][k].get_value() == 1) {
                    return 1;
                }
                if (arr[k][i].get_value() == 1 &&
                        arr[k][i + 1].get_value() == 1 &&
                        arr[k][i + 2].get_value() == 1 &&
                        arr[k][i + 3].get_value() == 1) {
                    return 1;
                }

            }

        }
        if (arr[0][0].get_value()==0 &&
                arr[1][1].get_value() == 0 &&
                arr[2][2].get_value() == 0 &&
                arr[3][3].get_value() == 0){
            return 0;

        }
        if (arr[1][1].get_value()==0 &&
                arr[2][2].get_value() == 0 &&
                arr[3][3].get_value() == 0 &&
                arr[4][4].get_value() == 0){
            return 0;

        }
        if (arr[0][0].get_value()==1 &&
                arr[1][1].get_value() == 1 &&
                arr[2][2].get_value() == 1 &&
                arr[3][3].get_value() == 1){
            return 1;

        }
        if (arr[1][1].get_value()==1 &&
                arr[2][2].get_value() == 1 &&
                arr[3][3].get_value() == 1 &&
                arr[4][4].get_value() == 1){
            return 1;

        }
        if (arr[0][4].get_value()==0 &&
                arr[1][3].get_value() == 0 &&
                arr[2][2].get_value() == 0 &&
                arr[3][1].get_value() == 0){
            return 0;

        }
        if (arr[1][3].get_value()==0 &&
                arr[2][2].get_value() == 0 &&
                arr[3][1].get_value() == 0 &&
                arr[4][0].get_value() == 0){
            return 0;

        }
        if (arr[0][4].get_value()==1 &&
                arr[1][3].get_value() == 1 &&
                arr[2][2].get_value() == 1 &&
                arr[3][1].get_value() == 1){
            return 1;

        }
        if (arr[1][3].get_value()==1 &&
                arr[2][2].get_value() == 1 &&
                arr[3][1].get_value() == 1 &&
                arr[4][0].get_value() == 1){
            return 1;

        }
        int x=0;
        int y=0;
        if (arr[x+1][y].get_value()==0 &&
                arr[x + 2][y + 1].get_value() == 0 &&
                arr[x + 3][y + 2].get_value() == 0 &&
                arr[x + 4][y + 3].get_value() == 0){
            return 0;

        }
        if (arr[x][y+1].get_value()==0 &&
                arr[x + 1][y + 2].get_value() == 0 &&
                arr[x + 2][y + 3].get_value() == 0 &&
                arr[x + 3][y + 4].get_value() == 0){
            return 0;

        }
        if (arr[x+1][y].get_value()==1 &&
                arr[x + 2][y + 1].get_value() == 1 &&
                arr[x + 3][y + 2].get_value() == 1 &&
                arr[x + 4][y + 3].get_value() == 1){
            return 1;

        }
        if (arr[x][y+1].get_value()==1 &&
                arr[x + 1][y + 2].get_value() == 1 &&
                arr[x + 2][y + 3].get_value() == 1 &&
                arr[x + 3][y + 4].get_value() == 1){
            return 1;

        }
        if (arr[0][3].get_value() ==0 &&
                arr[1][2].get_value()==0 &&
                arr[2][1].get_value()==0 &&
                arr[3][0].get_value()==0){
            return 0;
        }
        if (arr[1][4].get_value() ==0 &&
                arr[2][3].get_value()==0 &&
                arr[3][2].get_value()==0 &&
                arr[4][1].get_value()==0){
            return 0;
        }
        if (arr[0][3].get_value() ==1 &&
                arr[1][2].get_value()==1 &&
                arr[2][1].get_value()==1 &&
                arr[3][0].get_value()==1){
            return 1;
        }
        if (arr[1][4].get_value() ==1 &&
                arr[2][3].get_value()==1 &&
                arr[3][2].get_value()==1 &&
                arr[4][1].get_value()==1){
            return 1;
        }


        return 2;
    }
}

