package com.ytech.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ytech.eazyschool.model.Holiday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class HolidaysController {

	/**
	 	@requestparam supports attributes like name, required, value, defaultvalue.
	 	name and value:
	 	===============
	 	The name and value attribute indicates the name of the request parameter to bind to.
	 	 eg: @requestparam(name="festival") boolean fest
	 	 eg: @requestparam(value="festival") boolean fest

	 	required:
	 	=========
	 	The required attribute is used to make a field either optional or mandatory.
	 	If field is missing then exception will be thrown.
	 	
	 	defaultValue
	 	============
	 	For parameters with empty or null values then this defaultValue will be considered.
	 	 eg: @requestparam(defaultValue=true) boolean fest
	 	 
	 */
    @GetMapping("/holidays")
    public String displayHolidays(@RequestParam(required = false, value ="festival") boolean festival,
                                  @RequestParam(required = false) boolean federal,Model model) {
        model.addAttribute("festival",festival);
        model.addAttribute("federal",federal);
        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
        );
        Holiday.Type[] types = Holiday.Type.values();
        for (Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }
}
