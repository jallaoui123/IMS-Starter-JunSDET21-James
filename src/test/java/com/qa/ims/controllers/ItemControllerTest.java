package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private ItemDAO dao;

	@InjectMocks
	private ItemController controller;

	public void testCreate() {
		final String itemName = "Boots";
		final String itemType = "Football";
		final Double price = 1.00;
		final Item item = new Item(itemName,itemType, price);
		
		Mockito.when(utils.getString()).thenReturn(itemName);
		Mockito.when(utils.getString()).thenReturn(itemName);
		Mockito.when(utils.getDouble()).thenReturn(price);
		Mockito.when(dao.create(item)).thenReturn(item);
		
		assertEquals(item,controller.create());
		
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(2)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(item);
		
	}
	

	@Test
	public void testReadAll() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1l,"Football Boots", "Football", 1.00));
		
		Mockito.when(dao.readAll()).thenReturn(items);
		
		assertEquals(items,controller.readAll());
		
		Mockito.verify(dao, Mockito.times(1)).readAll();
		
	}

	@Test

	public void testUpdate() {
		Item updated = new Item(1l,"Ball", "Bowling",2.50);
		
		Mockito.when(utils.getLong()).thenReturn(1l);
		Mockito.when(utils.getString()).thenReturn("Ball");
		Mockito.when(utils.getString()).thenReturn("Bowling");
		Mockito.when(utils.getDouble()).thenReturn(2.50);
		Mockito.when(dao.update(updated)).thenReturn(updated);
		
		assertEquals(updated,controller.update());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}

}
