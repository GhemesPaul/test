package edu.msg.ro.persistence.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission {
    @Id
    private Long idPermision;
    private String type;
    private String  description;

    public Long getIdPermision() {
        return idPermision;
    }

    public void setIdPermision(Long idPermision) {
        this.idPermision = idPermision;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
