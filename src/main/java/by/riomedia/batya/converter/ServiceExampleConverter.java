package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ServiceExampleDTO;
import by.riomedia.batya.entity.ServiceExample;

public interface ServiceExampleConverter {
    ServiceExampleDTO convertToDTO(ServiceExample serviceExample);
}
