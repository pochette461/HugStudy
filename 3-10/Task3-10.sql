-- 1. Staffテーブルから「経理部」に所属する社員の情報をすべて抽出してください。
SELECT *
FROM Staff
WHERE Section = '経理部'

-- 2. 在庫(Stocksテーブル)の在庫数(Quantity)が10以上25未満のものを抽出して下さい。
SELECT *
FROM Stocks
WHERE Quantity >= 10 and Quantity < 25;

-- 3. INTERSECT演算子を使用して、Order_Headerテーブルで合計値(Total)が5000以上10000未満のものを抽出して下さい。
SELECT *
FROM Order_Header
WHERE Total >= 5000
INTERSECT
SELECT *
FROM Order_Header
WHERE Total < 10000;


-- 4. 「関東」エリアの全店舗情報を抽出して下さい。
SELECT *
FROM Shop
JOIN Area
ON Area.Areacode = Shop.Areacode
WHERE Area.Areaname = '関東';


-- 5. 在庫(Stocksテーブル)内の各商品の合計数量を抽出して下さい。
SELECT Stocks.goodscode, Goods.goodsname, SUM(Stocks.quantity) 
FROM Stocks
JOIN Goods
ON Goods.goodscode = Stocks.goodscode
GROUP BY Stocks.goodscode, Goods.goodsname
ORDER BY Stocks.goodscode;

-- 6. 商品（Gods）テーブルから単価（UnitPrice)が5000円より高い商品の情報を全て抽出して下さい。
SELECT *
FROM Goods
WHERE Unitprice > 5000;

-- 7. Shopテーブルの全ての店舗コード（Shopcode）、店舗名（Shopname）を、所在地（areaname）とあわせて抽出してください。
SELECT Shop.shopcode, Shop.shopname, Area.Areaname
FROM Shop
JOIN Area
ON Area.areacode = Shop.areacode;

-- 8. 「新宿」店の在庫数が10以上の商品の商品コード（GoodsCode）、商品名（GoodsName）、在庫数（quantity）を抽出して下さい。
SELECT Stocks.goodscode, Goods.goodsname, Stocks.quantity
FROM Stocks
JOIN Shop
ON Shop.shopcode = Stocks.shopcode
JOIN Goods
ON Goods.goodscode = Stocks.goodscode
WHERE Shop.shopname = '新宿' and Stocks.quantity >= 10	