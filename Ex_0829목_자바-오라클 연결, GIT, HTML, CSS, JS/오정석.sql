
-- 1. 스키마의 종류와 설명을 아는대로 작성하시오.
-- 스키마 : 데이터베이스의 구조와 제약 조건에 관한 전반적인 명세를 기술한 메타데이터의 집합
-- 스키마의 종류 : 개념 스키마, 내부 스키마, 외부 스키마

-- 2. 다음 조건을 만족하는 테이블 스페이스를 생성하는 쿼리문을 작성하시오.
-- 1) 테이블 스페이스 이름 : user_exam
-- 2) 데이터 파일 이름 : C:/exam/user_exam.dbf
-- 3) 용량 : 10MB
CREATE TABLESPACE user_exam DATAFILE 'C:/exam/user_exam.dbf' SIZE 10M

-- 3. 다음의 조건에 맞는 사용자를 생성하세요.
-- 1) 사용자 이름 : exam
-- 2) 비밀번호 : 1111
CREATE USER exam IDENTIFIED BY 1111;

-- 4. 하나의 릴레이션에서 튜플의 전체 개수를 릴레이션의 ()이라고 한다.
-- ()의 올바른 것은?
--- 1. 도메인
--- 2. 테이블
--- 3. 중값 속성
--- 4. 카디널리티
-- 답> 4. 카디널리티

-- 5. 데이터베이스 설게 순서로 옳은 것은?
--- 1. 요구사항 분석 → 물리적 모델링 → 논리적 모델링 → 개념적 모델링 → 데이터베이스 구현
--- 2. 요구사항 분석 → 개념적 모델링 → 논리적 모델링 → 물리적 모델링 → 데이터베이스 구현
--- 3. 요구사항 분석 → 논리적 모델링 → 개념적 모델링 → 물리적 모델링 → 데이터베이스 구현
--- 4. 요구사항 분석 → 논리적 모델링 → 물리적 모델링 → 개념적 모델링 → 데이터베이스 구현
-- 답> 2. 요구사항 분석 → 개념적 모델링 → 논리적 모델링 → 물리적 모델링 → 데이터베이스 구현

-- 6. 제약조건추가하기
--<<조건>>
--ex02_10테이블은 이미 생성이 되어있는 상태고 PK를 추가하려고 한다.
--- 테이블명 : ex02_10
--- 제약조건명 : pk_ex02_10
--- 적용컬럼 : Col1
CONSTRAINT pk_ex02_10 PRIMARY KEY ex02_10(Col1);

-- 7. 아래 컬럼을 가지는 PRODUCT 테이블을 생성하는 DDL을 작성하시오.
--제약조건의 이름은 자동으로 부여되도록 별도로 지정하지 마시오. (단, 제약조건의 이름을 지정하더라도 감점하지 않는다.)
--<< 칼럼 정보 >>
--1) NO : 제품번호, 숫자, 기본키
--2) NAME : 제품명, 문자열 최대 100바이트, 필수
--3) PRICE : 제품가격, 숫자
--4) P_DATE : 생산일자, 날짜

-- 테이블 생성
CREATE TABLE PRODUCT(
"NO" NUMBER PRIMARY KEY,
NAME VARCHAR2(100) NOT NULL,
PRICE NUMBER,
P_DATE DATE DEFAULT TO_DATE(SYSDATE, 'YY/MM/DD')
);

DROP TABLE PRODUCT;

-- 시퀀스 생성
CREATE SEQUENCE NO_SEQ
INCREMENT BY 1
START WITH 1000;

DROP SEQUENCE NO_SEQ;

-- 8. PRODUCT 테이블에 아래의 데이터(레코드)를 삽입하시오.
--1) 모든 칼럼의 타입에 맞는 데이터를 삽입하고, 모든 칼럼에 널 값이 없도록 작성하시오.
--2) NO 칼럼의 데이터는 오라클 시퀀스를 활용하여 입력하시오. 시퀀스의 이름이나 속성은 알아서 처리하시오.
--3) P_DATE 칼럼의 데이터 중 하나 이상은 반드시 현재 날짜를 호출하는 오라클 함수를 사용하시오.
INSERT INTO PRODUCT VALUES(NO_SEQ.NEXTVAL, '컴퓨터', 100, '21/04/15');
INSERT INTO PRODUCT VALUES(NO_SEQ.NEXTVAL + 1, '냉장고', 200, '21/03/29');
INSERT INTO PRODUCT VALUES(NO_SEQ.NEXTVAL + 1, '에어컨', 300, '21/12/15');
INSERT INTO PRODUCT VALUES(NO_SEQ.NEXTVAL + 1, '오디오', 20, '21/12/15');
INSERT INTO PRODUCT VALUES(NO_SEQ.NEXTVAL - 3, '세탁기', 60, '21/04/15');

