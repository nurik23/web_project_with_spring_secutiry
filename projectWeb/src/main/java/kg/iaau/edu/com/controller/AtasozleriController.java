package kg.iaau.edu.com.controller;

import kg.iaau.edu.com.dao.AtasozleriDao;
import kg.iaau.edu.com.model.Atasozleri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AtasozleriController {

    @Autowired
    AtasozleriDao atasozleriDao;

    @RequestMapping("/ATASOZLERI")
    public String showHome(ModelMap model)
    {
        model.addAttribute("ATASOZLERI", atasozleriDao.getATASOZLERI());

        return "ATASOZLERI";
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/getATASOZLERI")
    public String showAtasozleri(ModelMap model, @RequestParam("id") int id)
    {
        model.addAttribute("ATASOZLERI", atasozleriDao.getATASOZLERI(id));

        return "ATASOZLERI";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/addAtasozleri")
    public String addAtasozleri()
    {
        return "createAtasozleri";
    }

    @RequestMapping(value = "/createAtasozleri", method = RequestMethod.POST)
    public String createAtasozleri(Atasozleri atasozleri)
    {

        atasozleriDao.create(atasozleri);

        return "redirect:ATASOZLER";
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/newAtasozleri")
    public String newAtasozleri()
    {
        return "updateAtasozleri";
    }

    @RequestMapping(value = "/updateAtasozleri", method = RequestMethod.POST)
    public String updateAtasozleri(Atasozleri atasozleri)
    {

        atasozleriDao.update(atasozleri);

        return "redirect:ATASOZLER";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/searchAtasozleri")
    public String searchAtasozleri()
    {
        return "findAtasozleri";
    }

    @RequestMapping(value = "/findAtasozleri", method = RequestMethod.POST)
    public String findAtasozleri(ModelMap model, @RequestParam("KG") String name)

    {


        model.addAttribute("ATASOZLERI", atasozleriDao.find(name));

        return "ATASOZLERI";
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("/removeAtasozleri")
    public String removeAtasozleri()
    {
        return "deleteAtasozleri";
    }

    @RequestMapping(value = "/deleteAtasozleri", method = RequestMethod.POST)
    public String deleteAtasozleri(Atasozleri atasozleri)
    {

        atasozleriDao.delete(atasozleri);

        return "redirect:ATASOZLER";
    }


}
