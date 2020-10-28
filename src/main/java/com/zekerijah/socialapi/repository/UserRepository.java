package com.zekerijah.socialapi.repository;

import com.zekerijah.socialapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findByLocationId (Integer locationId);

    public List<User> findByName(String name);
}
