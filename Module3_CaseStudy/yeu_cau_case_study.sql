-- yêu cầu 2
use furama_database;
select *
from nhanvien
where (`name` like 'T%' or 'H%' or 'K%') and char_length(`name`)<15;

-- yêu cầu 3
use furama_database;
select *,year(day_birth), (year(now()) - year(day_birth)) as tuoi
from khachHang
where (diachi in ('Quảng Nam','Đà Nẵng')) having (tuoi between 18 and 50 );

-- yêu cầu 4
select KH.`name`, LK.tenloaikhach, count(HD.idKhachHang) so_lan_dat
from khachhang KH
inner join hopdong HD on HD.idKhachHang = KH.idKhachHang
inner join loaikhach LK on LK.idloaikhach = KH.idloaikhachhang
where tenloaikhach = 'Diamond'
group by KH.idKhachHang
order by so_lan_dat;

-- yêu cầu 5
select kh.idkhachhang,kh.`name`,lk.tenloaikhach,hd.idhopdong,dv.namedichvu,hd.ngaylamhopdong,
hd.ngayketthuc,(dv.chiphithue+hdct.soluong*dvdk.gia) as tongtien,count(hd.idkhachhang) as count
from khachhang kh
	left join hopdong hd on kh.idkhachhang = hd.idkhachhang
    left join loaikhach lk on kh.idloaikhachhang = lk.idloaikhach
    left join dichvu dv on hd.iddichvu = dv.iddichvu
    left join hopdongchitiet hdct on hdct.idhopdong = hd.idhopdong
    left join dichvudikem dvdk on dvdk.iddichvudikem = hdct.iddichvudikem
group by kh.idkhachhang;

-- yêu cầu 6
select hd.idhopdong,dv.iddichvu,dv.namedichvu,dv.dientich,hd.ngaylamhopdong,hd.ngayketthuc,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
	inner join loaidichvu ldv on ldv.idloaidichvu = dv.idloaidichvu
    inner join hopdong hd on hd.iddichvu = dv.iddichvu
where (year(hd.ngaylamhopdong)<=2018 or year(hd.ngaylamhopdong)=2019)
 and month(hd.ngaylamhopdong)>3 or year(hd.ngaylamhopdong)>2019

 order by hd.idhopdong;
 
--  yêu cầu 7
select hd.idhopdong,dv.iddichvu,dv.namedichvu,ldv.tenloaidichvu,dv.dientich,dv.songuoitoida,hd.ngaylamhopdong
from dichvu dv
inner join hopdong hd on dv.iddichvu = hd.iddichvu
inner join loaidichvu ldv on dv.idloaidichvu = ldv.idloaidichvu
where (year(hd.ngaylamhopdong) = 2018) and (year(hd.ngaylamhopdong) != 2019);

-- yêu cầu 8
select distinct kh.name
from khachhang kh
order by kh.name;

select kh.name
from khachhang kh
group by kh.name
having count(kh.name)=1;

select kh.name
from khachhang kh
union
select kh.name
from khachhang kh;

-- yêu cầu 9
select month(hd.ngaylamhopdong) as "tháng", year(hd.ngaylamhopdong) as "năm", count(hd.ngaylamhopdong) as "số lần làm hđ: "
from hopdong hd
group by hd.ngaylamhopdong having (month(ngaylamhopdong)>0);

-- yêu cầu 10
select hd.idhopdong,hd.ngaylamhopdong,hd.ngayketthuc,hd.tiendatcoc,count(hdct.idhopdongchitiet) as soluongdichvudikem
from hopdong hd
inner join hopdongchitiet hdct on hdct.idhopdong = hd.idhopdong
group by hd.idhopdong;

-- yêu cầu 11

select kh.`name`,kh.diachi,dvdk.iddichvudikem,dvdk.tendichvudikem
from khachhang kh
left join loaikhach lk on kh.idloaikhachhang = lk.idloaikhach
left join hopdong hd on kh.idkhachhang = hd.idkhachhang
left join hopdongchitiet hdck on hdck.idhopdong = hd.idhopdong
left join dichvudikem dvdk on hdck.iddichvudikem = dvdk.iddichvudikem
where (lk.tenloaikhach = "Diamond") and ((kh.diachi = "Vinh") or (kh.diachi = "Quảng Ngãi"));

-- yêu cầu 12

