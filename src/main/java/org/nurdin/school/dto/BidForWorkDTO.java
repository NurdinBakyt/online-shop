package org.nurdin.school.dto;

import org.nurdin.school.enums.StatusOfBid;

public class BidForWorkDTO {

    private Long id;
    private String info_of_employee;
    private String documents_of_employee;
    private StatusOfBid bid_status;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo_of_employee() {
        return info_of_employee;
    }

    public void setInfo_of_employee(String info_of_employee) {
        this.info_of_employee = info_of_employee;
    }

    public String getDocuments_of_employee() {
        return documents_of_employee;
    }

    public void setDocuments_of_employee(String documents_of_employee) {
        this.documents_of_employee = documents_of_employee;
    }

    public StatusOfBid getBid_status() {
        return bid_status;
    }

    public void setBid_status(StatusOfBid bid_status) {
        this.bid_status = bid_status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
