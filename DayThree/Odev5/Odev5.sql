--SELECT : Veritaban�ndan veri �ekmek i�in kullan�l�r.
SELECT * FROM Customers
SELECT * FROM Categories
--Bir tablodan sadece baz� yerleri almak istiyorsak;
SELECT ContactName,CompanyName,City FROM Customers
--Tablodaki kolonlar�n isimlerini kendimiz vermek istersek;
SELECT ContactName Adi,CompanyName SirketAdi,City Sehir FROM Customers

--WHERE : Belirli bir ko�ula dayal� olarak sorguda kay�tlar� filtrelemek i�in kullan�l�r.
SELECT * FROM Customers WHERE City = 'London'
SELECT * FROM Products WHERE categoryId = 1
SELECT * FROM Products WHERE categoryId = 1 OR categoryId = 3
SELECT * FROM Products WHERE categoryId = 1 AND UnitPrice >= 10

--ORDER BY : Bir sorgunun sonu� k�mesini belirli s�tunlara g�re artan veya azalan s�rayla s�ralamak i�in kullan�l�r.
SELECT * FROM Products ORDER BY ProductName
SELECT * FROM Products ORDER BY CategoryID,ProductName
--ASC : Artan(K���kten b�y��e), DESC : Azalan (B�y�kten k����e)
SELECT * FROM Products ORDER BY UnitPrice ASC
SELECT * FROM Products ORDER BY UnitPrice DESC
SELECT * FROM Products WHERE categoryId = 1 ORDER BY UnitPrice DESC

--COUNT : Bir sorguda belirli bir ko�ulu sa�layan sat�rlar�n say�s�n� d�nd�rmek veya bir tablodaki t�m sat�rlar� saymak i�in kullan�l�r.
SELECT COUNT(*) FROM Products
SELECT COUNT(*) Adet FROM Products WHERE CategoryID = 2

 --GROUP BY : Belirtilen s�tunlarda ayn� de�ere sahip olan sat�rlar� gruplamak i�in kullan�l�r.
 SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID

 --HAVING : GROUP BY ifadesiyle birlikte kullan�larak bir sorgunun sonu�lar�n�, toplu verilere uygulanan ko�ullara g�re filtrelemek i�in kullan�l�r.
 SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID HAVING COUNT(*) < 10
 SELECT CategoryID, COUNT(*) FROM Products WHERE UnitPrice > 20 GROUP BY CategoryID HAVING COUNT(*) < 10

 --INNER JOIN : 
 SELECT * FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
 SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
 SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName FROM Products INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID WHERE Products.UnitPrice > 10
 SELECT * FROM Products p INNER JOIN [Order Details] od ON p.ProductID = od.ProductID

 --LEFT JOIN : 
 SELECT * FROM Products p LEFT JOIN [Order Details] od ON p.ProductID = od.ProductID
 SELECT * FROM Customers c LEFT JOIN Orders o ON c.CustomerID = o.CustomerID

 --IS NULL :
 SELECT * FROM Customers c LEFT JOIN Orders o ON c.CustomerID = o.CustomerID WHERE o.CustomerID IS NULL
 SELECT * FROM Customers c RIGHT JOIN Orders o ON c.CustomerID = o.CustomerID WHERE o.CustomerID IS NULL
