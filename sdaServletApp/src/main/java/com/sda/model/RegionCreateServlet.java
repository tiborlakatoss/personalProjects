package com.sda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sda.service.RegionService;

@WebServlet(urlPatterns = "/regionCreate")
public class RegionCreateServlet extends HttpServlet {

    private static final long serialVersionUID = -9070020875184244414L;
    
    private RegionService regionService = new RegionService();

    /**
     * Method called for displaying the create region form
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entering RegionCreateServlet.doGet");

        RequestDispatcher dispatcher = 
                req.getServletContext().getRequestDispatcher("/regionCreate.jsp");
        dispatcher.forward(req, resp);

        System.out.println("Exiting RegionCreateServlet.doGet");
    }

    /**
     * Method called for adding a new region to the database
     * and displaying the list of all existing regions
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entering RegionCreateServlet.doPost");

        // reading the region name from the html form
        String regionName = req.getParameter("regionName");

        // saving the new region to the database
        regionService.saveRegion(regionName);

        // setting the regionList as request attribute for the jsp to display it
        req.setAttribute("regionList", regionService.getAllRegions());

        // forwarding to the jsp used for displaying all existing regions
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/regionList.jsp");
        dispatcher.forward(req, resp);

        System.out.println("Exiting RegionCreateServlet.doPost");
    }
}
