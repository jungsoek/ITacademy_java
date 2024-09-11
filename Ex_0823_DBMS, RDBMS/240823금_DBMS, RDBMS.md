# 240823금_DBMS, RDBMS

## TODO

## 진행사항

## 수업 내용_DBMS, RDBMS

### DBMS

* 데이터베이스와 사용자 또는 프로그램간의 매개체
* DB의 조회, 수정, 삭제, 추가와 같은 관리를 할 수 있게 해준다.
* 엑셀 사용시 데이터가 많아지면 버벅거린다(몇백개만 넣어도).
* 엑셀 사용시 한명이 사용시 나머지는 사용 불가능
  (각자 작업한거를 합치기 쉽지 않음)
* DBMS사용시 데이터 많은 양의 데이터를 넣어도 끄떡없음
* 하나의 DB에 여러사람이 접속해서 사용할 수 있다.
* 수정한 내용이 즉각적으로 반영되어 모든사용자에게 동일한 내용이 보여진다.

### RDBMS(관계형 데이터베이스)

* 행과 열의 형태로 데이터를 저장하는 데이터베이스 관리 시스템

* sqlplus

  계정명/비밀번호(안보임)

* 계정 잠금 풀기

  Alter user 계정명 account 

* 계정 비밀번호 바꾸기

  Alter user 계정명 identified by 새비밀번호;

* 오라클과 자바프로그램을 외부를 연걸하기 위해 필요한 라이브러리
  ojdbc

* 스키마

  외부에서 DB를 바라보는 관점 메타데이터

* 개념스키마 : DB의 관계, 제약조건, 접근권한, 보안정책 정의한것

  내부스키마 : 물리적(기억장치)으로 저장할거냐

  외부스키마 : 사용자나 개발자가 어떻게 사용할거냐

* DDL : 데이터 정의어

  CREATE : 데이터베이스 객체의 생성

  ALTER : 데이터베이스 객체의 수정

  DROP : 데이터베이스 객체의 영구 삭제

  TRUNCATE : 테이블 내의 데이터만 몽땅 삭제

* 행(row) 1명에 대한 정보

  튜플(tuple)

  행의 개수를 카디널리티라고 한다.

  열(column) 1가지에 대한 정보

  속성(attribute)

  열의 개수를 디그리(degree)라고 한다.

* 자료형

  * 문자형
    VARCHAR2(길이) : 가변형 최대 4000byte
  * 숫자형
    NUMBER(P,S) : P는 자리수, S소수점 이항 자리수
  * 날짜형
    DATE

* NOT NULL과 DEFAULT의 차이점

  ex) GENDER CHAR(1) DEFAULT 'W'

  /* QUERY1 */

  INSERT INTO TBL_STUDENT GENDER VALUES(NULL);

  /* QUERY2 */

  INSERT INTO TBL_STUDENT GENDER VALUES();

  쿼리1은 'NULL'이라는 특정한 값을 받았다고 생각하기 때문에 DEFAULT값이 안들어간다.

  쿼리2는 아무런 입력도 받지 않았다고 생각하기 때문에 DEFAULT값인 'W'가 설정된다.

1. NOT NULL만 선언한 경우

   쿼리1의 경우 : NOT NULL이 동작을 한다.

   쿼리2의 경우 : NOT NULL이 동작을 한다.

2. 두개 다 선언한 경우

   쿼리1의 경우 : DEFAULT가 동작하여 기본값이 들어감

   쿼리2의 경우 : NOT NULL이 동작하여 오류남

* 무결성
  * 데이터베이스에 저장된 값과 현실 세계의 실제 값이 일치하는지 정확성을 의미
  * 무결성 제약조건은 DB에 들어있는 데이터의 정확성을 보장하기 위해 부정확한 자료가 DB내에 저장되는 것을 방지하기 위한 제약조건을 말한다.
  * 데이터의 정확성, 일관성, 유효성이 유지되는것.
  * 일관된 데이터베이스 상태를 정의하는 규칙을 묵시적 또는 명시적으로 정의함
  * 정확성 : 중복이나 누락이 없는 상태
  * 일관성 : 원인과 결과의 의미가 연속적으로 보정되어 변하지 않는 상태

