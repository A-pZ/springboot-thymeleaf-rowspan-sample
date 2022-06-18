package com.github.apz.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.apz.mapper.ItemMapper;
import com.github.apz.model.item.ItemGroup;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@AllArgsConstructor
@Slf4j
public class ItemRepository {
	ItemMapper itemMapper;
	
	public List<ItemGroup> findBy() {
		return itemMapper.findBy();
	}
}
