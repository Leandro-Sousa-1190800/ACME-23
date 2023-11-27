package aggregatedRating.domain;

import javax.persistence.*;

@Entity
public class AggregatedRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long aggregatedId;

    @Column()
    private double average;

    @Column()
    private int product;

    protected AggregatedRating() {}

    public AggregatedRating(double average, int product) {
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

    public Long getAggregatedId() {
        return aggregatedId;
    }
}
