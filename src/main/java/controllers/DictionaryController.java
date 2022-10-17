package controllers;

import dao.DictionaryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class DictionaryController {
    @Autowired
    public DictionaryDAO dictionaryDAO;
    @GetMapping("/dictionaryController")
    public ModelAndView search(@RequestParam String english) {
        ModelAndView modelAndView = new ModelAndView("result");
        String result = dictionaryDAO.searchVietnamese(english);
        modelAndView.addObject("result",result);
        return modelAndView;
    }

}
