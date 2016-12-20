package be.thibaulthelsmoortel.warehousing.structure;

import java.util.Set;

/**
 * Class representing a isle side.
 *
 * @author Thibault Helsmoortel
 */
public class IsleSide {

    private String id; //Eg: WH1AL (L from left)
    private Set<Rack> racks;

    /**
     * Class constructor specifying id.
     *
     * @param id this isle side's id
     */
    public IsleSide(String id) {
        this.id = id;
    }

    /**
     * Returns this isle side's id.
     *
     * @return this isle side's id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets this isle side's new id.
     *
     * @param id this isle side's new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns this isle side's racks.
     *
     * @return this isle side's racks
     */
    public Set<Rack> getRacks() {
        return racks;
    }

    /**
     * Sets this isle side's racks.
     *
     * @param racks this isle side's new racks
     */
    public void setRacks(Set<Rack> racks) {
        this.racks = racks;
    }
}
