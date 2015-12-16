package com.autencio.learning.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import org.springframework.data.geo.Point;

@Getter
@RequiredArgsConstructor
public class Address {

	private Point location;
	
	private String street;
	
	private String zipCode;
}