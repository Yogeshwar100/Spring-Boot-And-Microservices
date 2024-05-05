package com.ytech.implementations;

import org.springframework.stereotype.Component;

import com.ytech.interfaces.Speakers;
@Component
public class BoseSpeakers implements Speakers{

	@Override
	public String makeSound() {
		return "Playing music with BoseSpeakers";
	}

}
