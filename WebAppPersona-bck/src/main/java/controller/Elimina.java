package controller;

import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crud;
import model.Persona;

/**
 * Servlet implementation class Elimina
 */
@WebServlet("/Elimina")
public class Elimina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Crud crud = new Crud();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Elimina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

		request.getAttribute("listapersone");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String datadinascita = request.getParameter("datadinascita");
		String cf = request.getParameter("cf");
		
		
		
		request.setAttribute("nome", nome);
		request.setAttribute("cognome", cognome);
		request.setAttribute("datadinascita", datadinascita);
		request.setAttribute("cf", cf);
		crud.eliminaPersona(cf);
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("ConfermaElimina.jsp");		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
