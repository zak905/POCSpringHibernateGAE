package com.mypoc.mvc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mypoc.Client;
import com.mypoc.ClientBo;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("C:\\Users\\zakaria\\Documents\\HibernateSpringGAEIntegration1\\src\\main\\resourcesBeanLocations.xml");
		    	ApplicationContext appContext = 
		    	  new FileSystemXmlApplicationContext("WEB-INF/classes/BeanLocations.xml");
		 
		    	ClientBo clientBo = (ClientBo)appContext.getBean("clientBo");
		    	/*Client client = new Client();
		    	client.setName("zakaria");
		    	client.setLastName("amine");
		    	client.setAccountNumbe:("test");
		    	clientBo.Add(client);*/
		    	
		    	List<Client> list = clientBo.List();
		
		 
		    	System.out.println("item 0 " + list.get(0).getId());
		    }
		

	}


