package com.tom.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Context;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PockerCard extends ConstraintLayout {
    int value;
    private ImageView typeImage;
    private TextView leftPoint;
    private TextView rightPoint;
    public PockerCard(Context context) {
        super(context);
    }
    public PockerCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card, this);
        typeImage = findViewById(R.id.type);
        leftPoint = findViewById(R.id.point_left_top);
        rightPoint = findViewById(R.id.point_right_bottom);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        int type = value/13;
        int point = (value%13) + 1;
        switch(type) {
            case 0:
                typeImage.setImageResource(R.drawable.spade);
                break;
            case 1:
                typeImage.setImageResource(R.drawable.heart);
                break;
            case 2:
                typeImage.setImageResource(R.drawable.diamond);
                break;
            case 3:
                typeImage.setImageResource(R.drawable.club);
                break;
        }
        leftPoint.setText(point+"");
        rightPoint.setText(point+"");
    }
}
