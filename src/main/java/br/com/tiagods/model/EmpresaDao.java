package br.com.tiagods.model;

import java.util.List;

import org.hibernate.Session;

import br.com.tiagods.factory.HibernateFactory;

public class EmpresaDao {
	public Empresa getById(int cod){
		HibernateFactory factory = new HibernateFactory();
		Session session = factory.getSession();
		Empresa empresa = session.find(Empresa.class, cod);
		session.getTransaction().commit();
		session.close();
		return empresa;
	}
	public List<Empresa> getLista(){
		HibernateFactory factory = new HibernateFactory();
		Session session = factory.getSession();
		List<Empresa> lista = (List<Empresa>)session.createQuery("from Empresa").getResultList();
		session.getTransaction().commit();
		session.close();
		return lista;
	}
}
