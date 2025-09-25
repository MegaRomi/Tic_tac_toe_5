package com.example.tictactoe_5_therightone;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FBModule {
    private Context context;
    public FBModule(Context context)
    {
        this.context=context;
        setPlayInFireBase(null);
        inItFireBaseListener();
    }

    public void inItFireBaseListener()
    {
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("play");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Position position=snapshot.getValue(Position.class);
                if (position!=null)
                {
                    ((GameActivity)context).setPlayInGameActivity(position);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void setPlayInFireBase(Position position)
    {
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference reference= database.getReference("play");
        reference.setValue(position);

    }
}
