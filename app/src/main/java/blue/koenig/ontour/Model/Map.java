package blue.koenig.ontour.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 11.08.2017.
 */

public class Map {

    public List<City> cities = new ArrayList<>();

    public void add(City city)
    {
        cities.add(city);
    }
}
