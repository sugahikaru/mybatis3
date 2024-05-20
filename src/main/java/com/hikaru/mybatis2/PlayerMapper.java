package com.hikaru.mybatis2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerMapper {
    @Select("SELECT * FROM players")
    List<Player> findAll();

    @Select("SELECT * FROM players WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<Player> findByNameStartingWith(String prefix);

}
