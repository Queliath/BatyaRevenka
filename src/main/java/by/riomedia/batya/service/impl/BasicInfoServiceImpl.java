package by.riomedia.batya.service.impl;

import by.riomedia.batya.dao.BasicInfoDAO;
import by.riomedia.batya.entity.BasicInfo;
import by.riomedia.batya.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDAO basicInfoDAO;

    @Override
    @Transactional(readOnly = true)
    public Map<String, String> getBasicInfo() {
        List<BasicInfo> basicInfoList = basicInfoDAO.getBasicInfoList();
        if (basicInfoList.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> basicInfo = new HashMap<>(basicInfoList.size());
        for (BasicInfo basicInfoItem : basicInfoList) {
            basicInfo.put(basicInfoItem.getInfoType(), basicInfoItem.getInfoData());
        }
        return basicInfo;
    }

}
