package com.example.springmvc.suntravels.service;

import com.example.springmvc.suntravels.dao.AbstractDao;
import com.example.springmvc.suntravels.dao.HotelDao;
import com.example.springmvc.suntravels.domain.Hotel;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hotelDao")
public class HotelDAOImpl extends AbstractDao<Integer, Hotel> implements HotelDao {
    @Override
    @SuppressWarnings("unchecked")
    public List<Hotel> getAllHotels() {
        Criteria criteria = createEntityCriteria();
        return ( List<Hotel> ) criteria.list();
    }
}

