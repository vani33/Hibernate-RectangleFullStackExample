package com.hcl.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.RectangleHibDAO;
import com.hcl.model.Rectangle;


@WebServlet("/RectangleAddController")
public class RectangleAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RectangleAddController() {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double length = Double.parseDouble(request.getParameter("length"));
		double breadth = Double.parseDouble(request.getParameter("breadth"));
		
		try{
			RectangleHibDAO rectangleHibDAO = new RectangleHibDAO();
			Rectangle rectangle = new Rectangle();
			rectangle.setLength(length);
			rectangle.setBreadth(breadth);
			rectangleHibDAO.save(rectangle);
			response.sendRedirect("addSuccess.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
