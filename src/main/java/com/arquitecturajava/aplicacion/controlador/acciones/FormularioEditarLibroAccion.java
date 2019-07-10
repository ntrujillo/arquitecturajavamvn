package com.arquitecturajava.aplicacion.controlador.acciones;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.aplicacion.bo.Categoria;
import com.arquitecturajava.aplicacion.bo.Libro;
import com.arquitecturajava.aplicacion.dao.CategoriaDAO;
import com.arquitecturajava.aplicacion.dao.DAOAbstractFactory;
import com.arquitecturajava.aplicacion.dao.DAOFactory;
import com.arquitecturajava.aplicacion.dao.LibroDAO;

/**
 * @author cecilio alvarez caules contacto@arquitecturajava.com
 * @version 1.0
 */
public class FormularioEditarLibroAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		DAOFactory factoria = DAOAbstractFactory.getInstance();
		LibroDAO libroDAO = factoria.getLibroDAO();
		CategoriaDAO categoriaDAO = factoria.getCategoriaDAO();

		String isbn = request.getParameter("isbn");
		List<Categoria> listaDeCategorias = categoriaDAO.buscarTodos();
		Libro libro = libroDAO.buscarPorClave(isbn);
		request.setAttribute("listaDeCategorias", listaDeCategorias);
		request.setAttribute("libro", libro);
		return "FormularioEditarLibro.jsp";
	}

}
