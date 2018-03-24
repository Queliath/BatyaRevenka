package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ServiceExampleConverter;
import by.riomedia.batya.dto.ServiceExampleDTO;
import by.riomedia.batya.entity.ServiceExample;
import org.springframework.stereotype.Component;

@Component
public class ServiceExampleConverterImpl implements ServiceExampleConverter {

    @Override
    public ServiceExampleDTO convertToDTO(ServiceExample serviceExample) {
        ServiceExampleDTO serviceExampleDTO = new ServiceExampleDTO();
        serviceExampleDTO.setId(serviceExample.getId());
        serviceExampleDTO.setImageUrl(serviceExample.getImageUrl());
        return serviceExampleDTO;
    }

}
