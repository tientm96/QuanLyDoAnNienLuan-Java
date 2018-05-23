
CREATE DATABASE QL_DANL_JAVA
GO

USE QL_DANL_JAVA
GO

--Phan Quyen
--Tai Khoan
--Sinh Vien
--Giang Vien
--DeTai
--Bo Mon
--Quyen Do an
--Phieudangki
--Phieuphancong

CREATE TABLE TBL_SINHVIEN
(
	MSSV varchar(10) PRIMARY KEY not null,
	HoTen NVARCHAR(100),
	NgaySinh Smalldatetime,
	Phai nvarchar(5) ,
	Khoa NVarChar(20),
	Email varchar(50),
	SDT varchar(12),
)
GO

CREATE TABLE TBL_TAIKHOAN
(
	TaiKhoanID varchar(10) primary key not null,
	Pass varchar(20),
	TaiKhoanGhiChu nvarchar(100),
)
GO

CREATE TABLE TBL_GIANGVIEN
(
	MaGV varchar(10) primary key not null,
	HoTenGV nvarchar(50),
	Phai nvarchar(5) ,
	MaChucDanh varchar(10),
	SDT char(12),
	Email varchar(100),
	SoDARa int,
	SoDACham int,
)
GO

CREATE TABLE TBL_DETAI
(
	MaDeTai varchar(10) primary key not null,
	TenDeTai nvarchar(100),
	LoaiDeTai nvarchar(50),
	NgayRaDT smalldatetime,
	FK_MaGV varchar(10),
	foreign key(FK_MaGV) references dbo.TBL_GIANGVIEN(MaGV), --tham chieu den bang giang vien

)
GO

CREATE TABLE TBL_BOMON
(
	MaChucVu varchar(10) primary key not null,
	ChucVu nvarchar(50),
	TenCanBo nvarchar(50),
)
GO

CREATE TABLE TBL_PHIEUDANGKY
(
	MaPhieuDK varchar (10) primary key not null,
	NgayDK smalldatetime,
	FK_MaDeTai varchar(10),
	FK_MSSV varchar(10) not null,
	
	foreign key(FK_MaDeTai) references dbo.TBL_DETAI(MaDeTai), --Tham chieu den DETAI
	foreign key(FK_MSSV) references dbo.TBL_SINHVIEN(MSSV), --Tham chieu toi SINHVIEN
	
)
GO

CREATE TABLE TBL_QUYENDOAN
(
	MaQuyenDA varchar(10) primary key not null,
	NgayNop Smalldatetime,
	DiemDA char(5),
	NhanXet Nvarchar(100),
	FK_MaPhieuDK varchar(10),
	foreign key (FK_MaPhieuDK) references dbo.TBL_PHIEUDANGKY(MaPhieuDK), --Tham chieu toi PHIEUDANGKY
)
GO

CREATE TABLE TBL_PHIEUPHANCONG
(
	MaPhieuPC varchar(10) primary key not null,
	NgayPC smalldatetime,
	FK_MaGV varchar(10),
	FK_MaChucVu varchar(10), 
	FK_MaQuyenDA varchar(10),
	
	foreign key(FK_MaGV) references dbo.TBL_GIANGVIEN(MaGV), --Tham chieu den GIANGVIEN
	foreign key (FK_MaChucVu) references dbo.TBL_BOMON(MaChucVu), --tham chieu den BOMON
	foreign key (FK_MaQuyenDA) references dbo.TBL_QUYENDOAN(MaQuyenDA) --tham chieu toi QUYENDOAN
)
GO

--INSERT INTO TAIKHOAN
insert into TBL_TAIKHOAN
(TaiKhoanID,Pass,TaiKhoanGhiChu)

values('14520001','11','TaiKhoanSinhVien'),
	  ('14520002','22','TaiKhoanSinhVien'),
	  ('14520003','33','TaiKhoanSinhVien'),
	  ('1001','11','TaiKhoanTruongBoMon'),
	  ('1002','22','TaiKhoanPhoBoMon'),
	  ('1003','33','TaiKhoanCanBoTrucThuoc')
