package com.kdt.mcgui;

import android.content.*;
import android.graphics.drawable.GradientDrawable;
import android.util.*;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import net.kdt.pojavlaunch.R;

public class MineButton extends androidx.appcompat.widget.AppCompatButton {

    public MineButton(Context ctx) {
        this(ctx, null);
    }

    public MineButton(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        init();
    }

    public void init() {
        setTypeface(ResourcesCompat.getFont(getContext(), R.font.noto_sans_bold));
        setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen._13ssp));

        GradientDrawable bg = new GradientDrawable();
        bg.setShape(GradientDrawable.RECTANGLE);
        bg.setColor(ContextCompat.getColor(getContext(), R.color.minebutton_color));
        bg.setCornerRadius(8f);
        setBackground(bg);
    }
}
