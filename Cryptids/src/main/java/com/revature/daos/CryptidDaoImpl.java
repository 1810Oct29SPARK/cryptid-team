package com.revature.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Biome;
import com.revature.beans.Cryptid;
import com.revature.util.ConnectionUtil;
import com.revature.util.HibernateUtil;

public class CryptidDaoImpl implements CryptidDao {

	private SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@Override
	public Cryptid getCryptidById(int id) {
		Cryptid c = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			c = (Cryptid) s.get(Cryptid.class, id);
			tx.commit();
			s.close();
		}
		return c;
	}

	@Override
	public List<Cryptid> getAllCryptids() {
		List<Cryptid> cryptids = new ArrayList<>();
		// use a query to retrieve all caves
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			cryptids = s.createQuery("from Cryptid").getResultList();
			tx.commit();
			s.close();
		}
		return cryptids;
	}

	@Override
	public void addCryptid(Cryptid cryptid) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.save(cryptid);
			tx.commit();
			s.close();
		}
	}

	@Override
	public Cryptid updateCryptid(Cryptid cryptid) {
		Cryptid c = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.merge(cryptid);
			tx.commit();
			s.close();
		}
		return c;
	}

	@Override
	public void deleteCryptid(Cryptid cryptid) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(cryptid);
			tx.commit();
			s.close();
		}
	}

}
