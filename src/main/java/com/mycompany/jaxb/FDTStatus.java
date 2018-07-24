/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author syedaffanaslam
 */
@XmlRootElement(name = "FDTStatus")
public class FDTStatus {
    
    private String STAN;
    private String TxnReference; //perhaps integere too
    private String PostingDate;
    private int HostStatusCode;
    private String HostStatusDesc;
    private String StatusCode; 
    private String StatusDesc;

    /**
     * @return the STAN
     */
    @XmlElement(name="STAN")
    public String getSTAN() {
        return STAN;
    }

    /**
     * @param STAN the STAN to set
     */
    public void setSTAN(String STAN) {
        this.STAN = STAN;
    }

    /**
     * @return the TxnReference
     */
    @XmlElement(name="TxnReference")
    public String getTxnReference() {
        return TxnReference;
    }

    /**
     * @param TxnReference the TxnReference to set
     */
    public void setTxnReference(String TxnReference) {
        this.TxnReference = TxnReference;
    }

    /**
     * @return the PostingDate
     */
    @XmlElement(name="PostingDate")
    public String getPostingDate() {
        return PostingDate;
    }

    /**
     * @param PostingDate the PostingDate to set
     */
    public void setPostingDate(String PostingDate) {
        this.PostingDate = PostingDate;
    }

    /**
     * @return the HostStatusCode
     */
    @XmlElement(name="HostStatusCode")
    public int getHostStatusCode() {
        return HostStatusCode;
    }

    /**
     * @param HostStatusCode the HostStatusCode to set
     */
    public void setHostStatusCode(int HostStatusCode) {
        this.HostStatusCode = HostStatusCode;
    }

    /**
     * @return the HostStatusDesc
     */
    @XmlElement(name="HostStatusDesc")
    public String getHostStatusDesc() {
        return HostStatusDesc;
    }

    /**
     * @param HostStatusDesc the HostStatusDesc to set
     */
    public void setHostStatusDesc(String HostStatusDesc) {
        this.HostStatusDesc = HostStatusDesc;
    }

    /**
     * @return the StatusCode
     */
    @XmlElement(name="StatusCode")
    public String getStatusCode() {
        return StatusCode;
    }

    /**
     * @param StatusCode the StatusCode to set
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * @return the StatusDesc
     */
    @XmlElement(name="StatusDesc")
    public String getStatusDesc() {
        return StatusDesc;
    }

    /**
     * @param StatusDesc the StatusDesc to set
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

 
}
