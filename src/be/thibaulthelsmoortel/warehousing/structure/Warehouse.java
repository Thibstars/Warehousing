package be.thibaulthelsmoortel.warehousing.structure;

import java.util.HashSet;
import java.util.Set;

/**
 * Class representing a warehouse.
 *
 * @author Thibault Helsmoortel
 */
public class Warehouse {

    private String id; //Eg: WH1
    private Set<Isle> isles;

    /**
     * Class constructor specifying id.
     *
     * @param id the warehouse id
     */
    public Warehouse(String id) {
        this.id = id;
        this.isles = new HashSet<>();
    }

    /**
     * Returns this warehouse's id.
     *
     * @return this warehouse's id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets this warehouse's id.
     *
     * @param id the new warehouse's id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns this warehouse's isles.
     *
     * @return this warehouse's isles
     */
    public Set<Isle> getIsles() {
        return isles;
    }

    /**
     * Sets this warehouse's isles.
     *
     * @param isles this warehouse's isles
     */
    public void setIsles(Set<Isle> isles) {
        this.isles = isles;
    }
}
