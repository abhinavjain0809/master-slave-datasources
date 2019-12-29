-- For master DB
CREATE DATABASE IF NOT EXISTS spring_boot_tutorials;
USE spring_boot_tutorials;
DROP TABLE IF EXISTS books;
CREATE TABLE `books` ( `id` bigint(20) NOT NULL AUTO_INCREMENT, `author_name` varchar(255) DEFAULT NULL, `created_at` datetime DEFAULT NULL, `genre` varchar(255) DEFAULT NULL, `name` varchar(255) DEFAULT NULL, `price` double DEFAULT NULL, `rating` int(11) DEFAULT NULL, `updated_at` datetime DEFAULT NULL, PRIMARY KEY (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- For slave DB
CREATE DATABASE IF NOT EXISTS test;
USE test;
DROP TABLE IF EXISTS books;
CREATE TABLE `books` ( `id` bigint(20) NOT NULL AUTO_INCREMENT, `author_name` varchar(255) DEFAULT NULL, `created_at` datetime DEFAULT NULL, `genre` varchar(255) DEFAULT NULL, `name` varchar(255) DEFAULT NULL, `price` double DEFAULT NULL, `rating` int(11) DEFAULT NULL, `updated_at` datetime DEFAULT NULL, PRIMARY KEY (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- User creation
-- Read write user
DROP user IF EXISTS rw_user;
CREATE USER 'rw_user'@'%' IDENTIFIED BY 'rw_password';
GRANT SELECT, INSERT, UPDATE, DELETE, DROP on *.* TO 'rw_user'@'%' IDENTIFIED BY 'rw_password';
FLUSH PRIVILEGES;

-- Read only user
DROP user IF EXISTS ro_user;
CREATE USER 'ro_user'@'%' IDENTIFIED BY 'ro_password';
GRANT SELECT on *.* TO 'ro_user'@'%' IDENTIFIED BY 'ro_password';
FLUSH PRIVILEGES;
