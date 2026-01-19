--Get all salesman ids without any repeated values
SELECT DISTINCT salesman_id FROM ORDERS;

--Display the order number ordered by date in ascending order
SELECT ORDER_NO, order_date FROM ORDERS ORDER BY order_date ASC;

--Display the order number ordered by purchase amount in descending order
SELECT ORDER_NO, purchase_amount FROM ORDERS ORDER BY purchase_amount DESC;

--Display the full data of orders that have purchase amount less than 500.
SELECT * FROM ORDERS WHERE purchase_amount < '500';

--Display the full data of orders that have purchase amount between 1000 and 2000.
SELECT * FROM ORDERS WHERE purchase_amount BETWEEN 1000 AND 2000;
