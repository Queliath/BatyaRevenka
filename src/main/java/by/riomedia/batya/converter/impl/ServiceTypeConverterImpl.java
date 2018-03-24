package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ServiceTypeConverter;
import by.riomedia.batya.dto.ServiceTypeDTO;
import by.riomedia.batya.entity.ServiceType;
import org.springframework.stereotype.Component;

@Component
public class ServiceTypeConverterImpl implements ServiceTypeConverter {

    @Override
    public ServiceTypeDTO convertToDTO(ServiceType serviceType) {
        ServiceTypeDTO serviceTypeDTO = new ServiceTypeDTO();
        serviceTypeDTO.setId(serviceType.getId());
        serviceTypeDTO.setName(serviceType.getName());
        return serviceTypeDTO;
    }

}
