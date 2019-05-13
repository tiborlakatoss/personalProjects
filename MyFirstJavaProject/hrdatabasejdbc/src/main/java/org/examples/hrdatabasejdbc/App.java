package org.examples.hrdatabasejdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.examples.model.Employee;

/**
 * Hello world!
 *
 */
public class App {

	public static String DB_URL = "jdbc:mysql://localhost:3306/hrdatabase";

	public static String USERNAME = "root";
	public static String PASSWORD = "0747891421";
	public static Connection connection;

	public static void main(String[] args) throws SQLException {
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		Statement statement = connection.createStatement();
		String sql = "SELECT * from employees";
		ResultSet result = statement.executeQuery(sql);

		while (result.next()) {
			int id = result.getInt("employee_id");
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String phoneNo = result.getString("PHONE_NUMBER");
			String email = result.getString("EMAIL");
//			System.out.print(" ID: " + id);
//			System.out.print(" First name: " + firstName + ".");
//			System.out.print(" Last name: " + lastName + ".");
//			System.out.print(" phoneNo: " + phoneNo + ".");
//			System.out.print(" email: " + email + ".");
//			System.out.println();

			// print all employees FRIST NAME LAST NAME SALARY JOB TITLE
		}

		String sql1 = " Select first_name , last_name , salary , job_title from employees inner join jobs on jobs.JOB_ID = employees.JOB_ID";
		ResultSet result1 = statement.executeQuery(sql1);

		while (result1.next()) {
			// String firstName1 = result1.getString("first_name");
			// String lastName1 = result1.getString("last_name");
			// double salary = result1.getInt("salary");
//				String jobTitle = result1.getString("job_title");
//				System.out.print(" First name: " + firstName1 + ".");
//				System.out.print(" Last name: " + lastName1 + ".");
//				System.out.print(" salary: " + salary + ".");
//				System.out.print(" job title: " + jobTitle + ".");
//				System.out.println();

		}
		// updateEmployeeSalary();
		// getEmployeeIdwithPreparedStatement(103);

		// updateEmployeeSalaryWithPreparedStatement(10000, 100);
		// getEmployeeIdwithPreparedStatement(100);
		employeeSalaryRange(9000, 10000);
		insertEmployee(new Employee(99, "Sandor", "Buc", "janossandor", "9999999", LocalDate.of(2010, 03, 05),
				"IT_PROG", 3400));
	}

	public static void updateEmployeeSalary() throws SQLException {
		String sql = "UPDATE employees SET salary=1500 WHERE employee_id=103";
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();

	}

	public static void getEmployeeId() throws SQLException {
		String sql = "Select e.first_name , e.last_name, e.salary , j.job_title from employees e "
				+ "inner join jobs j on j.job_id = e.job_id where e.employee_id = 103";

		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			// String firstName = result.getString("first_name");
			// String lastName = result.getString("last_name");
			// double salary = result.getInt("salary");
			// String jobTitle = result.getString("job_title");
//			System.out.print(" First name: " + firstName + ".");
//			System.out.print(" Last name: " + lastName + ".");
//			System.out.print(" salary: " + salary + ".");
//			System.out.print(" job title: " + jobTitle + ".");
		}
		statement.close();
	}

	public static void getEmployeeIdwithPreparedStatement(int id) throws SQLException {
		String sql = "Select e.first_name , e.last_name, e.salary , j.job_title from employees e "
				+ "inner join jobs j on j.job_id = e.job_id where e.employee_id=? ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			double salary = result.getInt("salary");
			String jobTitle = result.getString("job_title");
//			System.out.print(" First name: " + firstName + ".");
//			System.out.print(" Last name: " + lastName + ".");
//			System.out.print(" salary: " + salary + ".");
//			System.out.print(" job title: " + jobTitle + ".");

		}
		statement.close();
	}

	public static void updateEmployeeSalaryWithPreparedStatement(double salary, int employeeId) throws SQLException {
		String sql = "UPDATE employees SET salary = ? where employee_id  ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDouble(1, salary);
		statement.setInt(2, employeeId);
		statement.executeUpdate();
		statement.close();
	}

	// get employees for salary range
	public static void employeeSalaryRange(double min, double max) throws SQLException {
		String sql = "Select e.first_name , e.last_name, e.salary , j.job_title from employees e "
				+ "inner join jobs j on j.job_id = e.job_id where e.salary between ? and ?  ";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setDouble(1, min);
		statement.setDouble(2, max);
		statement.executeQuery();

		ResultSet result = statement.executeQuery();

		while (result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			double salary = result.getInt("salary");
			String jobTitle = result.getString("job_title");
			System.out.print(" First name: " + firstName + ".");
			System.out.print(" Last name: " + lastName + ".");
			System.out.print(" salary: " + salary + ".");
			System.out.println(" job title: " + jobTitle + ".");

		}
		statement.close();

	}

	public static void salary(double minSalary, double maxSalary) throws SQLException {

		String sql = "Select e.fisrt_name, e.last_name,e.salary from employees e where salary between ? and ?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDouble(1, minSalary);
		statement.setDouble(2, maxSalary);
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			double salary = result.getInt("salary");
			String jobTitle = result.getString("job_title");
			System.out.print(" First name: " + firstName + ".");
			System.out.print(" Last name: " + lastName + ".");
			System.out.print(" salary: " + salary + ".");
			System.out.println(" job title: " + jobTitle + ".");

		}
	}

	public static void insertEmployee(Employee employee) throws SQLException {

		String sql = "insert into  employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,"
				+ "values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, employee.getEmployeeid());
		statement.setString(2, employee.getFirstName());
		statement.setString(3, employee.getLastName());
		statement.setString(4, employee.getEmail());
		statement.setString(5, employee.getPhoneNumber());
		statement.setDate(6, Date.valueOf(employee.getHireDate()));
		statement.setString(7, employee.getJobId());
		statement.setDouble(8, employee.getSalary());

		statement.executeUpdate();
		statement.close();
	}

}
