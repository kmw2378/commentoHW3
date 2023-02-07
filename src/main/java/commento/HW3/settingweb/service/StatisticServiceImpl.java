package commento.HW3.settingweb.service;

import commento.HW3.settingweb.dao.StatisticMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@RequiredArgsConstructor
@Service
@Slf4j
public class StatisticServiceImpl implements StatisticService {

    private final StatisticMapper statisticMapper;

    @Override
    public HashMap<String, Object> yearLoginNum(String year) {

        HashMap<String, Object> retVal = new HashMap<>();

        retVal = statisticMapper.selectYearLogin(year);

        try {
            retVal = statisticMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
        } catch (Exception e) {
            log.info(e.getMessage());
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }

        return retVal;
    }
}
