package org.nurdin.school.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.nurdin.school.enums.StatusOfBid;

@Entity
@Table (name = "bids_for_work")
@Schema(description = "Заявка на работу")
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

    @Column(name = "info_of_employee")
    private String infoOfEmployee;
    @Column(name = "documents_of_employee")
    @Schema(description = "Документы сотрудника")
    private String documentsOfEmployee;
    @Column(name = "bid_status")
    @Schema(description = "Статус заявка, по типу откланён или принят")
    private StatusOfBid bidStatus;

    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusOfBid getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(StatusOfBid bidStatus) {
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
