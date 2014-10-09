package com.mypoc;
import java.util.List;

public interface ClientDao {
	
	void Add(Client client);
	void Delete(Client client);
	void Update(Client client, int id);
	List<Client> List();

}
