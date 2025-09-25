package com.example.tictactoe_5_therightone;

public class Position {
    private int row, col;
    public Position()
    {

    }
    public Position(int row,int col)
    {
        this.col=col;
        this.row=row;
    }
    public int getCol()
    {
        return col;
    }
    public int getRow()
    {
        return row;
    }
    public void SetRow(int row)
    {
        this.row = row;
    }
    public void SetCol(int col)
    {
        this.col = col;
    }

}
