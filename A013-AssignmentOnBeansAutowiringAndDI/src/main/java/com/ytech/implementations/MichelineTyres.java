package com.ytech.implementations;

import org.springframework.stereotype.Component;

import com.ytech.interfaces.Tyres;

@Component
public class MichelineTyres implements Tyres{

	public String rotate() {
		return "Vehicle moving with Micheline Tyres";
	}
}
