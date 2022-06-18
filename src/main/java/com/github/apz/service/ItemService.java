package com.github.apz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.apz.model.item.ItemGroup;
import com.github.apz.repository.ItemRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ItemService {
	ItemRepository itemRepository;
	
	public List<ItemGroup> searchAllItems() {
		return itemRepository.findBy();
	}
}
