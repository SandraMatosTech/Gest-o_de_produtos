package Product;

public class ProductModel {
    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;

    public ProductModel(String barCode, String name, int priceInCents, int stock) {
        this.barCode = barCode;
        this.name = name;
        this.priceInCents = priceInCents;
        this.stock = stock;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
