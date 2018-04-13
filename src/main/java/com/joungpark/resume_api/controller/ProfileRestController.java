package com.joungpark.resume_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
//	@RequestMapping("/api/profile/read/{userId}")
//	public Profile getProfile2(@PathVariable("userId") String userId) {
//		System.out.println("getProfile2 PathVariable: " + userId);
//		return profileService.getProfile(userId);
//	}
//	@RequestMapping("/api/profile/read")
//	public Profile getProfile2(@RequestParam("userId") String userId) {
//		System.out.println("getProfile2 RequestParam: " + userId);
//		return profileService.getProfile(userId);
//	}
	
//	@RequestMapping("/resume-api/profile/userId/{userId}")
//	public Profile getProfile3(@PathVariable("userId") String userId) {
//		System.out.println("getProfile3 PathVariable: " + userId);
//		return profileService.getProfile(userId);
//	}
	
	@RequestMapping("/profile/read")
	public Profile getProfile(@RequestParam("userId") String userId) {
		System.out.println("getProfile RequestParam: " + userId);
		return profileService.getProfile(userId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/profile/update")
	public void updateProfile(@RequestBody Profile profile) {
		System.out.println("updateProfile : " + profile);
		profileService.updateProfile(profile);
	}
}
