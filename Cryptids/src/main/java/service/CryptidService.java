package service;
import java.util.List;

import beans.Cryptid;

public interface CryptidService {

	public void addCryptid(Cryptid c);
	
	public void deleteCryptid(Cryptid c);
	
	public Cryptid getCryptidsById(int id);
	
	public List<Cryptid> getAllCryptids();
	
	public void updateCryptid(Cryptid c);
}