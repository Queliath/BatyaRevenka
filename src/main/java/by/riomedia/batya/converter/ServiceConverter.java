package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ServiceDTO;
import by.riomedia.batya.entity.Service;

public interface ServiceConverter {
    ServiceDTO convertToDTO(Service service);
}
