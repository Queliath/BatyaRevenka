package by.riomedia.batya.dao;

import by.riomedia.batya.entity.ServicePriceCell;

import java.util.List;

public interface ServicePriceCellDAO {
    List<ServicePriceCell> getCells(Long columnId);
}
