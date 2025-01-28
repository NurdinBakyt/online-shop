package org.nurdin.school.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class BidForStudyEntity extends BaseEntity {
    @Column(name = "infoOfChild")
    private String infoOfChild;
    @Column(name = "child'sDocuments")
    private String childsDocuments;
    @Column(name = "idDirector")
    private int idDirector;
    @Column(name = "statusOfBidConsideration")
    private Boolean statusOfBidConsideration;

}
