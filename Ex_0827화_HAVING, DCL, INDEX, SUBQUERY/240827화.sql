-------------------------------------------- 240827화 -----------------------------------------------------

-- 사번이 120번인 사원이 입사후 3년 6개월 뒤 진급예정이다.
-- 이름, 진급날짜를 조회하세요.
SELECT * FROM EMPLOYEES;
SELECT FIRST_NAME, HIRE_DATE FROM EMPLOYEES;

-- 모든 사원들이 입사일로부터 오늘까지 몇개월이 경과했는지 출력
SELECT FIRST_NAME, ADD_MONTHS(HIRE_DATE, 42) FROM EMPLOYEES; 

-- 모든 사원들이 입사일로부터 오늘까지 몇개월이 경과했는지 이름, 개월수 출력
SELECT FIRST_NAME, MONTHS_BETWEEN(SYSDATE, HIRE_DATE) FROM EMPLOYEES; 

-- 사원들의 이름, 입사일, 입사후 오늘까지의 개월수를 조회하되, 입사기간이 200개월이상인
-- 사람만 출력하고 개월수는 소수점 이하 한자리까지만 버림하세요.
SELECT FIRST_NAME, HIRE_DATE, TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE), 1)
FROM EMPLOYEES
WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE), 1) >= 200;

-- 형변환 함수
-- TO_CHAR()
-- 날짜를 형식에 맞춰 문자열로 변환
SELECT TO_CHAR(SYSDATE, 'yyyy-mm-dd'),
	   TO_CHAR(SYSDATE, 'yyyy-mm-dd day'),
	   TO_CHAR(SYSDATE, 'yyyy-mm-dd HH:MI:SS')
FROM DUAL;

-- 날짜 포맷형식
-- SCC, CC : 세기
-- YYYY, YY : 년도
-- MM : 월
-- DD : 일
-- DAY : 요일
-- MON : 월명(JAN, ...)
-- MONTH : 월명(JANUARY, ...)
-- HH, HH24 : 시간
-- MI : 분
-- SS : 초

-- 숫자 포맷
-- 0 : 숫자, 공백시 0으로 채움
-- 9 : 숫자
-- , : 쉼표 표시
-- L : 지역 통화

SELECT TO_CHAR(1234567, '9,999,999') FROM DUAL; -- '9,999,999' -> 숫자의 의미가 있는것이 아니라 숫자 자릿수 포맷이다.
SELECT TO_CHAR(1234567, 'L9,999,999') FROM DUAL; -- L을 붙이면 달러표시
SELECT TO_CHAR(12, '0999') FROM DUAL;

-- TO_DATE()
SELECT TO_DATE('2024.08.27') FROM DUAL;
SELECT TO_DATE('08.27.2024', 'MM,DD,YYYY') FROM DUAL;
SELECT TO_DATE('2024.08', 'YYYY.MM') FROM DUAL; -- 'YYYY.MM -> .대신 ,를 써도 된다.'
-- 일을 입력하지 않으면 1일로 자동으로 나온다.
SELECT TO_DATE('11', 'DD') FROM DUAL;
-- 일만 입력하면 해당년도, 해당월로 나온다.

-- NULL 처리함수
-- NULL값을 다른값으로 변경

-- NVL()
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, COMMISSION_PCT FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

-- NVL2()
-- NULL일 때 치환할 값, NULL이 아닐 때 치환할 값
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, NVL2(COMMISSION_PCT, 1, 0)
FROM EMPLOYEES;

-- 순위를 매겨주는 함수
-- RANK() OVER() -> 이게 한 묶음
-- 그룹 내 순위를 계산하여 NUMBER타입으로 순위를 반환
SELECT RANK() OVER(ORDER BY SALARY DESC), FIRST_NAME, SALARY
FROM EMPLOYEES;

-- DENSE_RANK()
SELECT DENSE_RANK() OVER(ORDER BY SALARY DESC), FIRST_NAME, SALARY
FROM EMPLOYEES;

