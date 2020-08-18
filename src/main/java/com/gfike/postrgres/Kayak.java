package com.gfike.postrgres;

//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
//@Data
public class Kayak {
    public Kayak(String kname, String owner, Number value, String makeModel) {
        this.kName = kName;
        this.owner = owner;
        this.value = value;
        this.makeModel = makeModel;
    }
    public Kayak(){}

    public Integer getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String kName;

    private String owner;

    private Number value;

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    private String makeModel;

}
