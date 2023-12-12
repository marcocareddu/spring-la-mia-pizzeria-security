package org.java.spring.services;

import java.util.List;

import org.java.spring.auth.Role;
import org.java.spring.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
	public Role findById(int id) {
		return roleRepository.findById(id).get();
	}
	public void save(Role role) {
		roleRepository.save(role);
	}
	public void deleteById(int id) {
		roleRepository.deleteById(id);
	}
}
