-- 코드를 입력하세요
SELECT A.CATEGORY AS CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A
JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
WHERE B.SALES_DATE LIKE '2022-01-%'
GROUP BY A.CATEGORY
ORDER BY CATEGORY