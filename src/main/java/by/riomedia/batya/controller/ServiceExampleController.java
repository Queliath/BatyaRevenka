package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ServiceExampleConverter;
import by.riomedia.batya.dto.ServiceExampleDTO;
import by.riomedia.batya.entity.ServiceExample;
import by.riomedia.batya.service.ServiceExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/services/{serviceId}/examples")
public class ServiceExampleController {

    @Autowired
    private ServiceExampleService serviceExampleService;
    @Autowired
    private ServiceExampleConverter serviceExampleConverter;

    @GetMapping
    public ResponseEntity<List<ServiceExampleDTO>> getExamples(@PathVariable Long serviceId) {
        List<ServiceExample> serviceExamples = serviceExampleService.getExamples(serviceId);
        List<ServiceExampleDTO> exampleDTOs = new ArrayList<>(serviceExamples.size());
        for (ServiceExample serviceExample : serviceExamples) {
            exampleDTOs.add(serviceExampleConverter.convertToDTO(serviceExample));
        }
        return ResponseEntity.ok(exampleDTOs);
    }
}
