package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ServiceAdvantageDTO;
import by.riomedia.batya.entity.ServiceAdvantage;

public interface ServiceAdvantageConverter {
    ServiceAdvantageDTO convertToDTO(ServiceAdvantage serviceAdvantage);
}
