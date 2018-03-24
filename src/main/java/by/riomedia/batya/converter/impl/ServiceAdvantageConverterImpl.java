package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ServiceAdvantageConverter;
import by.riomedia.batya.dto.ServiceAdvantageDTO;
import by.riomedia.batya.entity.ServiceAdvantage;
import org.springframework.stereotype.Component;

@Component
public class ServiceAdvantageConverterImpl implements ServiceAdvantageConverter {

    @Override
    public ServiceAdvantageDTO convertToDTO(ServiceAdvantage serviceAdvantage) {
        ServiceAdvantageDTO serviceAdvantageDTO = new ServiceAdvantageDTO();
        serviceAdvantageDTO.setId(serviceAdvantage.getId());
        serviceAdvantageDTO.setName(serviceAdvantage.getName());
        serviceAdvantageDTO.setDescription(serviceAdvantage.getDescription());
        return serviceAdvantageDTO;
    }
}
