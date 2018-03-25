package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ServicePriceTableDTO;
import by.riomedia.batya.vo.ServicePriceTableVO;

public interface ServicePriceTableConverter {
    ServicePriceTableDTO convertToDTO(ServicePriceTableVO servicePriceTableVO);
}
