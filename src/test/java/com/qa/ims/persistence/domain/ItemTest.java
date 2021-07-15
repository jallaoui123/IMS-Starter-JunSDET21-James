package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemTest {

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Item.class).verify();
	}
	@Test
	public void constructor1() {
		Item football = new Item("Football", "boots", 1.00);
		assertTrue(football instanceof Item);
	}
	
	@Test
	public void testGetId() {
		Item football = new Item(1l,"Bat", "Cricket", 6.05);
		Long expected = 1l;
		assertEquals(expected,football.getId());
	}
	
	@Test
	public void testSetId() {
		Item rugby = new Item("Ball","Rugby", 1.00);
		rugby.setId(2l);
		Long expected = 2l;
		assertEquals(expected,rugby.getId());
	}
	
	@Test
	public void testItemName() {
		Item football = new Item("football", "Boots", 1.00);
		String expected = "football";
		assertEquals(expected,football.getItemName());
	}
	
	@Test
	public void testGetItemName() {
		Item rowing = new Item("rowing", "Boat", 6.00);
		String expected = "rowing";
		assertEquals(expected,rowing.getItemName());
	}
	
	@Test
	public void testSetItemName() {
		Item socks = new Item("Socks", "Football", 6.50);
		socks.setItemName("Socks");
		String expected = "Socks";
		assertEquals(expected,socks.getItemName());
	}
	

}
