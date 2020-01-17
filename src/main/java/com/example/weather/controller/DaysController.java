package com.example.weather.controller;


import com.example.weather.common.ServerResponse;
import com.example.weather.pojo.Days;
import com.example.weather.service.IDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/days")
public class DaysController {
    @Autowired
    IDaysService iDaysService;

    @RequestMapping(value = "/allDays", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<List<Days>> allDrom(HttpSession session) {
        ServerResponse<List<Days>> serverResponse = iDaysService.allDays();
        if (serverResponse.isSuccess()) {
            session.setAttribute("allDays", serverResponse.getData());
            return serverResponse;
        }
        return serverResponse;
    }
}
