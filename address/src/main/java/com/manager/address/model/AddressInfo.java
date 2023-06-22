package com.manager.address.model;



import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Address-Info")
public class AddressInfo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullAddress;
    private int empId;




}
