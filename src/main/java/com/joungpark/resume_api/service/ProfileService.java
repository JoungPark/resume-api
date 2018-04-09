package com.joungpark.resume_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joungpark.resume_api.model.Profile;
import com.joungpark.resume_api.repository.ProfileRepository;

@Service
public class ProfileService {
	@Autowired
	ProfileRepository profileRepository;
	
	public Profile getProfile(String userId) {
		Optional<Profile> ret = profileRepository.findByUserId(userId);
		if (ret.isPresent()) {
			return ret.get();
		} else {
			return null;
		}
	}
	
	public void updateProfile(Profile profile) {
		profileRepository.save(profile);
	}
}
