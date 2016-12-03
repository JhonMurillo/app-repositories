package com.sincapp.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
@ApiModel("Model City")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "the  id", required = true)
    private Long id;

    @Column(nullable = false)
    @ApiModelProperty(value = "the  name", required = true)
    private String name;

    @Column(nullable = false)
    @ApiModelProperty(value = "the  state", required = true)
    private String state;

    @Column(nullable = false)
    @ApiModelProperty(value = "the  country", required = true)
    private String country;

    @Column(nullable = false)
    @ApiModelProperty(value = "the  map", required = true)
    private String map;

    protected City() {
    }

    public City(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getMap() {
        return this.map;
    }

    @Override
    public String toString() {
        return getName() + "," + getState() + "," + getCountry();
    }
}
