package be.thibaulthelsmoortel.warehousing.handling;

import java.util.UUID;

/**
 * Class representing a stock of articles.
 *
 * @author Thibault Helsmoortel
 */
public class Stock {

    private UUID id;
    private Article article;
    private int amount;

    /**
     * Class constructor specifying article and amount.
     *
     * @param article the stock's article
     * @param amount the stock's amount
     */
    public Stock(Article article, int amount) {
        this.id = UUID.randomUUID();
        this.article = article;
        this.amount = amount;
    }

    /**
     * Returns this stock's id.
     *
     * @return this stock's id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Returns this stock's article.
     *
     * @return this stock's article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Returns this stock's amount.
     *
     * @return this stock's amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets this stock's new amount.
     *
     * @param amount this stock's new amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
