-- 코드를 입력하세요
SELECT
    SUBSTRING(PRODUCT_CODE, 1, 2) AS CATEGORY,
    COUNT(*) AS PRODUCTS
FROM
    PRODUCT
GROUP BY
    SUBSTRING(PRODUCT_CODE, 1, 2)
ORDER BY
    CATEGORY ASC;