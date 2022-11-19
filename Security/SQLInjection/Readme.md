SQL INJECTION
Attack:

- This attack is mainly found in web pages that take user input to query the data from database.

- In general, these input fields serve as the gateway to the SQL Injection attack. When no input validation is done on the user input, the entered values can retrive whole information from the database

- This attack is mostly found in applications that take unvalidated user input and use string concatenation to query the database

- In general statements like 1or2>1 and 2>1-- can be used to retrive all the records from the database as these statements are true everytime and comments are used to remove any extra data.

- For example it may form a query to databse: select * from database where 1 or 2>1 resulting all the records.
Remedies:

- Using user input validation

- Using prepared statements instead of string concatenation

- Encypting user data in database so that even the SQL Injection occurs the attacker cannot decrypt the entire data.
