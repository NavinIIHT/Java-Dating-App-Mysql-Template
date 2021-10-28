package com.iiht.training.datingapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.datingapp.dto.UserDto;
import com.iiht.training.datingapp.entity.User;
import com.iiht.training.datingapp.filter.Filter;
import com.iiht.training.datingapp.filter.FilterUtils;
import com.iiht.training.datingapp.service.LocationServiceApi;
import com.iiht.training.datingapp.service.UserService;

@Service
public class LocationServiceApiImpl implements LocationServiceApi {

	@Autowired
	private UserService userService;
	
	private List<UserDto> USER_DATA = userService.findAll();


	@Override
	public List<UserDto> getUsersDto(List<Filter> filters) {
		return null;
	}

	private List<UserDto> applyFilter(Filter filter, List<UserDto> filteredUsers) {
		return null;
	}

}