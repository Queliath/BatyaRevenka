package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.ServicePriceCellDAO;
import by.riomedia.batya.dao.ServicePriceColumnDAO;
import by.riomedia.batya.entity.ServicePriceCell;
import by.riomedia.batya.entity.ServicePriceColumn;
import by.riomedia.batya.service.ServicePriceTableService;
import by.riomedia.batya.vo.ServicePriceTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ServicePriceTableServiceImpl implements ServicePriceTableService {

    @Autowired
    private ServicePriceColumnDAO servicePriceColumnDAO;
    @Autowired
    private ServicePriceCellDAO servicePriceCellDAO;

    @Override
    @Transactional(readOnly = true)
    public ServicePriceTableVO getPriceTable(Long serviceId) {
        List<ServicePriceColumn> columns = servicePriceColumnDAO.getColumns(serviceId);
        List<Map<String, String>> rows = null;
        for (ServicePriceColumn column : columns) {
            List<ServicePriceCell> cells = servicePriceCellDAO.getCells(column.getId());
            if (rows == null) {
                rows = new ArrayList<>(cells.size());
                for (ServicePriceCell cell : cells) {
                    Map<String, String> row = new HashMap<>(columns.size());
                    row.put(column.getAttributeName(), cell.getCellValue());
                    rows.add(row);
                }
            } else {
                Iterator<ServicePriceCell> cellIterator = cells.iterator();
                Iterator<Map<String, String>> rowsIterator = rows.iterator();
                for (;cellIterator.hasNext() && rowsIterator.hasNext();) {
                    ServicePriceCell cell = cellIterator.next();
                    Map<String, String> row = rowsIterator.next();
                    row.put(column.getAttributeName(), cell.getCellValue());
                }
            }
        }

        ServicePriceTableVO priceTableVO = new ServicePriceTableVO();
        priceTableVO.setColumns(columns);
        priceTableVO.setRows(rows);
        return priceTableVO;
    }
}
