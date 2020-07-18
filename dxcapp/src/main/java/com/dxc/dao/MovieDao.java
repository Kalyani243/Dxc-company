package com.dxc.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dxc.entity.Movie;
@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

}
