SELECT * FROM furama_database.bophan;
INSERT INTO `furama_database`.`bophan` (`idbophan`, `tenbophan`) VALUES ('2', 'Nhân viên');
UPDATE `furama_database`.`bophan` SET `tenbophan` = 'Giám đốc' WHERE (`idbophan` = '1');
INSERT INTO `furama_database`.`bophan` (`idbophan`, `tenbophan`) VALUES ('3', 'Quản lí');
