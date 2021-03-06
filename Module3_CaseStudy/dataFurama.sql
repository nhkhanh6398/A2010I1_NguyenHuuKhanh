drop database if exists furama_database;

create database furama_database;
use furama_database;

create table vitri(
idvitri int primary key auto_increment,
tenvitri varchar (45)
);
create table trinhdo(
idtrinhdo int primary key auto_increment,
trinhdo varchar(45)
);
create table bophan(
idbophan int primary key auto_increment,
tenbophan varchar(45)
);
create table kieuthue(
idkieuthue int auto_increment primary key,
tenkieuthue varchar(45),
gia int
);
create table loaidichvu(
idloaidichvu int auto_increment primary key,
tenloaidichvu varchar(255)
);
create table loaikhach(
idloaikhach int primary key auto_increment,
tenloaikhach varchar(45)
);
create table dichvudikem(
iddichvudikem int primary key auto_increment,
tendichvudikem varchar(45),
gia int, 
donvi varchar(5),
trangthaikhadung varchar(45)
);
create table nhanvien(
idnhanvien int auto_increment,
`name` varchar (50) not null,
idvitri int,
idtrinhdo int not null,
idbophan int not null,
day_birth date,
cmnd varchar (45),
luong varchar(45),
phone char(11),
email varchar(30),
diachi varchar(45),

constraint idnhanvien_pk primary key (idnhanvien),
foreign key(idtrinhdo) references trinhdo(idtrinhdo),
foreign key (idvitri) references vitri(idvitri),
foreign key (idbophan) references bophan(idbophan)
);

create table khachhang(
idkhachhang int primary key auto_increment,
idloaikhachhang int,
`name` varchar (50),
day_birth date,
phone char(11),
email varchar(30),
diachi varchar(45),
foreign key (idloaikhachhang) references loaikhach(idloaikhach)

);
create table dichvu(
iddichvu int primary key auto_increment,
namedichvu varchar(255),
dientich int,
sotang int,
songuoitoida int,
chiphithue int,
trangthai varchar(45),
idkieuthue int,
idloaidichvu int,
foreign key(idloaidichvu) references loaidichvu(idloaidichvu),
foreign key(idkieuthue) references kieuthue(idkieuthue)
);
create table hopdong(
idhopdong int primary key auto_increment,
idnhanvien int,
idkhachhang int ,
iddichvu int,
ngaylamhopdong date,
ngayketthuc date,
tiendatcoc int,
tongtien int,
foreign key(iddichvu) references dichvu(iddichvu),
foreign key(idkhachhang) references khachhang(idkhachhang) on delete cascade,
foreign key(idnhanvien) references nhanvien(idnhanvien)
);

create table hopdongchitiet(
idhopdongchitiet int primary key auto_increment,
idhopdong int,
iddichvudikem int,
soluong int,
foreign key (iddichvudikem) references dichvudikem(iddichvudikem),
foreign key (idhopdong) references hopdong(idhopdong) on delete cascade
);
INSERT INTO `furama_database`.`trinhdo` (`idtrinhdo`, `trinhdo`) VALUES ('1', 'B???c ?????i H???c');
INSERT INTO `furama_database`.`trinhdo` (`idtrinhdo`, `trinhdo`) VALUES ('2', 'B???c THPT');
INSERT INTO `furama_database`.`trinhdo` (`idtrinhdo`, `trinhdo`) VALUES ('3', 'B???c THCS');
INSERT INTO `furama_database`.`trinhdo` (`idtrinhdo`, `trinhdo`) VALUES ('4', 'B???c cao ?????ng');


INSERT INTO `furama_database`.`vitri` (`idvitri`, `tenvitri`) VALUES (1,'Gi??m ?????c'), ('2', 'Nh??n vi??n'),('3', 'Qu???n l??');


INSERT INTO `furama_database`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('1', 'Thu?? Ng???n H???n', '1000');
INSERT INTO `furama_database`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('2', 'Thu?? D??i H???n', '10000');
INSERT INTO `furama_database`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('3', 'Thu?? Trung H???n', '5000');

INSERT INTO `furama_database`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('1', 'Tr???n g??i');
INSERT INTO `furama_database`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('2', 'Ri??ng l???');
INSERT INTO `furama_database`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('3', 'Combo');

INSERT INTO `furama_database`.`bophan` (`idbophan`, `tenbophan`) VALUES ('1', 'Gi??m ?????c'),('2', 'Nh??n vi??n'),('3', 'Qu???n l??');


