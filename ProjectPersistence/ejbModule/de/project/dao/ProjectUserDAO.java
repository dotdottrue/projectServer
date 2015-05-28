package de.project.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProjectUserDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
}