-- 집계함수
-- 여러 행들에 대한 연산 결과를 하나의 행으로 반환
-- 집계함수는 null을 체크하지 않는다.
-- 평균을 구할 때 내가 원하는 값과는 다른 결과 나올 수 있다.

-- COUNT()
-- 행의 개수를 세서 반환
SELECT COUNT(*) FROM EMPLOYEES;

-- MIN()
-- 최수값 구하기
SELECT MIN(SALARY) FROM EMPLOYEES;

-- MAX()
-- 최대값 구하기
SELECT MAX(SALARY) FROM EMPLOYEES e ;

-- AVG()
SELECT AVG(SALARY) FROM EMPLOYEES e ;

-- SUM()
-- 총합구하기
SELECT SUM(SALARY) FROM EMPLOYEES e ;

-- 사원테이블에서 보너스를 받는 사원의 수를 조회
SELECT COUNT(*) FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

SELECT COUNT(COMMISSION_PCT) FROM EMPLOYEES;

-- 사원테이블에서 직종이 'SA_REP'인 사원들의 
-- 평균급여, 최고급여, 최저급여, 급여의 총합을 조회하세요.
SELECT * FROM EMPLOYEES e ;
SELECT AVG(SALARY), MAX(SALARY), MIN(SALARY), SUM(SALARY) FROM EMPLOYEES
WHERE JOB_ID = 'SA_REP';

-- 사원테이블에서 부서의 개수를 출력하세요.
SELECT COUNT(DISTINCT DEPARTMENT_ID) FROM DEPARTMENTS;

-- 부서번호가 80번인 사원들의 평균급여를 소수점 둘째자리에서 반올림하세요.
SELECT AVG(SALARY) FROM EMPLOYEES
WHERE DEPARTMENT_ID = 80;

-- GROUP BY(그룹화)
-- 특정 테이블에서 소그룹을 만들어 결과를 분산시켜 얻고자 할 때
-- GROUP BY : ~별(예 : 부서별 인원수)

-- 각 부서별 급여의 평균과 총합을 출력
SELECT AVG(SALARY) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- 부서별, 직종별로 그룹을 나눠 인원수를 출력하되, 부서번호가 낮은순으로 정렬하세요.
SELECT DEPARTMENT_ID, JOB_ID, COUNT(*) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID, JOB_ID;

-- 각 직종별 인원수 출력
SELECT DEPARTMENT_ID, COUNT(*) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- 각 직종별 급여의 합 출력
SELECT JOB_ID, SUM(SALARY) FROM EMPLOYEES
GROUP BY JOB_ID;

-- 부서별로 가장 높은 급여 조회
SELECT DEPARTMENT_ID, MAX(SALARY) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- 부서별 급여의 합계를 내림차순으로 조회
SELECT DEPARTMENT_ID, SUM(SALARY) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY SUM(SALARY) DESC;

-- 그룹함수
CREATE TABLE 월별매출(
상품ID VARCHAR2(5),
월 VARCHAR2(10),
회사 VARCHAR2(10),
매출액 INTEGER);

INSERT INTO 월별매출 VALUES ('P001', '2019.10', '삼성', 15000);
INSERT INTO 월별매출 VALUES ('P001', '2019.10', '삼성', 15000);
INSERT INTO 월별매출 VALUES ('P001', '2019.10', 'LG', 15000);
INSERT INTO 월별매출 VALUES ('P001', '2019.10', 'LG', 15000);
INSERT INTO 월별매출 VALUES ('P001', '2019.10', '애플', 15000);
INSERT INTO 월별매출 VALUES ('P001', '2019.10', '애플', 15000);

SELECT * FROM 월별매출;

-- ROLLUP()
-- 소그룹간의 합계를 계산하는 함수
SELECT 상품ID, 월, SUM(매출액) FROM 월별매출
GROUP BY ROLLUP(상품ID, 월, 회사);

-- CUBE()
-- 항복들 간의 다차원적인 소계
-- GROUP BY 절에 명시한 모든 컬럼에 대해 소그룹 합계를 계산해준다.
SELECT 상품ID, 월, SUM(매출액)
FROM 월별매출
GROUP BY CUBE(상품ID, 월);

