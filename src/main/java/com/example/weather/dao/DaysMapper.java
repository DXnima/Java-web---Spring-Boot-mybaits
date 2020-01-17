package com.example.weather.dao;

import com.example.weather.pojo.Days;

import java.util.List;

public interface DaysMapper {
    int insert(Days record);

    int insertSelective(Days record);

    List<Days> selectAll();
}