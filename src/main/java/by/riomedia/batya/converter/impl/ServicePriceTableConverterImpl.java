package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ServicePriceTableConverter;
import by.riomedia.batya.dto.ServicePriceTableDTO;
import by.riomedia.batya.entity.ServicePriceColumn;
import by.riomedia.batya.vo.ServicePriceTableVO;
import org.springframework.stereotype.Component;

@Component
public class ServicePriceTableConverterImpl implements ServicePriceTableConverter {

    @Override
    public ServicePriceTableDTO convertToDTO(ServicePriceTableVO servicePriceTableVO) {
        ServicePriceTableDTO dto = new ServicePriceTableDTO();
        for (ServicePriceColumn column : servicePriceTableVO.getColumns()) {
            dto.addColumn(column.getId(), column.getName(), column.getAttributeName());
        }
        dto.setRows(servicePriceTableVO.getRows());
        return dto;
    }
}
