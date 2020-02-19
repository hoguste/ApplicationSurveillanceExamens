//package com.exam.myapp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.exam.myapp.entity.Role;
//import com.exam.myapp.service.RoleService;
//
//@Controller
//@RequestMapping
//public class RoleController {
//	@Autowired
//	private RoleService rolser;
//	@Autowired
//	private Role role;
//	@Autowired
//	private Role role1;
//	@Autowired
//	private Role role2;
//	
//	
//	
//
//	public Role getRole2() {
//		return role2;
//	}
//
//	public void setRole2(Role role2) {
//		this.role2 = role2;
//	}
//
//	public Role getRole1() {
//		return role1;
//	}
//
//	public void setRole1(Role role1) {
//		this.role1 = role1;
//	}
//
//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}
//
//	public RoleService getRolser() {
//		return rolser;
//	}
//
//	public void setRolser(RoleService rolser) {
//		this.rolser = rolser;
//	}
//	
//	private void init() {
//		role.setId(1);
//		role.setNom("master");
//		rolser.ajout(role);
//		role1.setId(2);
//		role1.setNom("admin");
//		rolser.ajout(role1);
//		role2.setId(3);
//		role2.setNom("enseignant");
//		rolser.ajout(role2);
//		
//		
//		
//
//	}
//	
//
//
//}
