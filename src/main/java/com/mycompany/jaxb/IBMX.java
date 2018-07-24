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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author syedaffanaslam
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="IBMX")
public class IBMX {
    

@XmlElement(name="FDTRsp")
private FDTRsp fdtRsp = new FDTRsp();

    /**
     * @return the fdtRsp
     */
    public FDTRsp getFdtRsp() {
        return fdtRsp;
    }

    /**
     * @param fdtRsp the fdtRsp to set
     */
    public void setFdtRsp(FDTRsp fdtRsp) {
        this.fdtRsp = fdtRsp;
    }

    
}