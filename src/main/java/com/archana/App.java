package com.archana;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.archana.model.Address;
import com.archana.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration().configure()
    			               .addAnnotatedClass(Student.class)
    	                       .addAnnotatedClass(Address.class);
    SessionFactory sf = cfg.buildSessionFactory();
    	                                 
   Session session = sf.openSession();
    	                              
     session.beginTransaction();
     //--------------------
           Student std= new Student();
           std.setRollNo(104);
           std.setName("reva");
           std.setMobile(1234);
           
           session.save(std);
           

     Address add = new Address();
       
       add.setId(2);
       add.setCity("miraj");
       add.setPin(1008);
       add.setStudent(std);
     //--------------------
     session.save(add);
    	                                 
    }

	
		
	}

