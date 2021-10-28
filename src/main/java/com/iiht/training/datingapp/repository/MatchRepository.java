package com.iiht.training.datingapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.training.datingapp.entity.Match;
@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {

	
}
