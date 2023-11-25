package com.example.demo.Service.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {
	
	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authority) {
		super(username, password, authority);
	}

}
