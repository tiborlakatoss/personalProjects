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

@WebServlet(urlPatterns = "/regionList")
public class RegionListServlet extends HttpServlet {

    private static final long serialVersionUID = 4090829189072956198L;

    private RegionService regionService = new RegionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entering RegionListServlet.doGet");

        List<Region> regionList = regionService.getAllRegions();

        req.setAttribute("regionList", regionList);

        // Forward to /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/regionList.jsp");
        dispatcher.forward(req, resp);

        System.out.println("Exiting RegionListServlet.doGet");
    }
}
