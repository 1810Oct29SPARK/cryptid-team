package daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Biome;
import util.HibernateUtil;

public class BiomeDAOImpl implements BiomeDAO {
	

	@Override
	public Biome getBiomeById(int id) {
		Biome b = null;
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			b = (Biome) s.get(Biome.class, id);
			tx.commit();
			s.close();
		}
		return b;
	}

	@Override
	public List<Biome> getAllBiomes() {
		List<Biome> biomes = new ArrayList<>();
		// use a query to retrieve all caves
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			biomes = s.createQuery("from Biome").getResultList();
			tx.commit();
			s.close();
		}
		return biomes;
	}

	@Override
	public void addBiome(Biome biome) {
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.save(biome);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updateBiome(Biome biome) {
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.update(biome);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deleteBiome(Biome biome) {
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.delete(biome);
			tx.commit();
			s.close();
		}
	}

}
