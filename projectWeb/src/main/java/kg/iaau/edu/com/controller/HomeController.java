package kg.iaau.edu.com.controller;
import kg.iaau.edu.com.dao.AtasozleriDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    AtasozleriDao atasozleriDao;

    @RequestMapping("/")
    public String showHome()
    {
        return "index";
    }

    @RequestMapping("/aboutus")
    public String showAtasozleri()
    {
        return "about";
    }


    @RequestMapping("/ATASOZLER")
    public String showIndex(ModelMap model)
    {
        model.addAttribute("ATASOZLERI", atasozleriDao.getATASOZLERI());
        return "ATASOZLER";
    }
}