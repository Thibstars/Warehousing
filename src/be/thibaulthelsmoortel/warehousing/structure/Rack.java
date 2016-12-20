package be.thibaulthelsmoortel.warehousing.structure;

import java.util.Set;

/**
 * Class representing a rack in an isle side.
 *
 * @author Thibault Helsmoortel
 */
public class Rack {

    private String id; //Eg: WH1ALA
    private Set<Location> locations;

    /**
     * Class constructor specifying id.
     *
     * @param id this rack's id.
     */
    public Rack(String id) {
        this.id = id;
    }

    /**
     * Returns this rack's id.
     *
     * @return this rack's id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets this rack's new id.
     *
     * @param id this rack's new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns this rack's locations.
     *
     * @return this rack's locations
     */
    public Set<Location> getLocations() {
        return locations;
    }

    /**
     * Sets this rack's locations.
     * @param locations this rack's new locations
     */
    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }
}
