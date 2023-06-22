package com.manager.address.service;


import com.manager.address.model.AddressInfo;
import com.manager.address.resource.AddressResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
@Autowired
private AddressResource addressResource;


    public List<String> getAddressDetails(int empId){

        //return addressResource.findAllByEmpId(empId);
        return addressResource.findAllFullAddressByEmpId(empId);

    }



}
