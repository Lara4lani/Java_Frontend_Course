package controller;

import java.io.IOException;
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
 * Servlet implementation class Paginazione
 */
@WebServlet("/Paginazione")
public class Paginazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Crud crud = new Crud();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Paginazione() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> array=new ArrayList<Persona>();
		Persona p;

		int offset = (Integer.parseInt(request.getParameter("offset")));
	
		int newoffset ;
		int oldoffset ;
		int resto;
		int tot = crud.contaPersone();	
		if(tot%5!=0)
		{
			resto = tot%5;
			System.out.println(resto);
		}else
			resto =5;
			System.out.println(resto);
		
		
		int lastoffset = tot-resto;
		System.out.println(lastoffset);
		request.setAttribute("lastoffset", lastoffset);
	
		
		//new offset block
		if(offset<lastoffset) 
		{
			newoffset = offset+5;
		}
		else
			newoffset=offset;
		
		request.setAttribute("newoffset", newoffset);
	
		//old offset block
		if(offset>0)
		{
			oldoffset = offset-5;
		}
		else
			oldoffset = offset;
		
		request.setAttribute("oldoffset", oldoffset);
	

		ResultSet rs=crud.getPaginazione(offset);
		try {
		
			while (rs.next())
			{
				p=new Persona();
				p.setNome(rs.getString("nome"));
				p.setCognome(rs.getString("cognome"));
				SimpleDateFormat convertiData = new SimpleDateFormat("yyyy-MM-dd");
				p.setDatadinascita(convertiData.parse(rs.getString("Datadinascita")));
				p.setCf(rs.getString("cf"));
				array.add(p);
			}
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd;
		request.setAttribute("listapersone", array);
		rd=request.getRequestDispatcher("Visualizza.jsp");
		
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
