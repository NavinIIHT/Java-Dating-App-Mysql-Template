package com.iiht.training.datingapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.datingapp.dto.UserDto;
import com.iiht.training.datingapp.repository.UserRepository;
import com.iiht.training.datingapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDto registerUser(UserDto userDto) {
		return null;
	}

	@Override
	public UserDto getById(Long userId) {
		return null;

	}

	@Override
	public UserDto updateUser(UserDto userDto) {
		return null;
	}

	@Override
	public boolean deleteUser(Long userId) {
		return false;
	}

	@Override
	public List<UserDto> findAll() {
		return null;
	}

}
