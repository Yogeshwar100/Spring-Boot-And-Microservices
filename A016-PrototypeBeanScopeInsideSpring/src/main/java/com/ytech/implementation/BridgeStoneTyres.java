package com.ytech.implementation;

import org.springframework.stereotype.Component;

import com.ytech.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
