package com.revature.service;
import java.util.List;

import com.revature.beans.Cryptid;

public interface CryptidService {

	public void addCryptid(Cryptid c);
	
	public void deleteCryptid(Cryptid c);
	
	public Cryptid getCryptidsById(int id);
	
	public List<Cryptid> getAllCryptids();
	
	public Cryptid updateCryptid(Cryptid c);
}