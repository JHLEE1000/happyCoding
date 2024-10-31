-- 코드를 입력하세요
SELECT 
    ANIMAL_TYPE, COUNT(*) AS count
FROM 
    ANIMAL_INS
WHERE
    ANIMAL_TYPE IN ('Cat', 'Dog')
GROUP BY 
    ANIMAL_TYPE
ORDER BY
    FIELD(ANIMAL_TYPE, 'Cat', 'Dog');