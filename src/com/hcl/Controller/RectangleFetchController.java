package com.hcl.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.RectangleHibDAO;
import com.hcl.model.Rectangle;


@WebServlet("/RectangleFetchController")
public class RectangleFetchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RectangleFetchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RectangleHibDAO rectangleHibDAO = new RectangleHibDAO();
		
		List<Rectangle> lstRectangles = rectangleHibDAO.getAllRectangles();
		List<Rectangle> lstRectangles1 = new ArrayList<Rectangle>();
		for(Rectangle r :lstRectangles) {
			r.setArea(r.calculateArea());
			r.setPerimeter(r.calculatePerimeter());
			r.display();
			lstRectangles1.add(r);
		}
		
		request.setAttribute("lstRectangles", lstRectangles1);
		RequestDispatcher rd = request.getRequestDispatcher("/rectangleView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
