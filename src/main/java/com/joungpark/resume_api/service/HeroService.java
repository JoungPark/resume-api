package com.joungpark.resume_api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.joungpark.resume_api.model.Hero;

@Service
public class HeroService {
	List<Hero> heroes = new ArrayList<>(Arrays.asList(new Hero[] {
			new Hero(1, "Hason"),
			new Hero(2, "Captain")
	}));
	
	public List<Hero> getHeroes() {
		return heroes.stream().sorted(Comparator.comparing(Hero::getId).reversed()).collect(Collectors.toList());
	}
	
	public Hero getHero(int id) {
		return heroes.stream().filter(x->x.getId() == id).findAny().get();
	}
	
	public void update(Hero hero) {
		heroes.stream().filter(x->x.getId() == hero.getId()).findAny().get().setName(hero.getName());
	}

	public Hero add(Hero hero) {
		if (heroes.stream().filter(x->x.getId() == hero.getId()).collect(Collectors.counting()) > 0) {
			int newId = heroes.stream().map(x->x.getId()).sorted(Comparator.reverseOrder()).findFirst().get() + 1;
			hero.setId(newId);
		}
		heroes.add(hero);
		return hero;
	}
	
	public void delete(int id) {
		heroes.removeIf(x->x.getId() == id);
	}
}
