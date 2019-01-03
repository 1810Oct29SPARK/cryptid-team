package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Biome;
import beans.Cryptid;
import daos.BiomeDAO;
import daos.BiomeDAOImpl;
import daos.CryptidDao;
import daos.CryptidDaoImpl;
import util.HibernateUtil;

public class Driver {

	static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
		//init();
		CryptidDao cd = new CryptidDaoImpl();
		BiomeDAO bd = new BiomeDAOImpl();
//		funWithSessionMethods(sf);
		
//		System.out.println(cryp.getAccountsById(1));
		
								//BIOMES
		
//		get all biomes
//		List<Biome> biomeList = bd.getAllBiomes();
//		for (Biome b : biomeList) {
//			System.out.println(b);
//		}
		
		//get biome by ID
//		Biome b = bd.getBiomeById(52);
//		System.out.println(b);
		
		//add biome
//		Biome b = new Biome(20, "Volcano", "hot");
//		bd.addBiome(b);
		
		//update biome
//		Biome b = new Biome(102, "Volcano", "ashey");
//		bd.updateBiome(b);
		
		//delete biome
//		Biome b = new Biome(102, "Volcano", "ashey");
//		bd.deleteBiome(b);
		
								//CRYPTIDS
		
		//get all cryptids
//		List<Cryptid> cl = cd.getAllCryptids();
//		for (Cryptid c : cl) {
//			System.out.println(c);
//		}
		
		//get cryptid by id
//		Cryptid c = cd.getCryptidById(1);
//		System.out.println(c);
		
		//add cryptid
//		Cryptid c = new Cryptid(11, "Bigfoot", "jerky", 400, "big ol' foot", null);
//		cd.addCryptid(c);
		
		//update cryptid
//		Cryptid c = new Cryptid(1, "Bigfoot", "jerky", 400, "big ol' foot", new Biome(52, "Plains", "grassy"));
//		cd.updateCryptid(c);
		
		//delete cryptid
//		Cryptid c = new Cryptid(2, "Volcano", "ashey", 0, null, null);
//		cd.deleteCryptid(c);
		
	}
	
	static void funWithSessionMethods(SessionFactory sf) {
		//create a session
		Session s = sf.getCurrentSession();
		Transaction tx = s.beginTransaction();
		
		//get and load
//		Biome b = s.get(Biome.class, 33); //this will be null
//		System.out.println(b);
		
//		ObjectNotFoundExcpetion
//		Biome b1 = s.load(Biome.class, 35);
//		System.out.println(b1);
		
//		Biome b2 = s.load(Biome.class, 1);
//		System.out.println(b2);
//		
//		//save and persist
//		System.out.println(s.save(b2)); //get our generated id, but this was already persistent
//		
		tx.commit();
		s.close();
		
//		System.out.println(b2); throws a LazyInitializationException if this was not used inside the session
		//if we create another session, b2 is still detached
		
		Session s2 = sf.getCurrentSession();
		Transaction tx2 = s2.beginTransaction();
		
		//throws exception
//		s2.persist(b2);
		
		//creates duplicate
//		s2.save(b2);
		
		//update and merge
//		Biome b3 = new Biome(152, "Lake", "Wet");
//		s2.update(b3);
		
		//get a persistent cave
//		Biome b4 = s2.get(Biome.class, 1); //in persistent state
//		b4.setName("Swamp"); //automatic dirty checking will update this at end of the session
		
		//update something that does not exist
//		s2.update(new Biome(300, "Brooklyn", "literally uninhabitable"));
		
		tx2.commit();
		s2.close();
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