package com.mypoc.mvc;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.mypoc.Client;
import com.mypoc.ClientBo;
 
@Controller
public class DeleteController {
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteClient(@ModelAttribute("Client")Client client){
		ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("src\\main\\resources\\BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		    	clientBo.Delete(client);

		System.out.println("name " + client.getName() + " Deleted Successfully");
		
		return "deleteSuccess";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView viewDeleteForm(@ModelAttribute("Client")Client client){
		ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("src\\main\\resources\\BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		List<Client> list = clientBo.List();
   
        
    	ModelAndView model = new ModelAndView("delete");

		model.addObject("list", list);
		
		return model;
		

	}

}