1. 개체 무결성
   * PK로 선택된 컬럼은 고유한 값을 가져야 하며, NULL값을 허용하지 않는다.
2. 참조 무결성
   * 외래키 값은 NULL이거나 참조 테이블의 기본키 값과 동일해야 한다.
   * 즉, 테이블은 참조할 수 없는 외래키 값을 가질 수 없다.
3. 도메인 무결성
   * 주어진 속성의 값들이 도메인에 속한 값이어야 한다는 규정
   * 수강이라는 테이블에 '과목명'에 영어, 수학, 국어 세 가지만 입력되도록 도메인을 가진 경우
   * 반드시 도메인에 속한 값만 입력해야 한다.
4. 사용자 정의 무결성
   * 속성 값들이 사용자가 정의한 제약 조건에 만족해야 한다는 규정이다.

* 모델링
  * 정보시스템 구축의 대상이 되는 업무 내용을 분석하여 이해하고 약속된 표기법에 의해 표현하는것 의미한다.
  * 분석된 모델을 가지고 실제 데이터베이스를 생성하여 개발 및 데이터 관리에 사용한다.
  * 특히 데이터를 추상화한 데이터 모델은 데이터베이스의 골격을 이해하고 그 이해를 바탕으로 SQL문장을 기능과 성능적인 측면에서 효율적으로 작성할 수 있기 때문에 데이터 모델링은 데이터베이스 설계의 핵심 과정이기도 하다.
* 데이터 모델링의 특징
  * 추상화 : 현실세계를 일정한 형식에 맞춰 간략하게 표현해야 한다.
  * 단순화 : 누구나 쉽게 이해할 수 있도록 제한된 표기법이나 언어를 사용한다.
  * 명확화 : 명확하게 의미가 해석되어야 하고, 한 가지 의미만을 가져야 한다.

1. 요구사항 분석

   * 고객과의 의사소통을 통해 고객의 업무 프로세스를 완벽하게 이해하고 그들의 요구사항을 구체적으로 뽑아내는 과정

2. 개념적 데이터 모델링

   * 내가 하고자 하는 일의 데이터간 관계를 구상하는 단계
   * 각 객체들과 그들간의 관계를 발견하고 표현하기 위해 erd(Entity Relationship Diagram)를 생성한다.

3. 논리적 데이터 모델링

   * 개념적 데이터 모델이 완성되면, 구체화된 업무 중심의 데이터 모델을 만들어내야 한다.
   * 업무에 대한 제약조건, 속성, 관계등을 표시하며 정규화 활동을 수행한다.
   * 정규화는 데이터 모델의 일관성을 확보하고 중복을 제거하여 신뢰성있는 데이터 구조를 얻는 목적이 있다.

   | USER                    | ORDER                  | PRODUCT              |
   | ----------------------- | ---------------------- | -------------------- |
   | U_ID(PK) VARCHAR2(100)  | O_NUM NUMBER           | P_NUM(PK) NUMBER     |
   | U_PW VARCHAR2(100)      | O_DATE DATE            | P_NAME VARCHAR2(100) |
   | U_NAME VARCHAR2(200)    | U_ID(FK) VARCHAR2(100) | P_PRICE NUMBER       |
   | U_ADDRESS VARCHAR2(300) | P_NUM(FK)              | P_COUNT NUMBER       |
   | U_EMAIL VARCHAR2(300)   | P_ACCOUNT(FK)          |                      |
   | U_BIRTH DATE            |                        |                      |

* 조합키

  * 두 개 이상의 컬럼이 하나의 기본키로 작동하기 때문에 두개가 완전히 일치하는 데이터가 올 수 없다.
  * 하지만 `CONSTRAINT TEST_PK PRIMARY KEY(Col1, Col2)`와 같이 두 개 이상의 컬럼을 키로 만드는 것이 가능하다.
  * 조합키 만드는 법

  ```sql
  CREATE TABLE TEST(
  	Col1 varchar2(30),
      Col2 number,
      CONSTRAINT TEST_PK PRIMARY KEY(Col1, Col2)
  );
  ```

4. 물리적 데이터 모델링
   * 최종적으로 데이터를 관리할 데이터베이스를 선택하고, 선택한 데이터베이스에 실제 테이블을 만드는 작업을 말한다. 
   * 시각적인 구조를 만들었으면 실제로 SQL코딩을 통해 완성하는 단계

