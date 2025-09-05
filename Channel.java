package com.youtube.backend;

/**
 * BACKEND - DATA MODEL CLASS (POJO)
 * This class represents a single YouTube channel, encapsulating all its related data.
 */
public class Channel {
    private String name;
    private String review;
    private int rating; // Rating from 1 to 5
    private String url;

    public Channel(String name, String review, int rating, String url) {
        this.name = name;
        this.review = review;
        this.rating = rating;
        this.url = url;
    }

    // --- Getters ---
    public String getName() { return name; }
    public String getReview() { return review; }
    public int getRating() { return rating; }
    public String getUrl() { return url; }

    // --- Setters ---
    public void setReview(String review) { this.review = review; }
    public void setRating(int rating) { this.rating = rating; }
    public void setUrl(String url) { this.url = url; }

    /**
     * Provides a simple string representation for displaying the channel's details.
     */
    @Override
    public String toString() {
        String ratingStars = new String(new char[rating]).replace("\0", "⭐");
        return String.format("'%s' [%s] - Review: %s", name, ratingStars, review);
    }
}

