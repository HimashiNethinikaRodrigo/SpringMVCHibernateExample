package com.example.springmvc.suntravels.controller;

import com.example.springmvc.suntravels.domain.Hotel;
import com.example.springmvc.suntravels.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome()
    {
        return "Hi Welcome !";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String welcome_t( @PathVariable String username )
    {
        return "Hi " + username + " !";
    }

    @RequestMapping(value = "/ht", method = RequestMethod.GET)
    public List<Hotel> welcome_t()
    {
        List<Hotel> all = hotelService.getAllHotels();
        return all;
    }
}
