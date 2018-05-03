package com.joungpark.resume_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joungpark.resume_api.model.Profile;
import com.joungpark.resume_api.service.ProfileService;

@RestController
public class ProfileRestController {

	@Autowired
	ProfileService profileService;

	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/profile/read")
	public Profile getProfile(@RequestParam("userId") String userId) {
		System.out.println("getProfile RequestParam: " + userId);
		return profileService.getProfile(userId);
	}
	
	//@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.PUT, value = "/profile/update")
	public void updateProfile(@RequestBody Profile profile) {
		System.out.println("updateProfile : " + profile);
		profileService.updateProfile(profile);
	}
}
