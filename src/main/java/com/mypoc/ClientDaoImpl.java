package com.mypoc;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import java.util.List;

public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao {
	
	public void Add(Client client){
		
		getHibernateTemplate().save(client);
	}
	
	public void Delete(Client client){
		
		getHibernateTemplate().delete(client); 
	}
	
	public void Update(Client client, int id)  {
		Query q = getSession().createQuery("update Client set Name = :name, lastName = :lastName, accountNumber = :accountNumber where id = :id");
		q.setString("name", client.getName());
		q.setString("lastName", client.getLastName());
		q.setString("accountNumber", client.getAccountNumber());
		q.setInteger("id", id);
		q.executeUpdate();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Client> List(){
		
		Query q = getSession().createQuery("from Client");
		return q.list();
	}

}
