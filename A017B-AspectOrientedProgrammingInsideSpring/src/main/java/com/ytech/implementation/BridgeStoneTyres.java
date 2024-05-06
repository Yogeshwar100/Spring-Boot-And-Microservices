package com.ytech.implementation;

import org.springframework.stereotype.Component;

import com.ytech.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

	@Override
	public String rotate() {
		return "Vehicle moving with the help of BridgeStone tyres";
	}

	@Override
	public String stop() {
		return "Vehicle stopped with the help of BridgeStone tyres";
	}
}
