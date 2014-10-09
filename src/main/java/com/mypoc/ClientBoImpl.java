package com.mypoc;

import java.util.List;

public class ClientBoImpl implements ClientBo {
	
	private ClientDao clientDao; 
	

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public void Add ( Client client){
		
		clientDao.Add(client);
	}
	
	public void Delete (Client client){
		clientDao.Delete(client);
		
	}
	
	public void Update (Client client, int id){
		clientDao.Update(client, id);
     }
	
	public List<Client> List(){
		
		return clientDao.List();
	}

}
