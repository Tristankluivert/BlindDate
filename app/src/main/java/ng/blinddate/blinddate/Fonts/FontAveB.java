package ng.blinddate.blinddate.Fonts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


@SuppressLint("AppCompatCustomView")
public class FontAveB extends TextView {

    public FontAveB(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FontAveB(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAveB(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "AvenirLTStd-Book.otf");
            setTypeface(tf);
        }
    }

}