package com.example.tictactoe_5_therightone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Board extends View
{
    private Cell[][] arr;
    private  int canvas_width;
    private int cell_width, cell_high;
    private int count = 0;
    private boolean first_time;
    GameModule game;
    private Context context;
    public Board (Context context)
    {
        super(context);
        this.context=context;
        this.arr=new Cell[5][5];
        first_time=true;
        game = new GameModule();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (first_time)
        {
            canvas_width = canvas.getWidth();
            cell_width = canvas_width / 5;
            cell_high = cell_width;

            Bitmap picx = BitmapFactory.decodeResource(getResources(), R.drawable.x);
            Bitmap pico = BitmapFactory.decodeResource(getResources(), R.drawable.o);
            picx = Bitmap.createScaledBitmap(picx, cell_width - 10, cell_high - 10, false);
            pico = Bitmap.createScaledBitmap(pico, cell_width - 10, cell_high - 10, false);
            for (int i = 0; i < 5; i++)
            {
                for (int k = 0; k < 5; k++)
                {
                    arr[i][k] = new Cell(k * cell_width, i * cell_high, cell_width, picx, pico);
                }
            }
            first_time = false;
        }

        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                arr[i][k].Draw(canvas);
            }
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        int i =(int) y/cell_width;
        int k = (int) x/cell_high;
        if (i<5 && k<5)
        {
            if (arr[i][k].Is_EMPTY())
            {
                setNewValOnBoard(i,k);
                if (game.Is_Win(arr)==1)
                {
                    Toast.makeText(this.getContext(), "O win!", Toast.LENGTH_SHORT).show();
                    return true;
                }
                if (game.Is_Win(arr)==0)
                {
                    Toast.makeText(this.getContext(), "X win!", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
            else
            {
                Toast.makeText(this.getContext(), "not empty", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this.getContext(), "outside board", Toast.LENGTH_SHORT).show();
        }
        return  false;
    }

    private void setNewValOnBoard(int i, int k)
    {
        if (arr[i][k].Set_value(count)==true)
        {
            count=1-count;
        }
        invalidate();;
    }
    public Cell[][] getArr()
    {
        return arr;
    }
}
