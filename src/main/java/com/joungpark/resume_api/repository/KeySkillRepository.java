package com.joungpark.resume_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joungpark.resume_api.model.KeySkill;

@Repository
public interface KeySkillRepository extends CrudRepository<KeySkill, Integer> {

}
