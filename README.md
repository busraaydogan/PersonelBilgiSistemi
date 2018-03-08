# PersonelBilgiSistemi
İnternet Programcılığı Projesi

Güncelleme : 08.03.2018 - 10:18

Tablolar güncellendi. Bu kodları çalıştırarak değişiklikleri uygunlayınız.

ALTER TABLE `userperms`
	ALTER `UserIdNum` DROP DEFAULT;
ALTER TABLE `userperms`
	CHANGE COLUMN `UserIdNum` `UserTypeId` INT(11) NOT NULL AFTER `PermissionId`;
	
ALTER TABLE UserPerms ADD CONSTRAINT UserPerms_fk0 FOREIGN KEY (PermissionId) REFERENCES Perms(PermId) ON DELETE CASCADE;

ALTER TABLE UserPerms ADD CONSTRAINT UserPerms_fk1 FOREIGN KEY (UserTypeId) REFERENCES UserTypes(UserTypeId) ON DELETE CASCADE;
