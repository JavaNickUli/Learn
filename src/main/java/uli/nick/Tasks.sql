    --Задачи. День 1:
    
--1    Покажите  фамилию и имя клиентов из города Прага.

SELECT LastName,
       FirstName,
       City
  FROM customers
 WHERE City = 'Prague';
 
--2.1    Покажите  фамилию и имя клиентов у которых имя начинается букву M.

SELECT LastName,
       FirstName
  FROM customers
 WHERE FirstName LIKE 'M%';
 
--2.2    Покажите  фамилию и имя клиентов у которых имя содержит символ "ch".

SELECT LastName,
       FirstName
  FROM customers
 WHERE FirstName LIKE '%ch%';
 
--3    Покажите название и размер музыкальных треков в Мегабайтах.

SELECT Name,
       printf('%.2f', Bytes / 1048576.0) AS [Size(Mb)]
  FROM tracks;
  
--4    Покажите  фамилию и имя сотрудников кампании нанятых в 2002 году из города Калгари.

SELECT LastName,
       FirstName,
       strftime('%Y', HireDate) AS HireYear,
       City
  FROM employees
 WHERE strftime('%Y', HireDate) = '2002' AND 
       City = 'Calgary';
       
--5    Покажите  фамилию и имя сотрудников кампании нанятых в возрасте 40 лет и выше.

SELECT LastName,
       FirstName,
       date(BirthDate) AS BirthDate,
       date(HireDate) AS HireDate,
       HireDate - BirthDate AS HireAge
  FROM employees
 WHERE HireAge >= 40;
 
--6    Покажите покупателей-амерканцев без факса.

SELECT LastName,
       FirstName,
       Country,
       Fax
  FROM customers
 WHERE Country = 'USA' AND 
       Fax IS NULL;
       
--7    Покажите канадские города в которые сделаны продажи в августе и сентябре месяце.

SELECT ShipCountry,
       ShipCity,
       date(SalesDate) AS SalesDate
  FROM sales
 WHERE ShipCountry = 'Canada' AND 
       strftime('%m', SalesDate) BETWEEN '08' AND '09';
       
--8    Покажите  почтовые адреса клиентов из домена gmail.com.

SELECT LastName,
       FirstName,
       Email
  FROM customers
 WHERE Email LIKE '%@gmail.com';
 
--9    Покажите сотрудников  которые работают в кампании уже 18 лет и более.

SELECT LastName,
       FirstName,
       date(HireDate) AS HireDate,
       date('now') - date(HireDate) AS Experience
  FROM employees
 WHERE Experience >= 18;
 
--10    Покажите  в алфавитном порядке все должности в кампании.

SELECT DISTINCT Title
  FROM employees
 ORDER BY Title;
 
--11    Покажите  в алфавитном порядке фамилию, имя и год рождения покупателей.

SELECT LastName,
       FirstName,
       Age,
       date('now') - strftime(Age) AS BirthYear
  FROM customers;
  
--12, 13    Покажите название и длительность в секундах самой короткой песни.

SELECT Name,
       Milliseconds / 1000 AS Seconds
  FROM tracks
 ORDER BY Seconds
 LIMIT 1;
 
--14    Покажите средний возраст клиента для каждой страны.

SELECT Country,
       avg(Age) AS AverageAge
  FROM customers
 GROUP BY Country;
 
--15    Покафите фамилии работников нанятых в октябре.

SELECT LastName,
       date(HireDate) AS HireDate
  FROM employees
 WHERE strftime('%m', HireDate) = '10';
 
--16    Покажите фамилию самого старого по стажу сотрудника в кампании.

SELECT LastName,
       date(HireDate) AS HireDate
  FROM employees
 ORDER BY HireDate
 LIMIT 1;

--Приношу извинения. Был занят, но первое задание успел написать. Решал в торопях за два часа - мог накосячить, плюс SQL с нуля.