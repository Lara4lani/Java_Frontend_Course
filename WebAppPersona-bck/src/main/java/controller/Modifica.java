package controller;

import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crud;
import model.Persona;

/**
 * Servlet implementation class Modifica
 */
@WebServlet("/Modifica")
public class Modifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Crud crud = new Crud();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Modifica() {
		super();
		// TODO Auto-generated constructor stub
		Crud crud = new Crud();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cf = request.getParameter("cf");
		System.out.println(cf);
		ResultSet rs= crud.CercaCf(cf);
		Persona p = new Persona();
		try {
			
			while (rs.next())
			{
				p=new Persona();
				p.setNome(rs.getString("nome"));
				p.setCognome(rs.getString("cognome"));
				SimpleDateFormat convertiData = new SimpleDateFormat("yyyy-mm-dd");
				p.setDatadinascita(convertiData.parse(rs.getString("Datadinascita")));
				p.setCf(rs.getString("cf"));
				
			}
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("modifica "+p);
		
		RequestDispatcher rd;
		request.setAttribute("persona", p);
		request.setAttribute("val", 1);
		rd=request.getRequestDispatcher("Registrazione.jsp");
		rd.forward(request, response);
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String nome=request.getParameter("nome");
		String cognome=request.getParameter("cognome");
		String cf=request.getParameter("cf");
		String datadinascita=request.getParameter("datadinascita");
		String cfold=request.getParameter("cfold");
		
		Date datanascita= null;
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		try {
			datanascita=sdf.parse(datadinascita);
		}catch(Exception e) {
			System.out.println("");
		}

		Persona p=new Persona();
		p.setNome(nome);
		p.setCognome(cognome);
		p.setCf(cf);
		p.setDatadinascita(datanascita);
		
        
				
		
		
		if(crud.modificaPersona(p, cfold)>0)
		{
			RequestDispatcher rd;
			request.setAttribute("persona", p);
			rd=request.getRequestDispatcher("ConfermaModifica.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("Error.jsp");
			
			
		}
		
		
		
		
	
		
	}

}
