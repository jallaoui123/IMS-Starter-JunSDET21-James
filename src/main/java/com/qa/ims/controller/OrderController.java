package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public  OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
	
		return orders;
	}

	
	@Override
	public Order create() {
		LOGGER.info("Please enter an order  name");
		String orderName = utils.getString(); 
		LOGGER.info("Please enter a price");
		Double price = utils.getDouble();
		LOGGER.info("Please enter an order status");
		String orderStatus = utils.getString();
		Order orders = orderDAO.create(new Order( orderName, orderStatus, price  ));
		LOGGER.info("Order created");
		return orders;
	}

	
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter an order name");
		String orderName = utils.getString();
		LOGGER.info("Please enter an order status");
		String orderStatus = utils.getString();
		LOGGER.info("Please enter the price of the order");
		Double price = utils.getDouble();
		Order order = orderDAO.update(new Order(id, orderName, orderStatus, price));
		LOGGER.info(" Updated");
		return order;
	}


	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}
	
	}

		
	
	
	
			
			
			
			
			
		
		
	
			
			
			
			
		
		



	
	
	
	


