package com.sda.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sda.dao.RegionDao;
import com.sda.model.Region;

public class RegionService {

	private RegionDao regionDao = new RegionDao();
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public List<Region> getAllRegions() {
		System.out.println("  Entering RegionService.getAllRegions");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("  Calling RegionDao.getAllRegions");
		List<Region> regions = regionDao.getAllRegions(session);

		tx.commit();
		session.close();

		System.out.println("  Exiting RegionService.getAllRegions");
		return regions;
	}

	public void saveRegion(String regionName) {
		System.out.println("  Entering RegionService.saveRegion");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Region region = new Region();
		region.setRegionName(regionName);

		System.out.println("  Calling RegionDao.saveRegion for regionName: " + regionName);
		regionDao.saveRegion(session, region);

		tx.commit();
		session.close();

		System.out.println("  Exiting RegionService.saveRegion");

	}

	public void deleteRegion(int regionId) {
		System.out.println("  Entering RegionService.deleteRegion");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("  Calling RegionDao.deleteRegion for regionId: " + regionId);

		tx.commit();
		session.close();

		System.out.println("  Exiting RegionService.deleteRegion");

	}
}
