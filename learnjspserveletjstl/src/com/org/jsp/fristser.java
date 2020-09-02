package com.org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fristser extends HttpServlet{

	 public fristser() {
	
		super();
		System.out.println("inside the no-org.. constructor()...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String fname = req.getParameter("fname");
		//String lname = req.getParameter("lname");
		//String f = fname+lname;
		
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<student> list = new ArrayList<student>();
		
		student st = new student();
		st.setName("danish chaush");
		st.setAge("21");
		st.setLocation("Adilabad");
		list.add(st);
		
		st = new student();
		st.setName("mahesh");
		st.setAge("21");
		st.setLocation("hyderabad");
		
		list.add(st);
	
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String f = fname+lname;
		
		String[] coun = {"india","pakistan","agfastan"};
		
		PrintWriter pr = resp.getWriter();
		//pr.println(f);
		//pr.println("<html><body><h1>"+f+"</body></html>");//it will also contain html tag
		//resp.sendRedirect("test.html");
		
		req.setAttribute("list", list);
		req.setAttribute("cou", coun);
		req.setAttribute("name", f);
		req.setAttribute("stu",st );
	 RequestDispatcher dispatcher =	req.getRequestDispatcher("/output.jsp");
	 dispatcher.forward(req, resp);
		
		
	}
	
	@Override
	public void init() throws ServletException {
		
		super.init();
		System.out.println("this is init method");
		System.out.println("inside the distory method");
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		super.service(req, resp);
		System.out.println("this is service method");
	}
	
	@Override
	public void destroy() {
	
		super.destroy();
		System.out.println("this is distroy");
	}
	
}
