package com.santhosh.springboothibernatestartingproject.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.santhosh.springboothibernatestartingproject.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Employee> query = currentSession
				.createSQLQuery("select e.*,r.* from Employee e,Role r where e.id=r.employee_id");
		// Query<Employee> query=currentSession.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee emp) {
		System.out.println(emp);
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(emp);

	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee emp = session.get(Employee.class, id);
		session.delete(emp);
	}

}
