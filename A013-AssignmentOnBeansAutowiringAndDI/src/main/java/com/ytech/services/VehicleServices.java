package com.ytech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ytech.interfaces.Speakers;
import com.ytech.interfaces.Tyres;

@Component
public class VehicleServices {

	@Autowired
	private Speakers speakers;
	private Tyres tyres;

	public void moveVehicle() {
		String status = tyres.rotate();
		System.out.println(status);
	}

	public void playMusic() {
		String music = speakers.makeSound();
		System.out.println(music);
	}

	public Speakers getSpeakers() {
		return speakers;
	}

	public void setSpeakers(Speakers speakers) {
		this.speakers = speakers;
	}

	public Tyres getTyres() {
		return tyres;
	}

	@Autowired
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

}
