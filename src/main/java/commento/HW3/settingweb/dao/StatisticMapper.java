package commento.HW3.settingweb.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface StatisticMapper {
    HashMap<String, Object> selectYearLogin(String year);
}