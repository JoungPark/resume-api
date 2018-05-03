package com.joungpark.resume_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.joungpark.resume_api.model.KeySkill;
import com.joungpark.resume_api.model.Profile;
import com.joungpark.resume_api.repository.ProfileRepository;

@SpringBootApplication
public class SpringApplicationResume implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringApplicationResume.class, args);
    }

    // @Configuration
    // @EnableWebSecurity
    // @EnableGlobalMethodSecurity(prePostEnabled = true)
    // protected static class SecurityConfig extends WebSecurityConfigurerAdapter {

    //     @Override
    //     protected void configure(HttpSecurity http) throws Exception {
    //         http
    //         .anonymous() //allow anonymous access
    //         .and()
    //         .authorizeRequests()
    //         .antMatchers("/profile/read").permitAll()
    //         .anyRequest().authenticated()
    //         .and()
    //         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER)
    //         ;
    //     }
    // }
    
    @Override
	public void run(String... args) throws Exception {
//    	saveProfile();
//    	retrieveProfile();
	}
	
	@Autowired
	ProfileRepository profileRepository;
	
	public void saveProfile()
    {
        Profile profile = new Profile();
        profile.setUserId("ABC");
        
        KeySkill keySkill1 = new KeySkill();
        keySkill1.setSkillName("Skill1");
        keySkill1.setProfile(profile);
        
        KeySkill keySkill2 = new KeySkill();
        keySkill2.setSkillName("Street 2");
        keySkill2.setProfile(profile);
        
        List<KeySkill> keySkillList = new ArrayList<KeySkill>();
        keySkillList.add(keySkill1);
        keySkillList.add(keySkill2);
        
        profile.setKeySkills(keySkillList);
        
        profileRepository.save(profile);
        System.out.println("Profile and Key Skill saved successfully!!");
    }
	
	public void retrieveProfile() {
		// Get list of all Employee & Employee Address
//        profileRepository.findAll().forEach(x -> System.out.println(x));
        System.out.println("===============================2");
//        System.out.println(profileRepository.findById(1).toString());	// if not found, returned value would be Optional.empty
//        System.out.println(profileRepository.findByUserId("ABC").toString());
	}
}
