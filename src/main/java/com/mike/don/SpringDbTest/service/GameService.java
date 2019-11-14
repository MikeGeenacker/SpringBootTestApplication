package com.mike.don.SpringDbTest.service;

import com.mike.don.SpringDbTest.dto.Game;
import com.mike.don.SpringDbTest.repository.IGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService implements IGameService{
    @Autowired
    private IGameRepository repo;

    @Override
    public List<Game> findAll() {
        var games = (List<Game>) repo.findAll();
        return games;
    }
}
