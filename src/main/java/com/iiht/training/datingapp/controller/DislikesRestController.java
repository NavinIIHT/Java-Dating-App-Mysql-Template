package com.iiht.training.datingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.datingapp.service.DislikesService;

@RestController
@RequestMapping("/dislikes")
public class DislikesRestController {

	@Autowired
	DislikesService dislikesService;

}