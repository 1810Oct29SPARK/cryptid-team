package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import beans.Cryptid;
import daos.CryptidDao;
import daos.CryptidDaoImpl;
import util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		//init();
		CryptidDao cryp = new CryptidDaoImpl();
		
		List<Cryptid> l = cryp.getAccountsById(1);
		for(Cryptid c : l) {
			System.out.println(c);
		}
		
		
	}

	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}