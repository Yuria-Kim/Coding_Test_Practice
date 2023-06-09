-- 코드를 입력하세요
SELECT MCDP_CD AS '진료과 코드', COUNT(PT_NO) AS '5월 예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%m') = '05'
GROUP BY MCDP_CD
ORDER BY COUNT(PT_NO), MCDP_CD;