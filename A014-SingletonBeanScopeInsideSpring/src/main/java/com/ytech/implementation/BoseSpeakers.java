package com.ytech.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ytech.interfaces.Speakers;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}
