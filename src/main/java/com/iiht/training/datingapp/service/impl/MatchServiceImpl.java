package com.iiht.training.datingapp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.datingapp.dto.MatchDto;
import com.iiht.training.datingapp.dto.UserDto;
import com.iiht.training.datingapp.filter.Filter;
import com.iiht.training.datingapp.repository.MatchRepository;
import com.iiht.training.datingapp.service.DislikesService;
import com.iiht.training.datingapp.service.LikesService;
import com.iiht.training.datingapp.service.LocationServiceApi;
import com.iiht.training.datingapp.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MatchService.class);

	@Autowired
	MatchRepository matchRepository;

	@Autowired
	LikesService likesService;

	@Autowired
	LocationServiceApi locationServiceApi;

	@Autowired
	DislikesService dislikesService;

	public List<MatchDto> getAllMatches(Long userId) {
		return null;
	}

	public MatchDto saveMatch(MatchDto matchDto) {
		return null;

	}

	@Override
	public List<UserDto> getPotentialMatches(Long userId, List<Filter> filters) {
		return null;
	}

}