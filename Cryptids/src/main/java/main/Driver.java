package main;

import java.util.List;

import beans.Biome;
import daos.BiomeDAO;
import daos.BiomeDAOImpl;
import daos.CryptidDao;
import daos.CryptidDaoImpl;

public class Driver {

	public static void main(String[] args) {
		//init();
		CryptidDao cryp = new CryptidDaoImpl();
		BiomeDAO bd = new BiomeDAOImpl();
		
		List<Biome> biomeList = bd.getAllBiomes();
		for (Biome b : biomeList) {
			System.out.println(b);
		}
		
//		System.out.println(cryp.getAccountsById(1));
		
		
		
		
	}

//	static void init() {
//		try {
//			Connection con = ConnectionUtil.getConnection("connection.properties");
//			System.out.println(con);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}