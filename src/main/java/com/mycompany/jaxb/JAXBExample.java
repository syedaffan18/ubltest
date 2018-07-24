/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



/**
 *
 * @author syedaffanaslam
 */
public class JAXBExample {
    
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("affan");
        customer.setAge(40);
        
        
    
    
    try {
        
		File file = new File("MyMoney.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
                //create new instance 
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                //invoke marshaller 

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(customer, file);
		jaxbMarshaller.marshal(customer, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

    
    
}
}