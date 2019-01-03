package daos;

import java.util.List;

import beans.Biome;
import beans.Cryptid;

public interface CryptidDao {

	public Cryptid getCryptidById(int id);
	public List<Cryptid> getAllCryptids();
	public void addCryptid(Cryptid cryptid);
	public void updateCryptid(Cryptid cryptid);
	public void deleteCryptid(Cryptid cryptid);
}
