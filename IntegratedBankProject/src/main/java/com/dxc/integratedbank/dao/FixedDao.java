package com.dxc.integratedbank.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.integratedbank.entity.FixedUser;

public interface FixedDao  extends JpaRepository<FixedUser, Integer>
{

}