package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;


import com.rays.dto.UserDTO;

@Repository

public class UserDaoImpl implements UserDaoInt{
	
	@Autowired
	private SessionFactory sessionFactory =null;

	
	public long add(UserDTO dto) throws DataAccessException{
		
	long pk =(Long)sessionFactory.getCurrentSession().save(dto);
		
		return pk;
	}

	public void update(UserDTO dto) {
		
		sessionFactory.getCurrentSession().update(dto);
		
	}

	public UserDTO delete(long id) {
		UserDTO dto = findByPK(id);
		
     sessionFactory.getCurrentSession().delete(dto);	
                return dto;
	}

	public UserDTO findByLogin(String login) {
		UserDTO dto = null;
	Session session =	sessionFactory.getCurrentSession();
	Criteria criteria = session.createCriteria(UserDTO.class);
	criteria.add(Restrictions.eq("login", login));
	List list = criteria.list();
	if(list.size()==1) {
		dto=(UserDTO) list.get(0);
	}
		
		
		return dto;
	}

	public UserDTO findByPK(long pk) {
		UserDTO dto = null;
		dto =(UserDTO) sessionFactory.getCurrentSession().get(UserDTO.class, pk);
		
		
		return dto;
	}

	public UserDTO authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(UserDTO dto) {
		
	return search(dto,0,0);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		
		List list = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		if (dto != null) {
			if (dto.getId() > 0) {
				criteria.add(Restrictions.eq("id", dto.getId()));
			}
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName() + "%"));
			}
			if (dto.getLastName() != null && dto.getLastName().length() > 0) {
				criteria.add(Restrictions.like("lastName", dto.getLastName() + "%"));
			}
			if (dto.getLogin() != null && dto.getLogin().length() > 0) {
				criteria.add(Restrictions.like("login", dto.getLogin()));
			}
			if (dto.getPassword() != null && dto.getPassword().length() > 0) {
				criteria.add(Restrictions.like("password", dto.getPassword()));
			}
		}

		if (pageSize > 0) {
			criteria.setFirstResult((pageNo - 1) * pageSize);
			criteria.setMaxResults(pageSize);
		}

		list = criteria.list();


		
		return list;
	}

}
