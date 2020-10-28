package com.zekerijah.socialapi.controller;

import com.zekerijah.socialapi.model.Location;
import com.zekerijah.socialapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService service;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations(){
        return service.getAllLocations();
    }

    @RequestMapping(value = "/location/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id){
        return service.getLocationById(id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addNew(@RequestBody Location location){
        service.addLocation(location);
    }

    @RequestMapping(value = "/location/{id}/edit", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable Integer id){
        service.updateLocation(id, location);
    }

    @RequestMapping(value = "/location/{id}/delete", method = RequestMethod.DELETE)
    public void deleteLocation(Integer id){
        service.deleteLocation(id);
    }

}
