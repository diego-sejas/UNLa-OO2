package test;

import org.hibernate.Session;
import dao.HibernateUtil;

public class TestIBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		HibernateUtil.getSessionFactory().close();
		System.out.println("OK");

	}

}
