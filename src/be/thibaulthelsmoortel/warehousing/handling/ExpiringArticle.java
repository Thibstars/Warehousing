package be.thibaulthelsmoortel.warehousing.handling;

import java.util.Date;

/**
 * Class representing an expring article.
 *
 * @author Thibault Helsmoortel
 */
public class ExpiringArticle extends Article implements Comparable<ExpiringArticle> {

    private Date expiration;

    /**
     * Class constructor specifying name and expiration date.
     *
     * @param name       this article's name
     * @param expiration this article's expiration date
     */
    public ExpiringArticle(String name, Date expiration) {
        super(name);
        this.expiration = expiration;
    }

    /**
     * Returns this article's expiration date.
     *
     * @return this article's expiration date
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Sets this article's expiration date.
     *
     * @param expiration this article's new expiration date
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * Returns true when this article is expired, false if otherwise.
     *
     * @return true when expired, false if otherwise
     */
    public boolean isExpired() {
        return expiration.before(new Date());
    }

    @Override
    public int compareTo(ExpiringArticle o) {
        return expiration.compareTo(o.getExpiration());
    }
}
