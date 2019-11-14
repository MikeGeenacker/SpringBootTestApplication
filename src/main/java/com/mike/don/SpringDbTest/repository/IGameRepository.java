package com.mike.don.SpringDbTest.repository;

import com.mike.don.SpringDbTest.dto.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGameRepository extends CrudRepository<Game, Long> {
}
