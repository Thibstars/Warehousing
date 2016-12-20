package be.thibaulthelsmoortel.warehousing.handling;

import java.util.UUID;

/**
 * Class representing an article.
 *
 * @author Thibault Helsmoortel
 */
public class Article {

    private UUID id;
    private String name;

    /**
     * Class constructor specifying name.
     *
     * @param name this article's name
     */
    public Article(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    /**
     * Returns this article's id.
     *
     * @return this article's id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Returns this article's name.
     *
     * @return this article's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this article's new name.
     *
     * @param name this article's new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
