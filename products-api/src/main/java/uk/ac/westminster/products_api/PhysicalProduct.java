package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a kind of product that is sold
// and shipped, so it can be used anywhere a Product is expected.
// A ShoppingCart would NOT pass this test: a cart is not a product, it contains
// products (HAS-A), so it should use a field, not extends.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // no-arg constructor: Jackson needs this to build an object from JSON
    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price); // must be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
