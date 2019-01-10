package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Cryptid;
import com.revature.daos.CryptidDao;
import com.revature.daos.CryptidDaoImpl;

@Service(value="cryptidService")
public class CryptidServiceImpl implements CryptidService {
	private CryptidDao cd = new CryptidDaoImpl();
	@Override
	public void addCryptid(Cryptid c) {
		cd.addCryptid(c);
		
	}

	@Override
	public void deleteCryptid(Cryptid c) {
		cd.deleteCryptid(c);
		
	}
	
	@Override
	public Cryptid updateCryptid(Cryptid c) {
		return cd.updateCryptid(c);
	}

	@Override
	public Cryptid getCryptidsById(int id) {
		return cd.getCryptidById(id);
	}

	@Override
	public List<Cryptid> getAllCryptids() {
		return cd.getAllCryptids();
	}
}
