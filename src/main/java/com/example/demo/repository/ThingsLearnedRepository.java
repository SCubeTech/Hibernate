package com.example.demo.repository;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ThingsLearned;

public interface ThingsLearnedRepository extends JpaRepository<ThingsLearned, Long>  {
	
	@Cacheable
	@Query("from ThingsLearned where id =:id")
    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<ThingsLearned> findAllLearned(@Param("id") Long  id);
	
	

}
