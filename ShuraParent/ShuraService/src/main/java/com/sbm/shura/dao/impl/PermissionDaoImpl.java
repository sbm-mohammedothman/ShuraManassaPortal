package com.sbm.shura.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sbm.shura.dao.PermissionDao;
import com.sbm.shura.entity.Permission;

@Repository
public class PermissionDaoImpl extends GenericDaoImpl<Permission> implements PermissionDao {

	@Override
	public Permission add(Permission perm) throws Exception {
		// TODO Auto-generated method stub
		return persist(perm);
	}

	@Override
	public List<Permission> getPermList() throws Exception {
		// TODO Auto-generated method stub
		return (List<Permission>)entityManager.createNamedQuery("Permission.findAll").getResultList();
	}

	@Override
	public List<Permission> getPermListByMenu(long menuId) throws Exception {
		Query q = entityManager.createNamedQuery("Permission.findByMenu", Permission.class);
		q.setParameter("menuId", menuId);
		return q.getResultList();
	}

}
