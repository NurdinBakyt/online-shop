package org.nurdin.school.dto;

public class BidForWorkDTO {
    private String infoOfEmployee;
    private String documentsOfEmployee;
    private Long idUser;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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
