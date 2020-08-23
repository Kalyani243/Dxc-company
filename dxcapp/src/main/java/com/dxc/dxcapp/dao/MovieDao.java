package com.dxc.dxcapp.dao;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import com.dxc.dxcapp.entity.Movie;
	@Repository
	public interface MovieDao extends JpaRepository<Movie, Integer> {

	}



