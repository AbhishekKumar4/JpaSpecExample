package com.abhishek.jpaspec.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_CASE")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CASE_STATUS")
    private Long caseStatus;

    @Column(name = "ASSIGNED_TO")
    private String assignedTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Long caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
}
