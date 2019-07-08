package com.arquitecturajava.aplicacion.dao;

import java.util.List;

import com.arquitecturajava.aplicacion.bo.Categoria;
import com.arquitecturajava.aplicacion.bo.Libro;

public interface LibroDAO {
	
	public abstract void insertar(Libro libro);

	public abstract void borrar(Libro libro);

	public abstract void salvar(Libro libro);

	public abstract List<Libro> buscarTodos();

	public abstract Libro buscarPorClave(String isbn);

	public abstract List<Libro> buscarPorCategoria(Categoria categoria);

}
