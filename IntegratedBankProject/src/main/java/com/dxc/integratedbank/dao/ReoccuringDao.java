
package com.dxc.integratedbank.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.integratedbank.entity.ReoccuringUser;

@Repository
public interface ReoccuringDao  extends JpaRepository<ReoccuringUser, Integer>
{

	//Optional<ReoccuringUser> findByName(String name);

}

