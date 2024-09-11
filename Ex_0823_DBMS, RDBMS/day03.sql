
CREATE TABLE "USER" (
U_ID VARCHAR2(100) PRIMARY KEY,
U_PW VARCHAR2(100),    
U_NAME VARCHAR2(200),   
U_ADDRESS VARCHAR2(300),
U_EMAIL VARCHAR2(300),   
U_BIRTH DATE
);

CREATE TABLE "PRODUCT" (
P_NUM NUMBER PRIMARY KEY,
P_NAME VARCHAR2(100),    
P_PRICE NUMBER,   
P_COUNT NUMBER
);

CREATE TABLE "ORDER" (
O_NUM NUMBER,
O_DATE DATE,    
U_ID VARCHAR2(100), -- fk
P_NUM NUMBER, -- fk
CONSTRAINT USER_FK FOREIGN KEY(U_ID) REFERENCES "USER" (U_ID),
CONSTRAINT PRODUCT_FK FOREIGN KEY(P_NUM) REFERENCES "PRODUCT" (P_NUM)
);

DROP TABLE "ORDER";
DROP TABLE "PRODUCT";
DROP TABLE "USER";

CREATE TABLE FLOWER (
F_NAME VARCHAR2(200) PRIMARY KEY,
F_COLOR VARCHAR2(100),
F_PRICE NUMBER
);

CREATE TABLE POT (
P_NUM NUMBER PRIMARY KEY,
P_COLOR VARCHAR2(100),
P_SHAPE VARCHAR2(100),
F_NAME VARCHAR2(200),
CONSTRAINT POT_FK FOREIGN KEY(F_NAME) REFERENCES FLOWER(F_NAME)
);

DROP TABLE POT;
DROP TABLE FLOWER;


CREATE TABLE ARTIST (
ART_NAME VARCHAR2(100) PRIMARY KEY,
NATIONALITY VARCHAR2(100),
YEAROFDEBUTE NUMBER
);

CREATE TABLE CD (
CD_TITLE VARCHAR2(100) PRIMARY KEY,
PRICE NUMBER,
GENRE VARCHAR2(100),
TRACKLIST VARCHAR2(100),
ART_NAME VARCHAR2(100),
CONSTRAINT ARTIST_FK FOREIGN KEY(ART_NAME) REFERENCES ARTIST(ART_NAME)
);

CREATE TABLE TRACK (
TR_TITLE VARCHAR2(100) PRIMARY KEY,
RUNNINGTIME NUMBER,
CD_TITLE VARCHAR2(100),
CONSTRAINT CD_FK FOREIGN KEY(CD_TITLE) REFERENCES CD(CD_TITLE)
);

DROP TABLE TRACK;
DROP TABLE CD;
DROP TABLE ARTIST;


CREATE TABLE DEPARTMENT (
D_NUM NUMBER PRIMARY KEY,
D_NAME VARCHAR2(100)
);

CREATE TABLE EMPLOYEE(
E_NUM NUMBER PRIMARY KEY,
E_NAME VARCHAR2(100),
E_POSITION VARCHAR2(100),
D_NUM NUMBER,
CONSTRAINT DEP_EMP_FK FOREIGN KEY(D_NUM) REFERENCES DEPARTMENT(D_NUM)
);

CREATE TABLE FAMILY(
F_NAME VARCHAR2(100) PRIMARY KEY,
F_AGE NUMBER,
E_NUM NUMBER,
CONSTRAINT EMP_FAM_FK FOREIGN KEY(E_NUM) REFERENCES EMPLOYEE(E_NUM)
);

CREATE TABLE ARCHIVE(
A_TERM NUMBER,
A_POSITION VARCHAR2(100),
E_NUM NUMBER,
CONSTRAINT EMP_ARCH_FK FOREIGN KEY(E_NUM) REFERENCES EMPLOYEE(E_NUM)
);

DROP TABLE ARCHIVE;
DROP TABLE FAMILY;
DROP TABLE EMPLOYEE;
DROP TABLE DEPARTMENT;

SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES;

SELECT * FROM COLS WHERE TABLE_NAME = 'EMPLOYEES';

SELECT * FROM EMPLOYEES;

SELECT * FROM DEPARTMENTS;

-- 사원테이블에서 FIRST_NAME이름, JOB_ID직종, SALARY급여를 조회해보세요.
SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES;

