package org.example.hrdatabasehibernate;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;

import org.example.hrdatabasehibernate.model.Employee;
import org.example.hrdatabasehibernate.model.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		getAllEmployees();
		getEmployeeByFirstName("Neena");
		
		Employee employee = getEmployeeById(110);
		System.out.println(employee);
		getAllJobs();
		
		//Employee emp = new Employee(48, "Ramona", "Cristea", "ramoC@g", "123", LocalDate.of(2019, 03, 30), 50000, "IT_PROG");
		//saveEmployee(emp);
		
		System.out.println(getEmployeeById(48));
		
		sessionFactory.close();
	}
	
	public static void getAllEmployees() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		tx.commit();
		session.close();
	}
	
	public static void getEmployeeByFirstName(String firstName) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Employee e where e.firstName=:firstName");
		query.setParameter("firstName", firstName);
		
		List<Employee> employees = query.getResultList();
		
		System.out.println("--------- Employees by first name ---------------");
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		tx.commit();
		session.close();
	}
	
	public static Employee getEmployeeById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = session.find(Employee.class, id);
		
		tx.commit();
		session.close();
		
		return employee;
	}
	
	public static void getAllJobs() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		List<Job> jobs = session.createQuery("from Job").getResultList();
		
		for(Job job : jobs) {
			System.out.println(job);
		}
		
		tx.commit();
		session.close();
	}
	
	public static void saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(employee);
		
		tx.commit();
		session.close();
	}
}
