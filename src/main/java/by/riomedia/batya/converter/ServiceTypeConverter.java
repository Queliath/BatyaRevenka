package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ServiceTypeDTO;
import by.riomedia.batya.entity.ServiceType;

public interface ServiceTypeConverter {
    ServiceTypeDTO convertToDTO(ServiceType serviceType);
}