Go

--INSERT INTO SINHVIEN
insert into TBL_SINHVIEN
(MSSV, HoTen,NgaySinh,Phai,Khoa,Email,SDT)
values ('14520001',N'Nguyễn Văn Long','1/1/1996',N'Nam',N'Công Nghệ Thông Tin','14520001@gm.uit.edu.vn','123456789'),
	   ('14520002',N'Nguyễn Thị Giang', '1/8/1996',N'Nữ',N'Công Nghệ Thông Tin','14520002@gm.uit.edu.vn','987654321'),
	   ('14520003',N'Nguyễn Huyền Trân','1/5/1996', N'Nữ',N'Công Nghệ Thông Tin','14520003@gm.uit.edu.vn','123459876')
go

--INSERT INTO GIANGVIEN
insert into TBL_GIANGVIEN
(MaGV,HoTenGV, Phai, MaChucDanh,SDT, Email, SoDARa, SoDACham)
values ('2001',N'Trần Ngọc Dung',N'Nữ', 'LT','0123456789','dungtn@uit.edu.vn',3,1),
	   ('2002',N'Cao Thị Na',N'Nữ', 'PTTK','0123456788','nuct@uit.edu.vn',2,1),
	   ('2003',N'Nguyễn Văn Năm',N'Nam', 'TEST','0123456787','namnv@uit.edu.vn',3,1)
go

--INSERT INTO DETAI
SET DATEFORMAT DMY;
insert into TBL_DETAI
(MaDeTai, LoaiDeTai, TenDeTai, NgayRaDT, FK_MaGV)
values ('NL01',N'Niên Luận 1',N'Lập trình chuyên ngành','11/7/2012','2002'),
	   ('NL02',N'Niên Luận 2',N'Lập trình quản lý','10/6/2002','2001'),
	   ('NL03',N'Niên Luận 3',N'Lập trình ứng dụng','8/7/2002','2003'),
	   ('TL01',N'Tiểu luận tốt nghiệp',N'Xây dựng hệ thống mạng xã hội trường học','9/9/2002','2003'),
	   ('TL02',N'Tiểu luận tốt nghiệp',N'Nghiên cứu các bộ công cụ đánh giá website','16/9/2002','2003'),
	   ('LV01',N'Luận văn tốt nghiệp',N'Phân tích và thiết kế hệ thống quản lý cho vay ngân hàng Agribank Mỹ Đức','10/4/2002','2001'),
	   ('LV02',N'Luận văn tốt nghiệp',N'Phân tích và thiết kế hệ thống quản lý tiền gửi tiết kiệm','11/4/2002','2001'),
	   ('TL03',N'Tiểu luận tốt nghiệp',N'Nghiên cứu các bộ công cụ đánh giá website','16/9/2002','2002')
go

--INSERT INTO BOMON
insert into TBL_BOMON
(MaChucVu, ChucVu, TenCanBo)
values ('1001',N'Trưởng bộ môn',N'Lê Hồng Đức'),
	   ('1002',N'Phó bộ môn',N'Nguyễn Ngọc Nga'),
	   ('1003',N'Cán bộ trực thuộc',N'Trần Văn Nghĩa')
go

--INSERT INTO PHIEUDANGKI
insert into TBL_PHIEUDANGKY
(MaPhieuDK, NgayDK, FK_MaDeTai, FK_MSSV)
values ('001','11/07/2003','NL01','14520001'),
	   ('002','10/06/2003','NL02','14520002'),
	   ('003','10/09/2003','TL02','14520003')
go


insert into TBL_QUYENDOAN
( MaQuyenDA, NgayNop, DiemDA, NhanXet, FK_MaPhieuDK)
values ('11','11/6/2015', '8', N'Tốt','001'),
		('22','12/7/2016', '7', N'Khá','002'),
		('33','15/9/2016', '5', N'Trung bình','003')
go