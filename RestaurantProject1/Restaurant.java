public class Restaurant {
    private String name;
    private int waitTimeMinutes;
    private int rating;
    private String priceRange;
    private String hoursOpen;

    public Restaurant(String name, int waitTimeMinutes, int rating, String priceRange, String hoursOpen) {
        this.name = name;
        this.waitTimeMinutes = waitTimeMinutes;
        this.rating = rating;
        this.priceRange = priceRange;
        this.hoursOpen = hoursOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTimeMinutes() {
        return waitTimeMinutes;
    }

    public void setWaitTimeMinutes(int waitTimeMinutes) {
        this.waitTimeMinutes = waitTimeMinutes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Wait time: " + waitTimeMinutes + " minutes\n"
                + "Rating: " + rating + " out of 5\n"
                + "Price range: " + priceRange + "\n"
                + "Hours open: " + hoursOpen;
    }
}
