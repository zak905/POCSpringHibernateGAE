package com.mypoc.mvc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mypoc.Client;
import com.mypoc.ClientBo;


 
@Controller
public class AddController {
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("Client") Client client){
		// Code for adding Client
		ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("src\\main\\resources\\BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		    	clientBo.Add(client);
	
		System.out.println(client.getName() + "Added Successfully");
		return "addSuccess";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String viewRegistrationForm(@ModelAttribute("Client")Client client){
		// Code for adding Client
		return "add";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(){
		// Code for adding Client
		return "main";
	}
	
	@RequestMapping(value = "/links", method = RequestMethod.GET)
	public String linksFrame(){
		// Code for adding Client
		return "links";
	}
	
	@RequestMapping(value = "/target", method = RequestMethod.GET)
	public String targetFrame(){
		// Code for adding Client
		return "target";
	}

}
