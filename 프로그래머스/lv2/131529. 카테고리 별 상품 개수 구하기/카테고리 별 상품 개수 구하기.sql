-- 코드를 입력하세요
SELECT SUBSTRING(PRODUCT_CODE, 1, 2) AS CATEGORY,
COUNT(PRODUCT_CODE) AS PRODUCT
FROM PRODUCT
GROUP BY SUBSTRING(PRODUCT_CODE, 1, 2);