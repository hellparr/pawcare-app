CREATE TABLE `user`(
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `last_name` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `phone` VARCHAR(255) NOT NULL,
    `site` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `user` ADD UNIQUE `user_email_unique`(`email`);
ALTER TABLE
    `user` ADD UNIQUE `user_phone_unique`(`phone`);
CREATE TABLE `pets`(
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `date` DATE NOT NULL,
    `type` VARCHAR(255) NOT NULL,
    `race` VARCHAR(255) NOT NULL,
    `primary_colour` VARCHAR(255) NOT NULL,
    `second_colour` VARCHAR(255) NOT NULL,
    `id_user` BIGINT NOT NULL
);
CREATE TABLE `veterinarian`(
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `last_name` VARCHAR(255) NOT NULL,
    `username` VARCHAR(255) NOT NULL,
    `site` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `personal_phone` VARCHAR(255) NOT NULL,
    `work_phone` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `veterinarian` ADD UNIQUE `veterinarian_username_unique`(`username`);
ALTER TABLE
    `veterinarian` ADD UNIQUE `veterinarian_email_unique`(`email`);
ALTER TABLE
    `veterinarian` ADD UNIQUE `veterinarian_personal_phone_unique`(`personal_phone`);
ALTER TABLE
    `pets` ADD CONSTRAINT `pets_id_user_foreign` FOREIGN KEY(`id_user`) REFERENCES `user`(`id`);