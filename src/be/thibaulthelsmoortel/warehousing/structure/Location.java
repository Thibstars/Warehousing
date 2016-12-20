package be.thibaulthelsmoortel.warehousing.structure;

import java.util.List;

/**
 * Class representing a rack location.
 *
 * @author Thibault Helsmoortel
 */
public class Location {

    private String id; //Eg: WH1LA1

    /**
     * Class constructor specifying id.
     *
     * @param id the location's id
     */
    public Location(String id) {
        this.id = id;
    }

    /**
     * Returns this location's id.
     *
     * @return this location's id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets this location's new id.
     *
     * @param id this location's new id
     */
    public void setId(String id) {
        this.id = id;
    }
}
