    create table Cryptid_Park (
	parkid INT,
	name VARCHAR(50)
);
insert into Cryptid_Park (parkid, name) values (1, 'Black-crowned night heron');

create table Cryptid_Biome (
	biomeId INT,
	name VARCHAR(50),
	foliage VARCHAR(50)
);
insert into Cryptid_Biome (biomeId, name, foliage) values (1, 'Eagle, white-bellied sea', null);
insert into Cryptid_Biome (biomeId, name, foliage) values (2, 'Raccoon, common', null);
insert into Cryptid_Biome (biomeId, name, foliage) values (3, 'Marshbird, brown and yellow', null);
insert into Cryptid_Biome (biomeId, name, foliage) values (4, 'Weaver, lesser masked', null);

create table CRYPTID_CRYPTIDS (
	CryptidId INT,
	NAME VARCHAR(50),
	DIET VARCHAR(50),
	AVG_1WEIGHT INT,
	CLASS VARCHAR(50)
);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (1, 'Herrick', null, 218, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (2, 'Sena', null, 402, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (3, 'Sholom', null, 379, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (4, 'Rosa', null, 462, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (5, 'Cobb', null, 322, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (6, 'Mickie', null, 488, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (7, 'Lily', null, 347, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (8, 'Shae', null, 164, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (9, 'Ira', null, 212, null);
insert into CRYPTID_CRYPTIDS (CryptidId, NAME, DIET, AVG_1WEIGHT, CLASS) values (10, 'Bartlet', null, 332, null);

commit;

SELECT * FROM CRYPTID_CRYPTIDS;

alter table cryptid_cryptids add BIOMEID integer;

ALTER TABLE CRYPTID_BIOME
ADD PRIMARY KEY(BIOMEID);

alter table cryptid_cryptids
add constraint FK_CRYPTID
FOREIGN KEY (BIOMEID) REFERENCES CRYPTID_BIOME(BIOMEID) ON DELETE CASCADE;

ALTER TABLE CRYPTID_CRYPTIDS
DROP CONSTRAINT FK_CRYPTID;