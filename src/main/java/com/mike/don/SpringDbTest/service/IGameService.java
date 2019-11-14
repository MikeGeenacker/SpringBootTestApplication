package com.mike.don.SpringDbTest.service;

import com.mike.don.SpringDbTest.dto.Game;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IGameService {
    public List<Game> findAll();
}
