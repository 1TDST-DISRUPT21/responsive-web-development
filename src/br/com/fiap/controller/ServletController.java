package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

/**
 * Servlet implementation class ServletController
 */
@WebServlet( urlPatterns={"/validacao","/logout"})
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		switch (request.getRequestURI()) {
			case "/login-logout2/validacao":
				 validacao(request, response);
				break;

			case "/login-logout2/logout":
				 logout(request,response);
				break;
				
			default:
				 response.sendRedirect("login.jsp");
				break;
		}
		
		
	}
	
	public void validacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioBO userBO = new UsuarioBO();
		Usuario user = new Usuario();
		
		user.setNomeUser(request.getParameter("user"));
		user.setPassUser(request.getParameter("pass"));
		
		System.out.println(user.getNomeUser());
		System.out.println(user.getPassUser());
				
	    user = userBO.login(user);
		if(user != null) {	
			request.setAttribute("objUser", user);
			request.getRequestDispatcher("./WEB-INF/index.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
		
				
			
		HttpSession session = request.getSession();
		
		if(session.isNew()) {
			//Determinando o Timeout da Sessão
			session.setMaxInactiveInterval(300);
			session.invalidate();
			response.sendRedirect("login.jsp");		
		}
		
		
	}
		

	public void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Recuperando a Sessão do usuário
		HttpSession sessao = req.getSession();
		
		sessao.invalidate();
		resp.sendRedirect("login.jsp");
		
	}
	
	
}


