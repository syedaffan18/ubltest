/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxb;

/**
 *
 * @author syedaffanaslam
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
/**
 * This example shows , how to map nested java object in jaxb 2.0
 * 
 * @author Ranjeet.Jha
 *
 */
public class FTDMainApp {
 
  // create a doc folder if not available in side the project
  private static final String FTDLIST_XML = "ftdlist.xml";
 
  public static void main(String[] args) throws JAXBException, IOException {
 
	// create book object and populate some values
        
        FDTStatus fdtStatus = new FDTStatus();
        
        ArrayList<FDTStatus> List = new ArrayList<FDTStatus>();
        
       
	//FDTStatus fdtStatus = new FDTStatus();
        fdtStatus.setSTAN("373a8c21-5144-433b-b0dc-e01409bb5ee6");
        fdtStatus.setTxnReference("7125461018037696");
        fdtStatus.setPostingDate("05-December-2017 11:58 AM");
        fdtStatus.setHostStatusCode(10000);
        fdtStatus.setHostStatusDesc("Success");
        fdtStatus.setStatusCode("IIB100");
        fdtStatus.setStatusDesc("Success");
        
        FDTStatus fdtStatus2 = new FDTStatus();
        
        fdtStatus2.setSTAN("373a8c21-5144-433b-b0dc-e01409bb5ee6");
        fdtStatus2.setTxnReference("7125461018037696");
        fdtStatus2.setPostingDate("05-December-2018 11:58 AM");
        fdtStatus2.setHostStatusCode(10000);
        fdtStatus2.setHostStatusDesc("Success");
        fdtStatus2.setStatusCode("IIB100");
        fdtStatus2.setStatusDesc("Success");
        
        List.add(fdtStatus);
        List.add(fdtStatus2);
        
        RSP rsp = new RSP();
        
        rsp.setBatchReferenceNo("1476106692886803");
        rsp.setSTAN_B("4c610a2f-a235-4be4-9aab-b3254f32f755");
        //rsp.addFDTStatus();//add FDTStatus into the list 
        rsp.setFDTList(List);
        
        System.out.println("param: " + rsp.getFDTList());
        
        System.out.println(rsp);
        
        FDTRsp fdtRsp = new FDTRsp();
        
        fdtRsp.setRsp(rsp);
        
        IBMX ibmx = new IBMX();
        
        ibmx.setFdtRsp(fdtRsp);
        
        
	//IBMX ibmx = new IBMX();
        
        //ibmx.setRsp(rsp);
 
	// create JAXB context and instantiate marshaller
	// here bookStore class is container , which contains Book
	JAXBContext context = JAXBContext.newInstance(IBMX.class);
	Marshaller m = context.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        
	// Write to System.out
	m.marshal(ibmx, System.out);
 
	// Write to File
	m.marshal(ibmx, new File(FTDLIST_XML));
 
	// read out xml file, and populate values in java object
	// here xml created before are going to read
	System.out.println();
	System.out.println("Output from XML File: ");
	Unmarshaller um = context.createUnmarshaller();
	IBMX ibmxResp = (IBMX) um.unmarshal(new FileReader(FTDLIST_XML));
	ArrayList<FDTStatus> respList = ibmxResp.getFdtRsp().getRsp().getFDTList();
	for (FDTStatus status : respList) {
		System.out.println("date: " + status.getPostingDate());
		
	}
 
  }
 
}