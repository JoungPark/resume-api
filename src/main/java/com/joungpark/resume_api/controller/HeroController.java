package com.joungpark.resume_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joungpark.resume_api.model.Hero;
import com.joungpark.resume_api.service.HeroService;

@RestController
public class HeroController {

	@RequestMapping("/api/hello")
	public String hello() {
		return "hello, this is hero server.";
	}
	
	@Autowired
	HeroService heroService;
	
	@RequestMapping("/api/heroes")
	public List<Hero> getHeroes() {
		return heroService.getHeroes();
	}
	
	@RequestMapping("/api/hero/{id}")
	public Hero getHero(@PathVariable("id") int id) {
		return heroService.getHero(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/hero")
	public void updateHero(@RequestBody Hero hero) {
		System.out.println("updateHero: " + hero);
		heroService.update(hero);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/hero")
	public Hero addHero2(@RequestBody Hero hero) {
		return heroService.add(hero);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/hero/{id}")
	public void deleteHero(@PathVariable("id") int id) {
		System.out.println("delete:" + id);
		heroService.delete(id);
	}
}
