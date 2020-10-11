create table `payment` (
	`id` bigint(20) not null auto_increment COMMENT 'id',
	`serial` VARCHAR(200) DEFAULT '流水号',
	PRIMARY KEY (`id`)
)engine=INNODB auto_increment=1 DEFAULT CHARSET=utf8;