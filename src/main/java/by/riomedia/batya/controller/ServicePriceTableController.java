package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ServicePriceTableConverter;
import by.riomedia.batya.dto.ServicePriceTableDTO;
import by.riomedia.batya.service.ServicePriceTableService;
import by.riomedia.batya.vo.ServicePriceTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/services/{serviceId}/price-table")
public class ServicePriceTableController {

    @Autowired
    private ServicePriceTableService servicePriceTableService;
    @Autowired
    private ServicePriceTableConverter servicePriceTableConverter;

    @GetMapping
    public ResponseEntity<ServicePriceTableDTO> getPriceTable(@PathVariable Long serviceId) {
        ServicePriceTableVO vo = servicePriceTableService.getPriceTable(serviceId);
        return ResponseEntity.ok(servicePriceTableConverter.convertToDTO(vo));
    }
}
