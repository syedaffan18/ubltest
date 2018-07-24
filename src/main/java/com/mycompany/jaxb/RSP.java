/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxb;

import java.util.ArrayList;


import javax.xml.bind.annotation.*;


/**
 *
 * @author syedaffanaslam
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name = "RSP")
public class RSP {
    
    //Adding XMLElementWrapper 
    @XmlElementWrapper(name = "FDTList")
    
    @XmlElement(name = "FDTStatus")
    private ArrayList<FDTStatus> FDTList;
    
    @XmlElement(name = "STAN")
    private String STAN_B;
    
    @XmlElement(name = "BatchReferenceNo")
    private String BatchReferenceNo;

    /**
     * @return the FDTList
     */
    public ArrayList<FDTStatus> getFDTList() {
        return FDTList;
    }

    /**
     * @param FDTList the FDTList to set
     */
    public void setFDTList(ArrayList<FDTStatus> FDTList) {
        this.FDTList = FDTList;
    }

    /**
     * @return the STAN_B
     */
   
    public String getSTAN_B() {
        return STAN_B;
    }

    /**
     * @param STAN_B the STAN_B to set
     */
    public void setSTAN_B(String STAN_B) {
        this.STAN_B = STAN_B;
    }

    /**
     * @return the BatchReferenceNo
     */
    
    public String getBatchReferenceNo() {
        return BatchReferenceNo;
    }

    /**
     * @param BatchReferenceNo the BatchReferenceNo to set
     */
    public void setBatchReferenceNo(String BatchReferenceNo) {
        this.BatchReferenceNo = BatchReferenceNo;
    }
    
    
    public void addFDTStatus(FDTStatus fdtstatus)
    {
        try {
            
            if (FDTList == null)
            {
                FDTList = new ArrayList <>();
            }
            
          
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        
     
        
        
    }
    
//    @Override
//    public String toString(){
//       return "param :" + getBatchReferenceNo();
//
//    }
    
    
}
