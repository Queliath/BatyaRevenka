package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ServiceAdvantageConverter;
import by.riomedia.batya.dto.ServiceAdvantageDTO;
import by.riomedia.batya.entity.ServiceAdvantage;
import by.riomedia.batya.service.ServiceAdvantageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/services/{serviceId}/advantages")
public class ServiceAdvantageController {

    @Autowired
    private ServiceAdvantageService serviceAdvantageService;
    @Autowired
    private ServiceAdvantageConverter serviceAdvantageConverter;

    @GetMapping
    public ResponseEntity<List<ServiceAdvantageDTO>> getAdvantages(@PathVariable Long serviceId) {
        List<ServiceAdvantage> serviceAdvantages = serviceAdvantageService.getAdvantages(serviceId);
        List<ServiceAdvantageDTO> serviceAdvantageDTOs = new ArrayList<>(serviceAdvantages.size());
        for (ServiceAdvantage serviceAdvantage : serviceAdvantages) {
            serviceAdvantageDTOs.add(serviceAdvantageConverter.convertToDTO(serviceAdvantage));
        }
        return ResponseEntity.ok(serviceAdvantageDTOs);
    }

}