* 관계

  * 1:1관계

    어느 한쪽의 테이블에서 상대 테이블과 반드시 단 하나의 관계를 가지는 것

  * 1:N 관계(1대 다 관계)

    한 쪽 테이블이 관계를 맺은 쪽의 테이블에 여러 객체를 가질 수 있는 것

    한명의 유저가 여러개의 물건을 주문할 수 있다.

  * N:M(다 대 다 관계)

    관계를 맺고 있는 양쪽의 테이블 모두가 1:N 관계를 가지는 것

    한 학원에는 여러명의 학생이 다닐 수 있고 한명의 학생도 여러개의 학원을 다닐 수 있다.

    N:M 관계는 두 테이블의 기본키를 컬럼으로 갖는 또 다른 테이블을 생성해서 관리한다.

1. 요구사항

   꽃 테이블과 화분 테이블이 필요하다.

   꽃을 구매할 때 화분도 같이 구매한다.

   * 꽃 테이블
     * 꽃 이름(PK)
     * 꽃 색깔
     * 꽃 가격
   * 화분
     * 제품번호(PK)
     * 화분색깔
     * 화분모양
     * 꽃이름

   1. 논리모델링
   2. 물리모델링
   3. 테이블 만들기

* DML(Data Manipulation Language) : 데이터 조작어

  1. SELECT : 데이터의 조회

     * 테이블에서 원하는 데이터를 조회할 때 사용하는 키워드

     ```SQL
     SELECT 컬럼명1, 컬럼명2, 컬럼명3, ... FROM 테이블명;
     SELECT 컬럼명1, 컬럼명2, 컬럼명3, ... FROM 테이블명 WHERE 조건식;
     ```

     원하는 자료를 검색하기 위한 조건절

     WHERE 절에서는 결과를 제한하기 위한 조건을 기술할 수도 있다.

     WHERE절은 조회하려는 데이터에 특정 조건을 부여할 목적으로 사용하기 때문에 FROM절 뒤에 오게 된다.

     WHERE절의 조건식은 다음과 같이 구성된다.

     * 컬럼명이 왼쪽에 온다.
     * 비교연산자가 가운데 온다.
       * `>, <`
       * `<=, >=`
       * =(같다)
       * !=(같지 않다), <>, ^=
       * AND : 그리고
       * OR : 또는

  2. INSERT : 데이터의 추가

  3. UPDATE : 데이터의 수정

  4. DELETE : 데이터의 삭제

* SQL 연산자

  1. BETWEEN : A와 B사이의 값을 조회할 때 사용
  2. IN : OR을 대신해 사용하는 연산자
  3. LIKE : 유사검색

```SQL

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
```

## Memo

* RDS
* EC2
* S3

* 문제

  3. CD 정보를 데이터베이스에 저장하려고 한다.
     CD는 타이틀, 가격, 장르, 트랙 리스트 등의 정보를 가지고 있다.
     각 CD는 아티스트가 있으며 아티스트는 여러 CD를 출시한다.
     트랙은 타이틀, 러닝타임(초)이 있다.
     개체와 관계
     개체(Entity)

     * CD : 타이틀, 가격, 장르, 트랙 리스트
     * 아티스트 : 이름, 국적, 데뷔년도
     * 트랙 : 타이틀, 러닝타임

     관계(Relationship)

     * CD와 아티스트는 N:1(한명의 아티스트는 여러 CD를 낼 수 있다.)
     * CD와 트랙은 1:N(하나의 CD에는 여러 트랙이 포함될 수 있다.)

     1. 테이블로 변환하시오
     2. DDL문 작성하기

  4. 회사의 정보를 DB에 저장하려고 한다.

     * 회사는 네 개의 부서를 운영한다. 부서는(부서번호, 부서이름)을 저장한다.
     * 부서는 1명 이상의 직원(직원번호, 직원이름, 직책)을 두고 있다. 각 직원은 하나의 부서에 소속된다.
     * 직원은 부양가족(이름, 나이)이 있을 수 있다.(누구의 가족인지 알아야겠죠?)
     * 각 직원은 근무했던 부서에 대한 근무기록(기간, 직책)이 있다.(누가 일했는지 알아야겠죠?)

