package salesservice.salesservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import salesservice.salesservice.dto.CreateSaleRequestDTO;
import salesservice.salesservice.dto.CreateSaleResponseDTO;
import salesservice.salesservice.pojo.Sale;
import salesservice.salesservice.service.SalesService;

@RestController
public class SalesController {


    @Autowired
    SalesService salesService;


    @GetMapping(value = "/health")
    public String getHealth(){
        return "Alive";
    }

    @GetMapping(value = "/sale/id/")
    public ResponseEntity<Sale> getSaleById(@RequestBody int id){
        return ResponseEntity.ok(salesService.getSaleById(id));
    }


    @PostMapping(value = "/sale/register/")
    public ResponseEntity<CreateSaleResponseDTO> registerSale(@RequestBody CreateSaleRequestDTO request){
        CreateSaleResponseDTO response = new CreateSaleResponseDTO();
        response.setClient(salesService.getClientById(request.getClientId()));
        response.setProducts(salesService.getProductsById(request.getProductsId()));
        return ResponseEntity.ok(response);
    }
}
