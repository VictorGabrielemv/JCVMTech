package br.senai.JCVM.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.senai.JCVM.modelo.dao.fornecedor.FornecedorDAO;
import br.senai.JCVM.modelo.dao.fornecedor.FornecedorDAOImpl;
import br.senai.JCVM.modelo.dao.maquina.MaquinaDAO;
import br.senai.JCVM.modelo.dao.maquina.MaquinaDAOImpl;
import br.senai.JCVM.modelo.dao.materiaPrima.MateriaPrimaDAO;
import br.senai.JCVM.modelo.dao.materiaPrima.MateriaPrimaDAOImpl;
import br.senai.JCVM.modelo.entidade.maquina.Maquina;


@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 4085698799982778747L;

	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

	private MateriaPrimaDAO MateriaPrimaDAO;
	private FornecedorDAO fornecedorDAO;
	private MaquinaDAO maquinaDAO;

	public void init() {
		MateriaPrimaDAO = new MateriaPrimaDAOImpl();
		fornecedorDAO = new FornecedorDAOImpl();
		maquinaDAO = new MaquinaDAOImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/home":
				mostrarHome(request, response);
				break;

			case "/home2":
				mostrarHome2(request, response);
				break;

			case "/cadastro-norma":
				mostrarCadastroNorma(request, response);
				break;

			case "/cadastro-maquina":
				mostrarCadastroMaquina(request, response);
				break;

			case "/cadastro-funcionario":
				mostrarCadastroFuncionario(request, response);
				break;

			case "/visualizar-maquinas":
				mostrarMaquinas(request, response);
				break;
				
			case "/localizar-maquinas":
				mostrarLocalizarMaquinas(request, response);
				break;

			case "/perfil-maquina":
				mostrarPerfilMaquina(request, response);
				break;
				
			case "/login":
				mostrarLogin(request, response);
				break;

			case "/logar":
				logar(request, response);
				break;

			case "/deslogar":
				deslogar(request, response);
				break;

			case "/inserir-maquina":
				inserirMaquina(request, response);
				break;

			default:
				mostrarHome(request, response);
				break;
			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void mostrarHome(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/home.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarHome2(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/home2.html");
		dispatcher.forward(request, response);
	}

	private void mostrarLogin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/login.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroNorma(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Maquina> maquinas = maquinaDAO.buscarMaquinas();
		request.setAttribute("maquinas", maquinas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/cadastro-norma.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarPerfilMaquina(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		Maquina maquina = maquinaDAO.buscarMaquinaPorId(Long.parseLong(request.getParameter("id")));
		request.setAttribute("maquina", maquina);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/perfil-maquina.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarCadastroMaquina(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/cadastro-maquina.jsp");
		dispatcher.forward(request, response);
	}

	private void mostrarCadastroFuncionario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/");
		dispatcher.forward(request, response);
	}

	private void mostrarMaquinas(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Maquina> maquinas = maquinaDAO.buscarMaquinas();
		request.setAttribute("maquinas", maquinas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/visualizar-maquinas.jsp");
		dispatcher.forward(request, response);
	}
	
	private void mostrarLocalizarMaquinas(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Maquina> maquinas = maquinaDAO.buscarMaquinas();
		request.setAttribute("maquinas", maquinas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("assets/localizar-maquinas.jsp");
		dispatcher.forward(request, response);
	}


	private void logar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		HttpSession sessao = request.getSession();
		// Usuario usuario = usuarioDAO.buscarUsuarioPorEmailESenha(email, senha);
		// sessao.setAttribute("usuario", usuario);

	}

	private void deslogar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		HttpSession sessao = request.getSession();
		sessao.invalidate();
		response.sendRedirect("");
	}

	private void inserirMaquina(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String descricao = request.getParameter("descricao");
		String funcionamento = request.getParameter("funcionamento");

		// Formato de tempo esperado
		LocalTime horarioInicioOperacao = LocalTime.parse(request.getParameter("horarioInicioOperacao"),
				TIME_FORMATTER);
		LocalTime horarioFechamentoOperacao = LocalTime.parse(request.getParameter("horarioFechamentoOperacao"),
				TIME_FORMATTER);

		String capacidadeOperacao = request.getParameter("capacidadeOperacao");
		String nivelPerigo = request.getParameter("nivelPerigo");
		String capacidadeOperacao = request.getParameter("localizacao");

		// insere no banco de dados
		maquinaDAO.inserirMaquina(new Maquina(nome, tipo, descricao, funcionamento, horarioInicioOperacao,
				horarioFechamentoOperacao, capacidadeOperacao, nivelPerigo, localizacao));

		response.sendRedirect("home");
	}


}