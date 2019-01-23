package com.example.springmvc.suntravels.service;

import com.example.springmvc.suntravels.dao.HotelDao;
import com.example.springmvc.suntravels.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("hotelService")
@Transactional
public class hotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    @Override
    @Transactional
    public List<Hotel> getAllHotels() {
        return null;
    }
}
