package com.javaclass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.javaclass.model.Order;

public class OrderDao {

	private final String connection_url = "jdbc:mysql://localhost:3306/class0420";
	private final String sql_selectById = "select * from class0420.order o where o.id = ? ";
	private final String sql_insertOrder = "insert into class0420.order values (?,?,?,?,?,?) ";
	

	public Order getOrder(long orderId) {

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(connection_url, "root", "root@1234");
				PreparedStatement stmt = conn.prepareStatement(sql_selectById);) {

			stmt.setLong(1, orderId);

			ResultSet rs = stmt.executeQuery();

			rs.next();
			Order order = new Order();
			order.setId(rs.getLong("id"));
			order.setCustomerId(rs.getLong("customer_id"));
			order.setItem(rs.getString("item"));
			order.setToppings(rs.getString("topppings"));
			order.setSize(rs.getString("size"));
			order.setPrice(rs.getDouble("price"));
			return order;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public Order createOrder(Order order) {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(connection_url, "root", "root@1234");
				PreparedStatement stmt = conn.prepareStatement(sql_insertOrder);) {
			
			stmt.setLong(1, order.getId()); 
			stmt.setLong(2, order.getCustomerId());
			stmt.setString(3, order.getItem());
			stmt.setString(4, order.getToppings());
			stmt.setString(5, order.getSize());
			stmt.setDouble(6, order.getPrice());
			
			int count = stmt.executeUpdate();

			if(count == 1) {
				// success
				return order;
			}
			else {
				throw new RuntimeException("Failed to create order");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
		
	}

}