INSERT INTO `dichvudikem` VALUES (1,'Ph??ng',10000,'vnd','ok'),
(2,'Villa',20000,'vnd','ok'),(3,'House',30000,'vnd','ok');

INSERT INTO `loaikhach` VALUES (1,'Vip'),(2,'Normal'),(3,'Diamond'),(4,'Platinium');

INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('1', 'Ph??ng M??y L???nh', '50', '2', '5', '500000', 'ok', '1', '1');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('2', 'Ph??ng T??nh Nh??n', '20', '1', '2', '1000000', 'ok', '1', '1');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('3', 'Villa 5 Ph??ng', '100', '2', '15', '2000000', 'ok', '2', '2');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('4', 'Villa Gia ????nh', '100', '2', '15', '3000000', 'ok', '3', '2');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('5', 'Villa Vip', '100', '3', '12', '4500000', 'ok', '1', '2');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('6', 'Hose Stay', '50', '1', '5', '500000', 'ok', '1', '3');
INSERT INTO `furama_database`.`dichvu` (`iddichvu`, `namedichvu`, `dientich`, `sotang`, `songuoitoida`, `chiphithue`, `trangthai`, `idkieuthue`, `idloaidichvu`) VALUES ('7', 'Hose Blue', '50', '1', '5', '500000', 'ok', '2', '3');



INSERT INTO `nhanvien` VALUES (1,'Nguy???n H???u Kh??nh',1,1,1,'1998-03-06','1234567','550000','4564657','nnn@ggg','???? N???ng'),
(2,'Tr???n Th??? Thu Hi???n',1,1,1,'1998-03-20','45646578','550000','656558','hien@gmail.com','???? N???ng'),
(3,'L?? Th??? Trung',2,1,2,'1999-02-01','456789','500000','6565','trung@gmail.com','Ngh??? An'),
(4,'Tr???n Th??? Ly Na',3,1,3,'1996-05-05','456465','500000','564564','na@gmail.com','Qu???ng Tr???'),
(5,'Tr???n Cao Th??ng',2,2,3,'1999-04-04','456465','400000','65454','thong@gmail.com','Qu???ng B??nh'),
(6,'H??? Th??? Thanh B??nh',3,1,2,'1999-06-12','658822','450000','665533','binh@gmail.com','???? N???ng');









INSERT INTO `khachhang` VALUES (1,1,'Th??ng','1999-05-05','123564','thong@gmail.com','???? N???ng'),
(2,1,'Kh??nh','1998-03-06','0367761054','khanh@gmail.com','???? N???ng'),
(3,2,'Hi???u','1999-10-22','6545556','hieu@gmail.com','Gia Lai'),
(4,2,'Trung','1999-01-01','55566663','trunghoa@gmail.com','Ngh??? An'),
(5,3,'Bun','2006-02-12','6688885','bunbun@gmail.com','Qu???ng Tr???'),
(6,3,'Tr??m','1976-04-17','66522155','tram@gmail.com','Qu???ng Tr???');
INSERT INTO `furama_database`.`khachhang` (`idkhachhang`, `idloaikhachhang`, `name`, `day_birth`, `phone`, `email`, `diachi`) 
VALUES ('8', '3', 'Ho??ng', '1998-05-06', '123456', 'hoang@gmail.com', 'Qu???ng Ng??i');

INSERT INTO `hopdong` VALUES (1,1,1,1,'2021-04-06','2021-04-10',50000,500000),
(2,1,1,3,'2021-04-06','2021-05-06',100000,1500000),
(3,1,4,2,'2021-04-06','2021-06-06',100050,2000050),
(4,2,4,3,'2021-04-06','2021-04-28',50000,100000),
(5,3,5,1,'2021-04-06','2021-04-15',1000,200000),
(6,2,5,2,'2021-04-06','2021-07-01',20000,200000),(7,2,6,3,'2021-04-06','2021-07-01',30000,400000);



INSERT INTO `furama_database`.`hopdong` (`idhopdong`, `idnhanvien`, `idkhachhang`, `iddichvu`, `ngaylamhopdong`, `ngayketthuc`, `tiendatcoc`, `tongtien`)
 VALUES (1, '1', '1', '2', '2018-05-06', '2019-06-01', '300000', '450000');
 

INSERT INTO `hopdongchitiet` VALUES (1,1,1,5),(2,2,1,1),(3,3,3,5),(4,5,2,10),
(5,6,1,5),(6,7,3,5),(7,8,1,6);




