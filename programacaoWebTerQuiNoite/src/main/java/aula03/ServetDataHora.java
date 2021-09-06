package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServetDataHora
 */
@WebServlet("/ServetDataHora")
public class ServetDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServetDataHora() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    // sobrescrever uma classe
    public void init() throws ServletException {
    	super.init();
    	log("ServletDataHora iniciado às " + format.format(new Date()));
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><BODY>Olá! A data e hora atual é: ");
		saida.write("");
		saida.write(format.format(new Date()));
		saida.write("</BODY></HTML>");
		saida.close();
	}
	
	@Override
	public void destroy() {
    	log("ServletDataHora finalizado às " + format.format(new Date()));
		super.destroy();
	}

}