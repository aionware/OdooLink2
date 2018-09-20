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

    @Column(name="picking_warn")
    @JsonProperty("picking_warn")
    private String picking_warn;
    
    @Column(name="invoice_warn")
    @JsonProperty("invoice_warn")
    private String invoice_warn;
    
    @Column(name="purchase_warn")
    @JsonProperty("purchase_warn")
    private String purchase_warn;
    
    @Column(name="sale_warn")
    @JsonProperty("sale_warn")
    private String sale_warn;
    
    @Column(name="display_name")
    @JsonProperty("display_name")
    private String display_name;
    
    @Column(name="use_id")
    @JsonProperty("user_id")
    private String user_id;
    
    @Column(name="company_id")
    @JsonProperty("company_id")
    private Integer company_id;
    
    @Column(name="customer")
    @JsonProperty("customer")
    private Boolean customer;
    
    @Column(name="supplier")
    @JsonProperty("supplier")
    private Boolean supplier;
    
    @Column(name="employee")
    @JsonProperty("employee")
    private Boolean employee;
    
    @Column(name="is_company")
    @JsonProperty("is_company")
    private Boolean is_company;
    
    @Column(name="contact")
    @JsonProperty("contact")
    private String contact;
    
    @Column(name="write_uid")
    @JsonProperty("write_uid")
    private Integer write_uid;
    
//    @Embedded
//    @JsonProperty("address")
//    private Address address;
//    @Embedded
//    @JsonProperty("company")
//    private Company company;

    public User() {}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
    
    
}
