package com.army.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.army.hibernate.dto.ArmyDTO;

import util_project.HibernateUtility;

public class ArmyDAO {

	public ArmyDAO() {
		System.out.println("create happy army");
	}

	public void save(ArmyDTO savetodto) {
		System.out.println("create a army data store in data base");
		SessionFactory factory = HibernateUtility.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(savetodto);
		transaction.commit();

		session.close();
		factory.close();

	}
	public ArmyDTO fetchbyaid(int aid) {
		Session session=HibernateUtility.getFactory().openSession();
		ArmyDTO army=session.get(ArmyDTO.class, aid);
		if(army!=null) 
			System.out.println("data is not found for id"+aid);
		session.close();
		return army;
	}
	public ArmyDTO loadbytotalarmysize(int totalarmysize) {
		
		System.out.println("demo for load method ");
		
		String syntex = "select aDTO from ArmyDTO aDTO where aDTO.totalarmysize=" +totalarmysize;
		Session session = HibernateUtility.getFactory().openSession();
		// PizzaDTO dtofromDB;
		try {
			Query query = session.createQuery(syntex);
			ArmyDTO dtofromDB = (ArmyDTO) query.uniqueResult();
			if (dtofromDB != null)
				System.out.println("data found:" + dtofromDB);

			return dtofromDB;

		} finally {
			session.close();
		}
	}
	public List<ArmyDTO> fetchAll() {
		String hqlSyntax = "select army_db from ArmyDTO army_db";
		Session session = HibernateUtility.getFactory().openSession();
		List<ArmyDTO> list = null;
		try {
			Query query = session.createQuery(hqlSyntax);
			list = query.list();
			//return list;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
}
	public void updateTotalArmySizebyAid(int aid, int newtotalsize) {
		System.out.println("updating armytotalsize by id"+aid);
		
		String syntex="update ArmyDTO ad set ad.totalarmysize=:tot where ad.aid=:ID";
		Session session=HibernateUtility.getFactory().openSession();
		Transaction tran=session.beginTransaction();
		
		try {
			Query q=session.createQuery(syntex);
			q.setParameter("tot",newtotalsize);
			q.setParameter("ID", aid);
			q.executeUpdate();
			tran.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();
		}
		}
}