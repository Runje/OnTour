package blue.koenig.ontour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import blue.koenig.ontour.Model.City;
import blue.koenig.ontour.Model.Map;
import blue.koenig.ontour.StockAPI.Stocks;
import blue.koenig.ontour.View.MapView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class GameActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        MapView mapView = (MapView) findViewById(R.id.map);

        Map map = new Map();
        map.add(new City("Stuttgart", 0.55f, 0.33f));
        mapView.setMap(map);
        try {
            Stocks.getStock();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
