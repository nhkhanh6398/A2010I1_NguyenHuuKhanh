SELECT * FROM furama_database.vitri;
INSERT INTO `furama_database`.`vitri` (`idvitri`, `tenvitri`) VALUES ('2', 'Nhân viên');
INSERT INTO `furama_database`.`vitri` (`idvitri`, `tenvitri`) VALUES ('3', 'Lễ tân');
INSERT INTO `furama_database`.`vitri` (`idvitri`, `tenvitri`) VALUES ('4', 'Quản lý');
UPDATE `furama_database`.`vitri` SET `tenvitri` = 'Quản lý' WHERE (`idvitri` = '3');
DELETE FROM `furama_database`.`vitri` WHERE (`idvitri` = '4');