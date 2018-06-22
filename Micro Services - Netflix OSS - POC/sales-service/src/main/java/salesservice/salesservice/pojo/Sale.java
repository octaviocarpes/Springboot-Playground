package salesservice.salesservice.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "Sales")
public class Sale {

    private int id;
    private String clientId;
    private List<String> productsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<String> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<String> productsId) {
        this.productsId = productsId;
    }
}
