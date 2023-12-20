package test;

import test.work.Database;

// <bean id = "user" class = "com.user.java"/>
// <arg ref = "mysql">
// <arg reft = "Oracle"> 
public class DI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DI container = new DI();
			@autowired
			User user1;
			@autowired
			User user2;
			@autowired
			User user3;
	}
	
	// inner class
	   class User {
	         Database database;

	        public User(Database database) {
	           this.database = database;
	        }

	        public void add(String data) {
	            database.persist(data);
	        }
	    }

	    
	    public interface Database{
	    		public void persist( String data);
	    }
	    
	    // Another class mysqldatabase
	    class mysqldatabase implements Database {
	        public void persist(String data) {
	            System.out.println("Mysql has persisted" + " " + data);
	        }
	    }
	    // another class oracledatabase
	    class OracleDatabase implements Database {
	    	public void persist(String data) {
	    		System.out.println("OracleDatabase has persisted" + " " + data);
	    	}
	    }

}
