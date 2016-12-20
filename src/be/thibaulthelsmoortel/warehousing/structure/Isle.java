package be.thibaulthelsmoortel.warehousing.structure;

/**
 * Class representing a warehouse isle.
 *
 * @author Thibault Helsmoortel
 */
public class Isle {

    private String id; //Eg: WH1A
    private IsleSide[] sides;

    /**
     * Class constructor specifying id.
     *
     * @param id this isle's id
     */
    public Isle(String id) {
        this.id = id;
        this.sides = new IsleSide[2];
    }

    /**
     * Returns this isle's id.
     *
     * @return this isle's id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets this isle's new id.
     *
     * @param id this isle's new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns this isle's sides.
     *
     * @return this isle's sides
     */
    public IsleSide[] getSides() {
        return sides;
    }

    /**
     * Sets this isle's sides.
     *
     * @param sides this isle's new sides
     */
    public void setSides(IsleSide[] sides) {
        this.sides = sides;
    }
}
