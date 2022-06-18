package com.github.apz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.apz.model.item.ItemGroup;
import com.github.apz.service.ItemService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("")
public class DisplayController {
	
	ItemService itemService;
	
	@GetMapping
	public ModelAndView display(ModelAndView mnv) {
		
		List<ItemGroup> itemGroups = itemService.searchAllItems();
		
		mnv.addObject("itemGroups", itemGroups);
		mnv.setViewName("item");
		return mnv;
	}
}
