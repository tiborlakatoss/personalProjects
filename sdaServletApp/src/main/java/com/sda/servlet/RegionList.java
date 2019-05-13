package com.sda.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sda.model.Region;
import com.sda.service.RegionService;

@WebServlet("/regionList")
public class RegionList extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1630921533585131406L;
	private RegionService regionService = new RegionService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Entering doGet Region");
		String nextPage = null;

		List<Region> RegionList = new ArrayList<>();
		RegionList = regionService.getAllRegions();

//        for (Region region : regionList) {
//			System.out.println(region.getRegionId()+" "+ region.getRegionName());
//		}

		// send the items in arraylist to "region.jsp"

		req.setAttribute("regionList", RegionList);
		nextPage = "/region.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(nextPage);
		rd.forward(req, resp);

	}

	public class JavaInProgress(){
		private String OOP = "medium++";
		private String Collections = "medium";
		private String Generics = "junior";
		private String GIT = "GIT++";
		private String Eclipse = "medium++";

		public JavaInProgress(String level) {
			this.level = level;
		}

		private Boolean JuniorJavaDev(Person student){
		if(stugent.getFirstName{}.equals{"Tibor"}){
		this.level="junior java developer wanna be";
		return true;
		}
		return false;
		}
	}
}
