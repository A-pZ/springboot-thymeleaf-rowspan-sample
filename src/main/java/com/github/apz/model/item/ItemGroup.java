package com.github.apz.model.item;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @Getter
public class ItemGroup {
	private Integer groupId;
	private List<Item> items;
}
