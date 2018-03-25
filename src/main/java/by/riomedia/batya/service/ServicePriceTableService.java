package by.riomedia.batya.service;

import by.riomedia.batya.vo.ServicePriceTableVO;

public interface ServicePriceTableService {
    ServicePriceTableVO getPriceTable(Long serviceId);
}
