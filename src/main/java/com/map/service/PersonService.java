package com.map.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.entity.Passport;
import com.map.entity.Person;
import com.map.repo.PassportRepo;
import com.map.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo prepo;
	@Autowired
	private PassportRepo repo;
	
	
	public void savePerson()
	{
		Person p=new Person();
		p.setName("mohini");
		p.setGender("female");
		Passport pp=new Passport();
		pp.setPassnum("vfgf43466");
		pp.setIssuedate(LocalDate.now());
		pp.setExpireDate(LocalDate.now().plusYears(10));
		//association person with password
		pp.setPerson(p);
		//association passport with person
		p.setPassport(pp);
		
		//save parent entity with child data also save
		prepo.save(p);
		
		
	}
	
	
	public void getPerson()
	{
		Optional<Person> byId = prepo.findById(1);
		//if(byId.isPresent())
		
	}
	public void getPassport()
	{
		repo.findById(1);
	}

}
