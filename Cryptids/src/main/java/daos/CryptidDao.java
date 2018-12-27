package daos;

import java.util.List;

import beans.Cryptid;

public interface CryptidDao {

	public void createRequest(Cryptid c);
	
	public void deleteRequest(Cryptid c);
	
	public List<Cryptid> getAccountsById(int id);
	
	public void updateRequest(Cryptid c);
}
