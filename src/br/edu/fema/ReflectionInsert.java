package br.edu.fema;

import java.beans.PropertyDescriptor;
//import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionInsert {
	public void generateInsertStudent() {
		
		InsertStudent i = new InsertStudent();
		
	    @SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
	    
	    System.out.print("PÁGINA WEB - CADASTRO DE ESTUDANTES \n\n");
	    
	    System.out.print("Enter table name: ");
	    i.setGetTableName(input.nextLine());
		
	    System.out.print("Enter first name: ");
	    i.setGetFirstName(input.nextLine());
		
	    System.out.print("Enter last name: ");
	    i.setLastName(input.nextLine());
	    
	    System.out.print("Enter register number: ");
	    i.setRegisterNumber(Integer.parseInt(input.nextLine()));
	    
	    System.out.print("Enter address: ");
	    i.setGetAddress(input.nextLine());
	    
	    System.out.print("Enter address number: ");
	    i.setGetAddressNumber(Integer.parseInt(input.nextLine()));
	    
		try {
			//Class<?> cl = Class.forName("br.edu.fema.InsertStudent");
			//Field[] campos = cl.getDeclaredFields();
			//Method[] met = cl.getDeclaredMethods();
			
			Object tableName = new PropertyDescriptor("GetTableName", InsertStudent.class).getReadMethod().invoke(i);
			Object firstName = new PropertyDescriptor("GetFirstName", InsertStudent.class).getReadMethod().invoke(i);
			Object lastName = new PropertyDescriptor("lastName", InsertStudent.class).getReadMethod().invoke(i);
			Object registerNumber = new PropertyDescriptor("registerNumber", InsertStudent.class).getReadMethod().invoke(i);
			Object address = new PropertyDescriptor("GetAddress", InsertStudent.class).getReadMethod().invoke(i);
			Object addressNumber = new PropertyDescriptor("getAddressNumber", InsertStudent.class).getReadMethod().invoke(i);

			System.out.println("\n\nGERANDO SCRIPT SQL PARA INSERIR DADOS \n");
			
			System.out.println("INSERT INTO " + tableName.toString() + " VALUES (" + '"' + firstName.toString() + '"' + ", " + '"' 
																						 + lastName.toString()  + '"' + ", " + '"' 
																						 + registerNumber.toString() + '"' + ", " + '"' 
																						 + address.toString() + '"' + ", " + '"' 
																						 + addressNumber.toString() +																		 
																						 '"' +");");
		}catch(Throwable e) {
			System.out.println(e);
		}
	}
}
