package com.kelas.spring.Web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kelas.spring.Dao.MainDao;
 
@Controller
public class HelloWorldController {
	
	@Autowired
	private MainDao mainDao;
 
    
    
    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView sayHello(){
    	ModelAndView mav = new ModelAndView();
    	
    	mav.addObject("greeting", "Hello World from Spring 4 MVC");
    	mav.addObject("name", mainDao.findOne(1L));
    	mav.setViewName("welcome");
    	
    	return mav;
    }
 
    
 
}