-- GROUPING SETS
-- 특정 항목에 대한 소계를 내는 함수
SELECT 상품ID, 월, SUM(매출액)
FROM 월별매출
GROUP BY GROUPING SETS(상품ID, 월);

-- 각 부서의 최대급여, 최소급여, 인원수를 출력하되, 급여의 합이 8000이상인
-- 결과만 조회할것
SELECT MAX(SALARY), MIN(SALARY), COUNT(*) FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
-- WHERE SUM(SALARY) >= 8000; -> 에러 :
HAVING(SUM(SALARY) >= 8000);

-- 각 부서별 인원수가 20명 이상인 부서의 정보를 부서번호, 급여의 합, 급여의 평균,
-- 인원수 순으로 출력, 급여의 평균은 소수점 둘째자리에서 반올림
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY), 1), COUNT(*) 
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING COUNT(*) >= 20;

-- 부서별, 직종별로 그룹화 하여 결과를 부서번호, 직종, 인원수 순으로 출력하되,
-- 직종이 'MAN'으로 끝나는 경우에만 조회하세요.
SELECT DEPARTMENT_ID, JOB_ID, COUNT(*)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID, JOB_ID
HAVING JOB_ID LIKE '%MAN'; -- GROUP BY를 해서 조건을 먹임
-- 또는
--SELECT DEPARTMENT_ID, JOB_ID, COUNT(*)
--FROM EMPLOYEES
--WHERE JOB_ID LIKE '%MAN'; -- GROUP BY를 하지 않고 조건을 먹임

-- 각 부서별 평균 급여를 소수점 한자리까지 버림으로 조회하되,
-- 평균 급여가 10000미만인 그룹만 조회해야 하며
-- 부서번호가 50번 이하인 부서만 조회
SELECT DEPARTMENT_ID, TRUNC(AVG(SALARY), 1)
FROM EMPLOYEES
WHERE DEPARTMENT_ID <= 50
GROUP BY DEPARTMENT_ID
HAVING TRUNC(AVG(SALARY), 1) < 10000;

-- 각 부서별(GROUP BY) 부서번호, 급여의 합, 평균, 인원수 순으로 출력하되,
-- 급여의 합이 30000이상인 경우에만 출력해야 하며
-- 급여의 평균은 소수점 둘째자리에서 반올림하기
SELECT DEPARTMENT_ID, SUM(SALARY), ROUND(AVG(SALARY), 1), COUNT(*)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING SUM(SALARY) >= 30000;

CREATE TABLE TEST001(
ID VARCHAR2(20) PRIMARY KEY,
PW VARCHAR2(10),
AGE NUMBER
);

SELECT * FROM TEST001;

SELECT * FROM ALL_INDEXES WHERE TABLE_NAME = 'EMPLOYEES';

-- 이름이 'Michael'이고, 직종이 'MK_MAN'인 사원의 급여보다
-- 많이 받는 사원들의 정보를 사번, 이름, 직종, 급여순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY > 13000;

-- 두 쿼리문 합치기
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT SALARY
				FROM EMPLOYEES
				WHERE FIRST_NAME = 'Michael' AND JOB_ID = 'MK_MAN');

-- 사원번호가 150번인 사원의 급여와 같은 급여를 받는 사원들의 정보를
-- 사번, 이름, 급여순으로 출력하세요.
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY = (SELECT SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID = 150);
			
-- 급여가 회사전체 평균급여 이상인 사람들의 이름과 급여 조회하기
SELECT FIRST_NAME, SALARY FROM EMPLOYEES
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEES);
			
-- 사번이 111번인 사원의 직종과 같고, 사번이 159번인 사원의 급여보다
-- 많이 받는 사원들의 정보를 사번, 이름, 직종, 급여순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES
WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES WHERE EMPLOYEE_ID = 111)
AND SALARY > (SELECT SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID = 159);