SELECT * FROM PRODUCT;

-- 9. PRODUCT 테이블에서 다음 조건을 만족하는 데이터의 정보를 수정하시오.
--<< 조건 >>
--NO 가 1000 인 데이터의 PRICE 를 20만큼 증가시키시오.
UPDATE PRODUCT SET PRICE = PRICE + 20 WHERE "NO" = 1000;

SELECT * FROM PRODUCT;

-- 10. PRODUCT 테이블에서 다음 조건을 만족하는 데이터를 삭제하시오.
--<< 조건 >>
--NAME 이 '세탁기' 인 데이터를 모두 삭제하시오.
DELETE FROM PRODUCT
WHERE NAME = '세탁기';

SELECT * FROM PRODUCT;

-- 11. PRODUCT 테이블에서 다음과 같이 데이터를 조회하시오.
SELECT NAME, PRICE FROM PRODUCT;

-- 12. PRODUCT 테이블에서 다음 조건을 만족하는 데이터를 조회하시오.
--<< 조건 >>
--모든 레코드와 모든 칼럼을 높은 PRICE가 먼저 나타나도록 정렬하여 조회하시오.
SELECT * FROM PRODUCT 
ORDER BY PRICE DESC;

-- 13. 정규화의 필요성으로 거리가 먼 것은?
--1. 데이터 구조의 안정성 최대화
--2. 중복 데이터의 활성화
--3. 데이터 수정, 삭제 시 이상현상의 최소화
--4. 테이블 불일치 위험의 최소화
-- 답> 2. 중복 데이터의 활성화

-- 14. 관계 데이터베이스의 정규화에 대한 설명으로 옳지 않은 것은?
--1. 정규화를 거치지 않으면 여러 가지 다른 종류의 정보가 하나의 릴레이션에 표현되기 때문에 릴레이션을 조작할 때 이상현상이 발생할 수 있다.
--2. 정규화의 목적은 각 릴레이션에 분산된 종속성을 하나의 릴레이션에 통합하는 것이다.
--3. 이상현상은 속성 간에 존재하는 함수 종속성이 원인이다.
--4. 정규화가 잘못되면 데이터의 불필요한 중복을 야기하여 릴레이션을 조작할 때 문제가 된다.
-- 답> 2. 정규화의 목적은 각 릴레이션에 분산된 종속성을 하나의 릴레이션에 통합하는 것이다.

-- 15. 제2정규형에서 제3정규형이 되기 위한 조건은?
--1. 이행적 함수 종속을 제거해야 한다.
--2. 부분 함수 종속을 제거해야 한다.
--3. 다치종속을 제거해야 한다.
--4. 결정자가 후보키가 아닌 함수적 종속을 제거해야 한다.
-- 답> 1. 이행적 함수 종속을 제거해야 한다.

-- 16. 데이터베이스 이상 현상의 종류 세 가지를 간단히 설명하시오.
-- 1) 삽입이상 : 의도하지 않은 데이터까지 입력해야 데이터 삽입이 되는 현상
-- 2) 갱신이상 : 중복된 데이터 중 일부만 수정되어 데이터의 모순이 일어나는 현상
-- 3) 삭제이상 : 데이터 삭제 시 의도하지 않은 데이터까지 삭제되는 현상

-- 17. 부서번호가 50번인 사원들의 이름을 출력하되 이름중 'el'을 
-- 모두 '**'로 대체하여 출력하시오
SELECT REPLACE(FIRST_NAME, 'el', '**') FROM EMPLOYEES;

-- 18. 이름이 6글자 이상인 사원의 사번과 이름, 급여를 출력
SELECT FIRST_NAME, SALARY FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) >= 6;

-- 19. 사원테이블에서 사원번호와 사원번호가 홀수이면 1, 짝수이면 0을 출력하시오.
SELECT EMPLOYEE_ID, CASE 
	WHEN MOD(EMPLOYEE_ID, 2) = 1 THEN 1
	WHEN MOD(EMPLOYEE_ID, 2) = 0 THEN 0
END AS 홀짝
FROM EMPLOYEES;

-- 20. 사원번호가 짝수인 사람들의 사원 번호와 이름을 출력하시오.
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES
WHERE MOD(EMPLOYEE_ID, 2) = 0;
















