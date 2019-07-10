package com.arquitecturajava.aplicacion.dao;

import com.arquitecturajava.aplicacion.dao.hibernate.CategoriaDAOHibernateImpl;
import com.arquitecturajava.aplicacion.dao.hibernate.LibroDAOHibernateImpl;

public class DAOHibernateFactory implements DAOFactory {
	
	public CategoriaDAO getCategoriaDAO() {
		return new CategoriaDAOHibernateImpl();
	}
	
	public LibroDAO getLibroDAO() {
		
		return new LibroDAOHibernateImpl();
	}

}
