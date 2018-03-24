package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ServiceConverter;
import by.riomedia.batya.dto.ServiceDTO;
import by.riomedia.batya.entity.Service;
import org.springframework.stereotype.Component;

@Component
public class ServiceConverterImpl implements ServiceConverter {

    @Override
    public ServiceDTO convertToDTO(Service service) {
        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setId(service.getId());
        serviceDTO.setName(service.getName());
        serviceDTO.setIconUrl(service.getIconUrl());
        serviceDTO.setShortDescription(service.getShortDescription());
        return serviceDTO;
    }
}
