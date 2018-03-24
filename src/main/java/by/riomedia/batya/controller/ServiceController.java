package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ServiceConverter;
import by.riomedia.batya.dto.ServiceDTO;
import by.riomedia.batya.entity.Service;
import by.riomedia.batya.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;
    @Autowired
    private ServiceConverter serviceConverter;

    @GetMapping
    public ResponseEntity<List<ServiceDTO>> getServices() {
        List<Service> services = serviceService.getServices();
        List<ServiceDTO> serviceDTOs = new ArrayList<>(services.size());
        for (Service service : services) {
            serviceDTOs.add(serviceConverter.convertToDTO(service));
        }
        return ResponseEntity.ok(serviceDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceDTO> getService(@PathVariable Long id) {
        Service service = serviceService.getService(id);
        return ResponseEntity.ok(serviceConverter.convertToDTO(service));
    }

}
