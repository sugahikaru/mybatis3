package com.hikaru.mybatis2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private PlayerMapper playerMapper;
    public PlayerController(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    @GetMapping("/players")
    public List<Player> findAll() {
        return playerMapper.findAll();
    }


    @GetMapping("/players2")
    public List<Player> findByNames(@RequestParam String startsWith) {
        return playerMapper.findByNameStartingWith(startsWith);
    }

}
