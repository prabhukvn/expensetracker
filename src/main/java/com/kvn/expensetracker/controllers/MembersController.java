package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.domainentities.Member;
import com.kvn.expensetracker.services.MembersService;

@RestController
@RequestMapping("/api")
public class MembersController {
	
	@Autowired
	private MembersService membersService;

	@PostMapping(value="/members", produces="application/json")
	public ResponseEntity<Member> create(Member member){
		
		Member newMember = membersService.create(member);
		return new ResponseEntity<Member>(newMember,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/members", produces="application/json")
	public ResponseEntity<List<Member>> getAll (){
		List<Member> members = membersService.findAll();
		return new ResponseEntity<List<Member>>(members,HttpStatus.OK);
	}
	//TODO
	// GET PUT and DELETE will follwo
}
