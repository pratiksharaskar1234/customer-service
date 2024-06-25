package com.pratiksha.customer_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "customer_TB")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue()
    @Column(name = "customer_id")
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;

}
