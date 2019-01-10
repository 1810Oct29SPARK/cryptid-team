package com.revature.daos;

import java.util.List;

import com.revature.beans.Biome;
import com.revature.beans.Cryptid;

public interface CryptidDao {

	public Cryptid getCryptidById(int id);

	public List<Cryptid> getAllCryptids();

	public void addCryptid(Cryptid cryptid);

	public Cryptid updateCryptid(Cryptid cryptid);

	public void deleteCryptid(Cryptid cryptid);
}
