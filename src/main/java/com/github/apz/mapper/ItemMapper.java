package com.github.apz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.apz.model.item.ItemGroup;

@Mapper
public interface ItemMapper {
	List<ItemGroup> findBy();
}
