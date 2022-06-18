CREATE TABLE `item` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `item_group` (
  `group_id` int NOT NULL,
  `item_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO test.item_group (group_id,item_id) VALUES
	 (1,1),
	 (2,2),
	 (2,3),
	 (3,4),
	 (3,5),
	 (3,6),
	 (3,7),
	 (3,8);
	 
INSERT INTO test.item (name) VALUES
	 ('商品A'),
	 ('商品B'),
	 ('商品C'),
	 ('商品D'),
	 ('商品E'),
	 ('商品F'),
	 ('商品G'),
	 ('商品H');