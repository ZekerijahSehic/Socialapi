package com.zekerijah.socialapi.service;

import com.zekerijah.socialapi.model.Location;
import com.zekerijah.socialapi.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public List<Location> getAllLocations(){

        List<Location> locations = new ArrayList<>();
        repository.findAll().forEach(locations::add);
        return locations;
    }

    public Optional<Location> getLocationById(Integer id){
        return repository.findById(id);

    }

    public void addLocation(Location location){
        repository.save(location);
    }

    public void updateLocation(Integer id, Location location){
        repository.save(location);
    }

    public void deleteLocation(Integer id){
        repository.deleteById(id);
    }

}
