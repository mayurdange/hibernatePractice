package springstudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import springstudy.dao.UserDetails;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("begin");
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("username");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("End.");
	}

}
