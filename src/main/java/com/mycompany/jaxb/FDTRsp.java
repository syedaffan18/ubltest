/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author syedaffanaslam
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="FDTRsp")
public class FDTRsp {
    

@XmlElement(name="RSP")
private RSP rsp = new RSP();

    /**
     * @return the rsp
     */
    public RSP getRsp() {
        return rsp;
    }

    /**
     * @param rsp the rsp to set
     */
    public void setRsp(RSP rsp) {
        this.rsp = rsp;
    }


    
}
