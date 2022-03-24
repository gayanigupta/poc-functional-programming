package com.user.security.poc.repository.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel {

    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "created_date", length = 19)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date", length = 19)
    private Date updatedDate;

    @PrePersist
    public void beforeCreate() {
        Date date = new Date();
        this.createdDate = date;
        this.updatedDate = null;
    }

    @PreUpdate
    public void beforeUpdate() {
        this.updatedDate = new Date();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