select hd.idhopdong, nv.`name`,kh.`name`,kh.phone,dv.namedichvu,count(hdct.iddichvudikem) as so_lan_su_dung
from hopdong hd
left join nhanvien nv on nv.idnhanvien = hd.idnhanvien
left join khachhang kh on kh.idkhachhang = hd.idkhachhang
left join dichvu dv on hd.iddichvu = dv.iddichvu
left join hopdongchitiet hdct on hdct.idhopdong = hd.idhopdong
where not exists (
select hd.idhopdong
where hd.ngaylamhopdong between "2019-01-01" and "2019-06-31") 
and exists (
select hd.idhopdong
where hd.ngaylamhopdong between "2019-09-01" and "2019-12-31");

-- yêu cầu 13

select dvdk.iddichvudikem, dvdk.tendichvudikem,count(hdct.iddichvudikem) so_lan_dat
from dichvudikem dvdk
inner join hopdongchitiet hdct on hdct.iddichvudikem = dvdk.iddichvudikem
group by hdct.iddichvudikem;

-- yêu cầu 14

select hd.idhopdong, ldv.tenloaidichvu, dvdk.tendichvudikem, count(hdct.iddichvudikem) as so_lan_dat
from hopdong hd
inner join dichvu dv on dv.iddichvu = hd.iddichvu
inner join loaidichvu ldv on ldv.idloaidichvu = dv.idloaidichvu
inner join hopdongchitiet hdct on hd.idhopdong = hdct.idhopdong
inner join dichvudikem dvdk on dvdk.iddichvudikem = hdct.iddichvudikem
group by dvdk.tendichvudikem
having so_lan_dat=1;

-- yêu cầu 15

select nv.idnhanvien,nv.`name`,td.trinhdo,bp.tenbophan,nv.phone,nv.diachi, count(hd.idnhanvien) as so_lan_lap_hd
from nhanvien nv
inner join bophan bp on bp.idbophan = nv.idbophan
inner join trinhdo td on td.idtrinhdo = nv.idtrinhdo
inner join hopdong hd on hd.idnhanvien = nv.idnhanvien
where hd.ngaylamhopdong between "2018-01-01" and "2019-12-31"
group by nv.idnhanvien
having so_lan_lap_hd = 3
order by nv.idnhanvien;

-- yêu cầu 16

delete from nhanvien
where not exists(
select hd.idnhanvien
from hopdong hd
where (hd.ngaylamhopdong between "2017-01-01" and "2019-12-31")
and hd.idnhanvien = nhanvien.idnhanvien
);
--  yêu cầu 17

 update khachhang,
 (select hopdong.idkhachhang as id, sum(hopdong.tongtien) as tong_tien
 from hopdong
 where year(hopdong.ngaylamhopdong)=2019
 group by hopdong.idkhachhang
 having tong_tien>10000000)
 as temp set khachhang.idloaikhachhang=(
 select loaikhach.idloaikhach 
 from loaikhach
 where loaikhach.tenloaikhach = "Diamond")
 where khachhang.idkhachhang = (
 select loaikhach.idloaikhach 
 from loaikhach
 where loaikhach.tenloaikhach = "Platinium")
 and temp.id=khachhang.idkhachhang;
 
--  yêu cầu 18

delete  hd, hopdongchitiet
from khachhang
inner join hopdong hd on hd.idkhachhang = khachhang.idkhachhang
inner join hopdongchitiet on hopdongchitiet.idhopdong = hd.idhopdong
where year(hd.ngaylamhopdong) <= 2016 
and hd.idkhachhang= khachhang.idkhachhang;

-- yêu cầu 19
update dichvudikem inner join (select dichvudikem.tendichvudikem as ten_dich_vu_di_kem
from hopdongchitiet 
inner join dichvudikem on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
inner join hopdong on hopdongchitiet.idhopdong = hopdong.idhopdong
where year(hopdong.ngaylamhopdong) = 2019
group by dichvudikem.tendichvudikem
having count(hopdongchitiet.iddichvudikem) >10) as
 temp set dichvudikem.gia = dichvudikem.gia*2
where dichvudikem.tendichvudikem = temp.ten_dich_vu_di_kem;

-- yêu cầu 20

select kh.idkhachhang as id, kh.`name`,kh.email,kh.phone,kh.day_birth,kh.diachi, "khachhang" as TypeTable
from khachhang kh
union all
select nv.idnhanvien as id,nv.`name`,nv.email,nv.phone,nv.day_birth,nv.diachi, "nhanvien" as TypeTable
from nhanvien nv;









