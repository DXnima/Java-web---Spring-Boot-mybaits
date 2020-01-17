package com.example.weather.service.impl;


import com.example.weather.common.ServerResponse;
import com.example.weather.dao.DaysMapper;
import com.example.weather.pojo.Days;
import com.example.weather.service.IDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplDaysService implements IDaysService {
    @Autowired
    DaysMapper daysMapper;

    @Override
    public ServerResponse<List<Days>> allDays(){
        List<Days> daysList = daysMapper.selectAll();
        if (daysList == null) {
            return ServerResponse.createByErrorMessage("无数据！");
        }
        return ServerResponse.createBySuccess(daysList);
    }
}
