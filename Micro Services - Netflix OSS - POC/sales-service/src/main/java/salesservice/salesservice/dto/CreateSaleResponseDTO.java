package salesservice.salesservice.dto;

import org.apache.catalina.LifecycleState;
import salesservice.salesservice.pojo.Client;
import salesservice.salesservice.pojo.Product;

import java.util.List;

public class CreateSaleResponseDTO {

    private Client client;
    private List<Product> products;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
