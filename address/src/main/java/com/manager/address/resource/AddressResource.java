package com.manager.address.resource;


import com.manager.address.model.AddressInfo;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Resource
public interface AddressResource  extends JpaRepository<AddressInfo,Integer>{





        @Query("SELECT a.fullAddress FROM  AddressInfo a WHERE a.empId = :empId")
        List<String> findAllFullAddressByEmpId( @Param("empId") int empId);
}
