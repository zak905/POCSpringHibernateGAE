package com.mypoc.mvc;
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

import com.mypoc.Client;
import com.mypoc.ClientBo;

@Controller
public class UpdateController {
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String deleteClient(@ModelAttribute("Client")Client client){
		ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("WEB-INF/classes/BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		    	clientBo.Update(client, client.getId());

		System.out.println("updated Successfully");
		
		return "updateSuccess";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView viewDeleteForm(@ModelAttribute("Client")Client client){
		ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("WEB-INF/classes/BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		        List<Client> list = clientBo.List();
   
        
    	ModelAndView model = new ModelAndView("update");

		model.addObject("list", list);
		
		return model;
		

	}

}
