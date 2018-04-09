package com.joungpark.resume_api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joungpark.resume_api.model.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
	Optional<Profile> findByUserId(String userId);
}
