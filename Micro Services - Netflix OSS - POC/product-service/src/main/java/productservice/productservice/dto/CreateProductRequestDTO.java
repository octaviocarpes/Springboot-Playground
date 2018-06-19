package productservice.productservice.dto;

public class CreateProductRequestDTO {

    private String name;
    private double price;

    public CreateProductRequestDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
