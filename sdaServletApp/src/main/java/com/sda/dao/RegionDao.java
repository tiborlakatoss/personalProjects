package com.sda.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.sda.model.Region;

public class RegionDao {

    public List<Region> getAllRegions(Session session) {
        System.out.println("    Entering RegionDao.getAllRegions");

        Query query = session.createQuery("from Region");
        List<Region> regions = query.getResultList();

        System.out.println("    Exiting RegionDao.getAllRegions");
        return regions;
    }

    public void saveRegion(Session session, Region region) {
        System.out.println("    Entering RegionDao.saveRegion");

        session.save(region);

        System.out.println("    Exiting RegionDao.saveRegion");
    }
    
    public void deleteRegion(Session session, Region region) {
        System.out.println("    Entering RegionDao.deleteRegion");

        session.delete(region);

        System.out.println("    Exiting RegionDao.deleteRegion");
    }

}
