package com.example.tictactoe_5_therightone;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Cell {
    private int x_cell;
    private  int y_cell;
    private int x_mouse;
    private  int y_mouse;
    private int o_value = 1;
    private int x_value = 0;
    private  int empty = 2;
    private int value;
    private int cell_width;
    Bitmap pic_x, pic_o;
    private Paint p;

    public Cell(int x_cell, int y_cell,int cell_width,Bitmap pic_x,Bitmap pic_o)
    {
        this.x_cell = x_cell;
        this.y_cell = y_cell;
        this.value = empty;
        this.cell_width = cell_width;
        this.pic_x = pic_x;
        this.pic_o = pic_o;
        this.p = new Paint();
    }
    public void Draw(Canvas canvas)
    {
        p.setStrokeWidth(15);
        p.setStyle(Paint.Style.STROKE);
        canvas.drawRect(x_cell,y_cell,x_cell+cell_width,y_cell+cell_width,p);
        if (value==x_value)
        {
            canvas.drawBitmap(pic_x,x_cell+10,y_cell+10,null);
        }
        if (value==o_value)
        {
            canvas.drawBitmap(pic_o,x_cell+10,y_cell+10,null);
        }
    }
    public boolean Set_value(int value)
    {
        if(this.value==empty)
        {
            this.value = value;
            return true;
        }
        return false;

    }
    public int get_value(){
        return value;
    }
    public boolean Is_EMPTY()
    {
        return this.value==empty;
    }




}
