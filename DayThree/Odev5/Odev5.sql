--SELECT : Veritabanýndan veri çekmek için kullanýlýr.
SELECT * FROM Customers
SELECT * FROM Categories
--Bir tablodan sadece bazý yerleri almak istiyorsak;
SELECT ContactName,CompanyName,City FROM Customers
--Tablodaki kolonlarýn isimlerini kendimiz vermek istersek;
SELECT ContactName Adi,CompanyName SirketAdi,City Sehir FROM Customers

--WHERE : Belirli bir koþula dayalý olarak sorguda kayýtlarý filtrelemek için kullanýlýr.
SELECT * FROM Customers WHERE City = 'London'
SELECT * FROM Products WHERE categoryId = 1
SELECT * FROM Products WHERE categoryId = 1 OR categoryId = 3
SELECT * FROM Products WHERE categoryId = 1 AND UnitPrice >= 10

--ORDER BY : Bir sorgunun sonuç kümesini belirli sütunlara göre artan veya azalan sýrayla sýralamak için kullanýlýr.
SELECT * FROM Products ORDER BY ProductName
SELECT * FROM Products ORDER BY CategoryID,ProductName
--ASC : Artan(Küçükten büyüðe), DESC : Azalan (Büyükten küçüðe)
SELECT * FROM Products ORDER BY UnitPrice ASC
SELECT * FROM Products ORDER BY UnitPrice DESC
SELECT * FROM Products WHERE categoryId = 1 ORDER BY UnitPrice DESC

--COUNT : Bir sorguda belirli bir koþulu saðlayan satýrlarýn sayýsýný döndürmek veya bir tablodaki tüm satýrlarý saymak için kullanýlýr.
SELECT COUNT(*) FROM Products
SELECT COUNT(*) Adet FROM Products WHERE CategoryID = 2

 --GROUP BY : Belirtilen sütunlarda ayný deðere sahip olan satýrlarý gruplamak için kullanýlýr.
 SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID

 --HAVING : GROUP BY ifadesiyle birlikte kullanýlarak bir sorgunun sonuçlarýný, toplu verilere uygulanan koþullara göre filtrelemek için kullanýlýr.
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