-- 컬럼에 실제로 없는 정보도 출력할 수 있다.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, COMMISSION_PCT FROM EMPLOYEES;

-- 사원테이블에서 급여가 10000이상인 사원들의 정보를 사번, 이름, 급여순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES WHERE SALARY >= 10000; 

-- 사원테이블에서 이름이 Michael인 사원의 사번, 이름을 조회
-- 문자열 데이터는 ''에 넣어서 표현
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME = 'Michael';

-- 사원테이블에서 직종이 IT_PROG인 사원들의 정보를 사번, 이름, 직종, 급여 순으로 조회
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG';

-- 사원테이블에서 급여가 10000이상 13000이하인 사원의 정보를 이름, 급여 순으로 조회하세요.
SELECT FIRST_NAME, SALARY FROM EMPLOYEES
WHERE SALARY >= 10000 AND SALARY <= 13000;

-- 사원테이블에서 (HIRE_DATE)입사일이 05년9월21일 이후에 입사한 
-- 사원의 정보를 사번, 이름, 입사일순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE FROM EMPLOYEES
WHERE HIRE_DATE >= '2005-09-21';

-- 사원테이블에서 2006년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, HIRE_DATE FROM EMPLOYEES;

-- 사원테이블에서 직종이 'SA_MAN'이거나 'IT_PROG'인 사원들의 모든 정보를 출력하세요.
SELECT * FROM EMPLOYEES
WHERE JOB_ID ='SA_MAN' OR JOB_ID = 'IT_PROG';

-- 사원테이블에서 급여가 2200, 3200, 5000, 6000을 받는 사원들의 정보를
-- 사번, 이름, 직종, 급여 순으로 조회
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES
WHERE SALARY = 2200 OR SALARY = 3200 OR SALARY = 5000 OR SALARY = 6000;

SELECT EMPLOYEE_ID, JOB_ID, HIRE_DATE FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '2006-01-01' AND '2006-12-31';

-- IN(값, 값, 값)
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY IN (2200, 3200, 5000, 6000);

-- 직종이 'SA_MAN', 'IT_PROG'가 아닌 모든 사원의 정보를 출력
SELECT * FROM EMPLOYEES
WHERE JOB_ID NOT IN('SA_MAN', 'IT_PROG');

-- LIKE 유사검색
-- WHERE절에서 사용되며 부분적으로 일치하는 속성을 찾을 때 사용된다.
-- % : 모든값
-- _ : 하나의 값

-- EX) : 'M%' : M으로 시작하는 모든 데이터
-- '%A' : A로 끝나는 모든 데이터
-- '%A%' : A를 포함하는 모든 데이터
-- 'A_' : A로 시작하는 두글자 짜리 데이터
-- '_A_' : A를 두번재 글자로 갖는 세글자 짜리 데이터
-- '__A' : A로 끝나는 세글자짜리 데이터

-- 사원테이블에서 사원들의 이름 중 M으로 시작하는 사원들의 정보를
-- 사번, 이름, 직종순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'M%';

-- 사원테이블에서 이름에 a가 포함되어있는 사원의 정보를 이름, 직종순으로 출력
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES
WHERE FIRST_NAME LIKE '%a%';

-- 이름의 첫글자가 M이면서 총 7글자의 이름을 가진 사원정보를 사번, 이름순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'M______';

-- 사원테이블에서 이름의 세번째글자에 a가 들어가는 사원들의 정보를 사번, 이름순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME LIKE '__a%';

-- 이름에 소문자 o가 들어가면서 a로 끝나는 사원들의 정보를 이름, 급여순으로 조회
SELECT FIRST_NAME, SALARY FROM EMPLOYEES
WHERE FIRST_NAME LIKE '%o%a';

-- 이름이 H로 시작하면서 6글자 이상인 사원들의 정보를 사번, 이름순으로 조회
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'H_____%';

-- 사원테이블에서 이름에 s가 들어있지 않은 사원들만 사번, 이름으로 검색하세요.
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME NOT LIKE '%s%';

SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE FIRST_NAME LIKE '%el%' OR FIRST_NAME LIKE '%en%';

-- 언더바 자체를 조회하고싶으면 이스케이프문자 '%\_%';를 써야 한다.



