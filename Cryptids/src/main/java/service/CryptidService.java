package service;
import java.util.List;

import beans.Cryptid;

public interface CryptidService {

	public void createRequest(Cryptid c);
	
	public void deleteRequest(Cryptid c);
	
	public Cryptid getAccountsById(int id);
	
	public void updateRequest(Cryptid c);
}