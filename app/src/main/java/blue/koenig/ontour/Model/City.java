package blue.koenig.ontour.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 11.08.2017.
 */

public class City {
    /**
     * Horizontal position in percentage of width
     */
    public float x;

    /**
     * Vertical position in percentage of height
     */
    public float y;

    /**
     * Name of the city
     */
    public String name;

    public List<Connection> connections;

    public City(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
        connections = new ArrayList<>();
    }
}
