package productservice.productservice.dto;

public class CreateProductResponseDTO {

    private String name;
    private double price;

    public CreateProductResponseDTO(String name, double price) {
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
