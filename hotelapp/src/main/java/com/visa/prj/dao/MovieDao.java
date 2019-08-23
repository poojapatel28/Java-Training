package com.visa.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Actor;
import com.visa.prj.entity.Movie;

@Repository
@Transactional
public class MovieDao {

	@PersistenceContext
	EntityManager em;
	
	public void addMovie(Movie m)
	{
		em.persist(m);
	}
	
	public Movie getMovie(int id)
	{
		return em.find(Movie.class, id);
	}
	
	public void updateMovie(Movie m)
	{
		em.merge(m);
	}
	
	public Actor getActorByName(String name)
	{
		String jpql = "from Actor a where a.name=:name";
		TypedQuery<Actor> query = em.createQuery(jpql,Actor.class);
		return query.getResultList().get(0);
		
	}
}
