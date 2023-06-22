package com.manager.address.controller;


import com.manager.address.model.AddressInfo;
import com.manager.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class addressController {
    @Autowired
    private AddressService addressService;


    @GetMapping("/addressinfo/{empID}")
    public List<String> addressInfoByEmpId(@PathVariable int empID){
        System.out.println("Testingggggg");
          System.out.println("Testingggggg2");
        return addressService.getAddressDetails(empID) ;


    }


}
