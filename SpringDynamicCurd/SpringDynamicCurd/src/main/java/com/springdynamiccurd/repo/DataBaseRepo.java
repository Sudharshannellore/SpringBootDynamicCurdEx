package com.springdynamiccurd.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdynamiccurd.users.Users;

@Repository
public interface DataBaseRepo extends CrudRepository<Users, Integer> {

}
