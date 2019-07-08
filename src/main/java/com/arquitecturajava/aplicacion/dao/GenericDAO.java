package com.arquitecturajava.aplicacion.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author cecilio alvarez caules contacto@arquitecturajava.com
 * @version 1.0
 */
public interface GenericDAO<T, Id extends Serializable> {

	T buscarPorClave(Id id);

	List<T> buscarTodos();

	void salvar(T objeto);

	void borrar(T objeto);

	void insertar(T objeto);

}
