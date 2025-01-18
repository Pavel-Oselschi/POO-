DROP TABLE category IF EXISTS;
DROP TABLE location IF EXISTS;
DROP TABLE product IF EXISTS;
DROP TABLE inventory IF EXISTS;

CREATE TABLE category (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          description TEXT
);

CREATE TABLE location (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          aisle VARCHAR(50),
                          shelf VARCHAR(50)
);

CREATE TABLE product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description TEXT,
                         price DECIMAL(10,2),
                         quantity INTEGER,
                         category_id BIGINT,
                         location_id BIGINT,
                         FOREIGN KEY (category_id) REFERENCES category(id),
                         FOREIGN KEY (location_id) REFERENCES location(id)
);

CREATE TABLE inventory (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           product_id BIGINT,
                           quantity_change INTEGER,
                           type VARCHAR(10),
                           timestamp TIMESTAMP,
                           notes TEXT,
                           FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE
);