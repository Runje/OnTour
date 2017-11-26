package blue.koenig.ontour.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import blue.koenig.ontour.Model.City;
import blue.koenig.ontour.Model.Map;

/**
 * Created by Thomas on 11.08.2017.
 */

public class MapView extends android.support.v7.widget.AppCompatImageView{

    private Map map;

    public void setMap(Map map) {
        this.map = map;
    }

    public MapView(Context context) {
        super(context);
    }

    public MapView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MapView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint linePaint = new Paint();
        linePaint.setColor(Color.RED);
        canvas.drawLine(0,0, canvas.getWidth(), canvas.getHeight(), linePaint);

        if (map != null) {
            for (City city :
                    map.cities) {
                canvas.drawCircle(city.x * canvas.getWidth(), canvas.getHeight() * city.y, canvas.getHeight() / 50, linePaint);
            }
        }
    }
}
