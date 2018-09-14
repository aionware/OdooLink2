package com.allen.odooLink2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Data
@AllArgsConstructor
@Entity
@Table(name="res_partner")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name="id")
    @JsonProperty("id")
    private Long id;
    
    @Column(name="name")
    @JsonProperty("name")
    private String name;
    
    @Column(name="street")
    @JsonProperty("street")
    private String street;
    
    @Column(name="street2")
    @JsonProperty("street2")
    private String street2;
    
    @Column(name="city")
    @JsonProperty("city")
    private String city;
    
    @Column(name="zip")
    @JsonProperty("zip")
    private String zip;
    
//    @JsonInclude(Include.NON_NULL)
    @Column(name="state_id")
    @JsonProperty("state_id")
    private Integer state_id;
    
    @Column(name="email")
    @JsonProperty("email")
    private String email;
    
    @Column(name="phone")
    @JsonProperty("phone")
    private String phone;
    
    @Column(name="mobile")
    @JsonProperty("mobile")
    private String mobile;
    
    @Column(name="fax")
    @JsonProperty("fax")
    private String fax;
    
    @Column(name="active")
    @JsonProperty("active")
    private boolean active;
  
    @Column(name="parent_id")
    @JsonProperty("parent_id")
    private Integer parent_id;
//    @Embedded
//    @JsonProperty("address")
//    private Address address;
//    @Embedded
//    @JsonProperty("company")
//    private Company company;

    public User() {}
}
