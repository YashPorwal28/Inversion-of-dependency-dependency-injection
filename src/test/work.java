package test;

public class work {
	
	// rely on abstractions rather than concrete implementantations

    public static void main(String[] args) {
        work container = new work();

        // Create an instance of the inner class using the outer class instance
        User user = container.new User(container.new OracleDatabase());
        user.add("onetuhoneu");
    }

    // Inner class User
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
    
    class OracleDatabase implements Database {
    	public void persist(String data) {
    		System.out.println("OracleDatabase has persisted" + " " + data);
    	}
    }
}
