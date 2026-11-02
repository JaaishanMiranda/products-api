package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a kind of product that is sold
// and shipped, so it can be used anywhere a Product is expected.
// A ShoppingCart would NOT pass this test: a cart is not a product, it contains
// products (HAS-A), so it should use a field, not extends.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + "kg";
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
