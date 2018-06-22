package salesservice.salesservice.dto;

import java.util.List;

public class CreateSaleRequestDTO {

   private int clientId;
   private List<Integer> productsId;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public List<Integer> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<Integer> productsId) {
        this.productsId = productsId;
    }
}
