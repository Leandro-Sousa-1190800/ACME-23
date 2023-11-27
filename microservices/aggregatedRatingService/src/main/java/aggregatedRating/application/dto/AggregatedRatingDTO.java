package aggregatedRating.application.dto;

public class AggregatedRatingDTO {

    private Long aggregatedId;
    private double average;
    private int product;

    public AggregatedRatingDTO(double average, int product) {
        this.average = average;
        this.product = product;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }
}
