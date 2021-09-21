package com.hcl.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.model.Rectangle;

public class RectangleHibDAO {

	public List<Rectangle> getAllRectangles() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Rectangle> lstRectangles = session.createQuery("from Rectangle").list();
		session.close();
		return lstRectangles;
 	}
	public void save(Rectangle rectangle) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(rectangle);
		transaction.commit();
		System.out.println("\n\n Details added successfully\n");
		session.close();
	}
}
