package service;

import java.util.List;

import beans.Cryptid;
import daos.CryptidDao;
import daos.CryptidDaoImpl;

public class CryptidServiceImpl implements CryptidService {
	private CryptidDao ad = new CryptidDaoImpl();
	@Override
	public void createRequest(Cryptid a) {
		ad.createRequest(a);
		
	}

	@Override
	public void deleteRequest(Cryptid a) {
		ad.deleteRequest(a);
		
	}
	
	@Override
	public void updateRequest(Cryptid a) {
		ad.updateRequest(a);
	}

	@Override
	public List<Cryptid> getAccountsById(int id) {
		return ad.getAccountsById(id);
	}
}
