package com.dxc.integratedbank.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.integratedbank.entity.FixedUser;
@Repository
public interface FixedDao  extends JpaRepository<FixedUser, Integer>
{

	Optional<FixedUser> findByName(String name);

}