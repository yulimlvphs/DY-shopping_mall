<사용하는 테이블의 sql문을 이곳에 작성합니다.>

# 스키마의 이름 = shopping_mall

# Member 테이블의 sql문입니다.
CREATE TABLE `shpping_mall`.`member` (
                                         `num_id` INT NOT NULL AUTO_INCREMENT,
                                         `member_id` VARCHAR(45) NULL,
                                         `member_pw` VARCHAR(45) NULL,
                                         `member_name` VARCHAR(45) NULL,
                                         `member_phone` VARCHAR(45) NULL,
                                         `member_email` VARCHAR(45) NULL,
                                         PRIMARY KEY (`num_id`));