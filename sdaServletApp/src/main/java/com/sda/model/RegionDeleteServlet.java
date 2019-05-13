package com.sda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sda.model.Region;
import com.sda.service.RegionService;

@WebServlet(urlPatterns = "/regionDelete")
public class RegionDeleteServlet extends HttpServlet {

    private static final long serialVersionUID = 4090829189072956198L;

    private RegionService regionService = new RegionService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entering RegionDeleteServlet.doPost");

        // reading the region id from the html form
        String regionId = req.getParameter("regionId");

        // removing the new region from the database
        regionService.deleteRegion(Integer.valueOf(regionId));

        // setting the regionList as request attribute for the jsp to display it
        req.setAttribute("regionList", regionService.getAllRegions());

        // forwarding to the jsp used for displaying all existing regions
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/regionList.jsp");
        dispatcher.forward(req, resp);

        System.out.println("Exiting RegionDeleteServlet.doPost");
    }

}
