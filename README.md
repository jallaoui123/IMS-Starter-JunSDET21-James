# IMS-Starter-JunSDET21-James

Link to JIRA - https://james456.atlassian.net/jira/software/projects/IP2JA2/boards/3

This is am inventory management system which will use JAVA and SQL

These instructions will allow you to get the project up and working on a local computer

The system will require you to have JAVA and SQL. You will need to use Eclipse IDE. My system uses Java 1.8 if you use later versions they will work but anything before this will not work.

# Installing

The example will be using Eclipse IDE

1. copy the link for this repository of this repository on GitHub
2. Right click on package explorer on eclipse and click import
3. You will have to select projects from git-smart install 
4. Clone URI
5. It will paste your clipboard which will have a copy of your GitHub address
6. Keep clicking next till it dissapears
7. With the folder installed, you will need to create the SQL database. The Schema required for this is in src/main/resources/sql-schema.sql
8.Run the SQL commands via command line
9.You will also need to allow your system to see this database. Go to src/main/resources/db.properties and change the values accordingly
10.Finally it should be set up and if you want to run it you will have to go to your runner class to see if its working

# Unit Testing

This system will include testing which will have 80% coverage and above.If you would like to run these tests in the application the right click on src/test/java
and then you will have to click coverage on the JUNITTest

Here is an example of test in my application. 

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
 # Deployment
 
 Add additional notes about how to deploy this on a live system
 
# Built With
Maven - Dependency Management
	
# Versioning

We use Github(http://github.org/) for versioning.

# Authors

Chris Perrins - Initial work - christophperrins
James Allaoui - Project work
License
This project is licensed under the MIT license - see the LICENSE.md file for details

For help in Choosing a license

# Acknowledgments
Thanks to my instructor Pawel and Alan for the help i have been given during this project. 
