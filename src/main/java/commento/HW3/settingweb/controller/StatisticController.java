package commento.HW3.settingweb.controller;

import commento.HW3.settingweb.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class StatisticController {

    private final StatisticService statisticService;

    @ResponseBody
    @RequestMapping( "/sqlYearStatistic")
    public Map<String, Object> sqlTest(String year) {
        return statisticService.yearLoginNum(year);
    }

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "devfunpj");

        List<String> resultList = new ArrayList<>();

        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");

        mav.addObject("list", resultList);
        return mav;
    }
}