package org.nurdin.school.entity;


import jakarta.persistence.*;

@Entity
@Table (name = "bids-for-work")
public class BidForWorkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "info-of-employee")
    private String infoOfEmployee;
    @Column(name = "documents-of-employee")
    private String documentsOfEmployee;
    @Column(name = "bid-status")
    private String bidStatus;

    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }

    public String getInfoOfEmployee() {
        return infoOfEmployee;
    }

    public void setInfoOfEmployee(String infoOfEmployee) {
        this.infoOfEmployee = infoOfEmployee;
    }

    public String getDocumentsOfEmployee() {
        return documentsOfEmployee;
    }

    public void setDocumentsOfEmployee(String documentsOfEmployee) {
        this.documentsOfEmployee = documentsOfEmployee;
    }
}
