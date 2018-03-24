package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ServiceTypeConverter;
import by.riomedia.batya.dto.ServiceTypeDTO;
import by.riomedia.batya.entity.ServiceType;
import by.riomedia.batya.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/services/{serviceId}/types")
public class ServiceTypeController {

    @Autowired
    private ServiceTypeService serviceTypeService;
    @Autowired
    private ServiceTypeConverter serviceTypeConverter;

    @GetMapping
    public ResponseEntity<List<ServiceTypeDTO>> getTypes(@PathVariable Long serviceId) {
        List<ServiceType> serviceTypes = serviceTypeService.getTypes(serviceId);
        List<ServiceTypeDTO> serviceTypeDTOs = new ArrayList<>(serviceTypes.size());
        for (ServiceType serviceType : serviceTypes) {
            serviceTypeDTOs.add(serviceTypeConverter.convertToDTO(serviceType));
        }
        return ResponseEntity.ok(serviceTypeDTOs);
    }
}
