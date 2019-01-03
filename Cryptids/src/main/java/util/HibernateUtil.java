package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (HibernateUtil.sessionFactory == null) {
			//if no SessionFactory has been created, create one
			Configuration c = new Configuration();
//			c.setProperty("hibernate.connection.username", System.getenv("DEMO_DB_USER"));
//			c.setProperty("hibernate.connection.password", System.getenv("DEMO_DB_PASS"));
//			c.setProperty("hibernate.connection.url", System.getenv("DEMO_DB_URL"));
			c.configure(); //by default, it looks for a hibernate.cfg.xml in src/main/resources as the source of all of our details
			HibernateUtil.sessionFactory = c.buildSessionFactory();
		}
		return HibernateUtil.sessionFactory;
	}

}
