package com.revature.servlets;
//package servlets;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import beans.Cryptid;
//import service.CryptidService;
//import service.CryptidServiceImpl;
//
///**
// * Servlet implementation class Cryptid
// */
//public class CryptidServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    private ObjectMapper om;
//    private CryptidService cryptidService;
//	
//	
//    public CryptidServlet() {
//        super();
//        cryptidService = new CryptidServiceImpl();
//        om = new ObjectMapper();
//    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("id"));
//		response.getWriter().write(om.writeValueAsString(cryptidService.getAccountsById(id)));
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		cryptidService.createRequest(om.readValue(request.getReader(), Cryptid.class));
//	}
//
//	/**
//	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
//	 */
//	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		cryptidService.updateRequest(om.readValue(request.getReader(), Cryptid.class));
//	}
//
//	/**
//	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
//	 */
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		cryptidService.deleteRequest(om.readValue(request.getReader(), Cryptid.class));
//	}
//
//}
