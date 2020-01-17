package com.example.weather.service;


import com.example.weather.common.ServerResponse;
import com.example.weather.pojo.Days;

import java.util.List;

public interface IDaysService {
    //
    ServerResponse<List<Days>> allDays();
}
