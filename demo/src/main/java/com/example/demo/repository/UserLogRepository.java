package com.example.demo.repository;

import com.example.demo.entity.UserLog;
import org.springframework.data.repository.CrudRepository;

public interface UserLogRepository extends CrudRepository<UserLog,Integer> {
}
