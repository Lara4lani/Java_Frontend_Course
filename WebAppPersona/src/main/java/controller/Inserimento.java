package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 * Servlet implementation class Inserimento
 */
@WebServlet("/Inserimento")
public class Inserimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Crud crud = new Crud();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inserimento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//recupero i parametri presenti nella request
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String Data = request.getParameter("datadinascita");
		String cf = request.getParameter("cf");
	
		
		
		Persona p=new Persona();
		p.setNome(nome);
		p.setCognome(cognome);
		SimpleDateFormat convertidata = new SimpleDateFormat("yyyy-mm-dd");
		try {
			p.setDatadinascita(convertidata.parse(Data));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setCf(cf);
		
		
		crud.inserimentoPersona(p);
		
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("ConfermaInserimento.jsp");
		rd.forward(request, response);
	}

}
