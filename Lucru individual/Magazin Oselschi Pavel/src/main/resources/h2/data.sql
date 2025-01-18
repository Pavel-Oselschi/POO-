INSERT INTO category (name, description) VALUES
                                             ('Electronics', 'Electronic devices and components'),
                                             ('Furniture', 'Office and home furniture'),
                                             ('Tools', 'Hand and power tools'),
                                             ('Clothing', 'Apparel and accessories'),
                                             ('Books', 'Various genres of books');

INSERT INTO location (name, aisle, shelf) VALUES
                                              ('Zone A', 'A1', 'S1'),
                                              ('Zone B', 'B1', 'S1'),
                                              ('Zone C', 'C1', 'S1'),
                                              ('Zone D', 'D1', 'S1'),
                                              ('Zone E', 'E1', 'S1'),
                                              ('Zone F', 'F1', 'S1'),
                                              ('Zone G', 'G1', 'S1'),
                                              ('Zone H', 'H1', 'S1'),
                                              ('Zone I', 'I1', 'S1'),
                                              ('Zone J', 'J1', 'S1');

INSERT INTO product (name, description, price, quantity, category_id, location_id) VALUES
                                                                                       ('Laptop', 'High performance laptop', 1200.00, 50, 1, 1),
                                                                                       ('Smartphone', 'Latest model smartphone', 800.00, 30, 1, 2),
                                                                                       ('Headphones', 'Noise-cancelling headphones', 150.00, 40, 1, 3),
                                                                                       ('Office Chair', 'Ergonomic office chair', 250.00, 20, 2, 4),
                                                                                       ('Desk', 'Adjustable standing desk', 400.00, 15, 2, 5),
                                                                                       ('Hammer', 'Heavy-duty hammer', 25.00, 100, 3, 6),
                                                                                       ('Screwdriver', 'Set of screwdrivers', 30.00, 80, 3, 7),
                                                                                       ('T-shirt', 'Cotton t-shirt', 15.00, 200, 4, 8),
                                                                                       ('Jeans', 'Blue denim jeans', 45.00, 150, 4, 9),
                                                                                       ('Fiction Book', 'Bestselling fiction novel', 20.00, 50, 5, 10),
                                                                                       ('Non-fiction Book', 'Inspirational non-fiction', 22.00, 75, 5, 1),
                                                                                       ('Gaming Mouse', 'RGB gaming mouse', 40.00, 100, 1, 2),
                                                                                       ('Wireless Keyboard', 'Mechanical wireless keyboard', 70.00, 90, 1, 3),
                                                                                       ('Portable Speaker', 'Bluetooth portable speaker', 60.00, 120, 1, 4),
                                                                                       ('Task Lamp', 'LED desk lamp', 30.00, 70, 2, 5),
                                                                                       ('Bookcase', 'Wooden bookcase', 150.00, 40, 2, 6),
                                                                                       ('Wrench Set', 'Multi-size wrench set', 45.00, 60, 3, 7),
                                                                                       ('Drill', 'Cordless drill', 100.00, 50, 3, 8),
                                                                                       ('Sweater', 'Wool sweater', 40.00, 60, 4, 9),
                                                                                       ('Jacket', 'Leather jacket', 120.00, 30, 4, 10),
                                                                                       ('Cookbook', 'Collection of recipes', 25.00, 80, 5, 1),
                                                                                       ('Biography', 'Famous person biography', 30.00, 90, 5, 2),
                                                                                       ('Tablet', 'Android tablet', 300.00, 60, 1, 3),
                                                                                       ('Smartwatch', 'Fitness tracking smartwatch', 200.00, 70, 1, 4),
                                                                                       ('Flash Drive', '64GB USB flash drive', 15.00, 150, 1, 5),
                                                                                       ('Coffee Maker', 'Automatic coffee maker', 100.00, 80, 2, 6),
                                                                                       ('Microwave', 'Compact microwave oven', 90.00, 60, 2, 7),
                                                                                       ('Electric Drill', 'Corded electric drill', 110.00, 50, 3, 8),
                                                                                       ('Tool Box', 'Sturdy tool box', 35.00, 100, 3, 9),
                                                                                       ('Sweatpants', 'Comfortable sweatpants', 30.00, 120, 4, 10);

INSERT INTO inventory (product_id, quantity_change, type, timestamp, notes) VALUES
                                                                                (1, 50, 'IN', '2024-11-24 08:00:00', 'Initial stock for Laptop'),
                                                                                (2, 10, 'OUT', '2024-11-24 09:00:00', 'Sold 10 Smartphones'),
                                                                                (3, 20, 'IN', '2024-11-24 10:00:00', 'Restocked Headphones'),
                                                                                (4, 5, 'OUT', '2024-11-24 11:00:00', 'Returned 5 defective Office Chairs');
