/**
 * 
 */
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

/**
 * @author shona
 *
 */
public class StudentDAOImpl implements StudentDAO {

	private DataSource ds;

	public StudentDAOImpl(DataSource ds) {//non static variable initilization
		super();
		this.ds = ds;
	}	

	@Override
	public int insert(StudentBO bo) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO GET_STUDENT_DETAILS VALUES (?,?,?,?,?)");//place holder
			ps.setInt(1,bo.getSno());
			ps.setString(2,bo.getSname());
			ps.setFloat(3,bo.getTotal());
			ps.setFloat(4,bo.getAverage());
			ps.setString(5,bo.getResult());

			int result = ps.executeUpdate();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;


		}
		catch (Exception e1) {
			e1.printStackTrace();
			return 0;

		}
	}





}
