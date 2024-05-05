package com.ytech.implementations;

import java.lang.reflect.Type;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ytech.interfaces.Tyres;

@Component
@Primary
public class BridgeStones implements Tyres{

	@Override
	public String rotate() {
		return "Vehicle moving with BridgeStone tyres";
	}

}
