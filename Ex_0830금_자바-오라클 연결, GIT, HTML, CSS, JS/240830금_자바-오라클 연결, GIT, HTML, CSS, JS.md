# 240830금_자바-오라클 연결, GIT, HTML, CSS, JS

## TODO

## 진행사항

## 수업 내용_자바-오라클 연결, GIT, HTML, CSS, JS

### 자바-오라클 연결

*Dept.java*

```sql
package EX01;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
```

*EX01.java*

```sql
package EX01;

// error : The type java.sql.Connection is not accessible
// -> 프로젝트의 모듈을 삭제한다.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EX01 {
	public static void main(String[] args) {
		// 오라클디비와 자바 어플리케이션 간의 연결을 제공하는
		// jdbc드라이버의 클래스 오라클드라이버는 오라클 데이터베이스와
		// 상호작용을 하고 데이터베이스 연결 및 쿼리 실행을 처리하는 자바
		// 어플리케이션에서 사용된다.
		// 오라클 데이터베이스와의 통신을 담당하며, 자바코드가 오라클 데이터베이스와
		// 상호작용을 하게 한다.
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "hr";
		String password = "hr";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
		
		List<Dept> list = new ArrayList<>();
		
		res = insertDept2(60, "개발부", "606");
		res = insertDept2(70, "인사부", "707");
		res = insertDept2(80, "회계부", "808");
		
		if(res != 0) {
			System.out.println("추가가 잘 되었습니다.");
		}
		
		try {
			Class.forName(driver);
			// url, 아이디, 비밀번호를 가지고 db에 연결
			con = DriverManager.getConnection(url, userId, password);
			
			// 문자열로 된 쿼리문
			String sql = "SELECT * FROM DEPT2 ORDER BY DEPTNO";
			
			// 문자열을 전달받아 실제 쿼리문으로 변경
			pstmt = con.prepareStatement(sql);
			
			// 쿼리문 실행 후 rs 객체에 저장
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Dept d = new Dept();
				d.setDeptno(rs.getInt("deptno"));
				d.setDname(rs.getString("dname"));
				d.setLoc(rs.getString("loc"));
				
				list.add(d);
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		for(Dept d : list) {
			System.out.println(d.getDeptno() + "\t" + d.getDname() + "\t" + d.getLoc());
		}
	} // main
	
	public static int insertDept2(int deptno, String dname, String loc) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "hr";
		String password = "hr";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Dept> list = new ArrayList<>();
		
		int res = 0;
		
		try {
			Class.forName(driver);
			// url, 아이디, 비밀번호를 가지고 db에 연결
			con = DriverManager.getConnection(url, userId, password);
			
			// 문자열로 된 쿼리문
			String sql = "INSERT INTO DEPT2 VALUES(?,?,?)";
			
			// 문자열을 전달받아 실제 쿼리문으로 변경
			pstmt = con.prepareStatement(sql);
			
			// 각각의 물음표에 값을 전달
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			// 바뀐 행 수만큼 정수로 반환
			res = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return res;
	} // insertDept2()
}
```

### HTML, CSS, JS

* 웹페이지?

  * 일종의 문서파일
  * 웹페이지를 작성하는 도구는 html
  * 웹페이지는 주로 원거리 통신을 통해 전달되는 경우가 많으며, 이 때 사용하는 방식을 HTTP라고 한다.
  * 웹페이지는 글자와 사진뿐 아니라 동영상, 음악 등 다양한 정보를 아름다운 형태로 제공할 수 있다.
  * 웹페이지들이 모여서 만들어진 덩어리를 웹사이트라고 한다.

* 웹개발자의 업무

  * 프론트엔드 개발자
    * 사용자가 눈으로 직접 보며 사용하는 웹페이지를 개발하는 엔지니어이다.
  * 백엔드 개발자
    * 데이터를 저장하거나 프론트엔드의 원활한 활동을 도와주기 위해 서버를 개발하는 엔지니어이다.
    * 바깥에서는 잘 보이지 않는 뒷단에서 작동하는 소프트웨어를 개발한다.

* 마크업 언어란?

  * 문서에 마크업을 추가하기 위해 사용하는 도구
  * 언어라고 이름이 붙은 이유는 사람과 컴퓨터가 서로 대화하기 위해 사용하는 도구이기 때문이다.
  * 교과서나 참고서의 중요한 부분에 밑줄을 긋거나 형광펜으로 칠하는 등 문서를 꾸미는 행위를 말한다.
  * 웹페이지도 마크업 언어로 작성된 문서이다.

* 개발의 기본은 협업이다.

* 웹 프론트엔드 개발을 위한 기본기

  * HTML을 통해 웹 페이지의 뼈대를 제작해볼것이다.
  * 이후 CSS를 통해 HTML로 제작한 홈페이지에 디자인적 요소를 추가해 더욱 아름다운 웹페이지를 제작할 수 있다.
  * 마지막으로 JS를 활용하면 웹페이지에 각양각색의 기능들을 추가할 수 있다.
  * 웹 페이지가 역동적으로 움직이고 변화하며 우리와 상호작용 할 수 있는 비밀이 JS덕분이다.

* 실습환경 구축하기

  1. Visual Studio Code 설치하기
     * 마이크로소프트에서 제공하는 프로그램
  2. 개발을 도와주는 유용한 프로그램 설치하기
     * 프레임워크란?
       * 복잡한 문제를 해결하는 데 사용할 수 있는 누군가 만들어 둔 소프트웨어이다.
       * 영단어 그대로 번역하면 뼈대 또는 골조라는 단어이다.
     * 프레임워크를 사용해 문제를 해결하는 방법
       * 구글 검색을 통해 원하는 프레임워크를 찾아냈다면, 프레임워크의 사용설명서를 읽어보세요.

* 루비, 지킬 설치

  ```
  https://rubyinstaller.org/downloads/
  ```

  ```
  gem install jekyll bundler
  ```

### GIT

* 깃허브 활용하기

  * 작업중인 코드를 업로드하건, 다른 컴퓨터에서 다운받는 등의 작업을 도와주는 일종의 온라인 사무실과 같은 서비스이다.
  * 코드의 백업과 무료 웹 호스팅 이용을 위해 깃허브를 사용해보자.

* git 설치하기

  * git이란 뭘까?

    코드를 2일전 코드로 되돌리고 싶으면 어떻게 해야할까?

    1. 코드를 매일매일 백업한다.
    2. 버전관리 프로그램을 사용한다.

  * git

    분산 버전관리 시스템(Distributed Version Control System)

    * 컴퓨터 파일의 변경사항을 추적하고 여러명의 사용자들 간에 파일에 대한 작업을 조율하는 데 사용한다.
    * 주로 여러명의 개발자가 하나의 소프트웨어 개발 프로젝트에 참여할 때, 소스 코드를 관리하는데 주로 사용된다.

  * 버전관리는 왜 필요한가?

    * 각자 본인이 맡은 파트의 PPT를 만들어서 합치는 과정이라고 가정
    * 팀원이 많아질수록 각 파트별로 만든 파일을 본 파일에 합치는 과정이 복잡해진다.

  * git의 장점

    * 인터넷이 연결되지 않은 곳에서도 개발을 진행할 수 있으며, 분산 버전관리이기 때문에 중앙 저장소가 삭제되어도 원상복구가 가능하다.
    * 각자의 개발자가 Branch에서 개발한 뒤, 본 프로그램에 합치는 merge방식을 통한 병렬 개발 가능

  * git기본 용어

    * 동작과 이력을 효율적으로 처리하기 위해 저장공간을 논리적으로 분리
    * 작업공간(working directory / working tree)
    * 임시공간(stage)
    * 실질적으로 저장되고 기록되는 공간(repository)

  * Repository

    * 저장소
    * 히스토리, 태그, 소스의 가지치기 혹은 branch에 따라 버전을 저장
    * 작업자가 변경한 모든 히스토리를 확인 가능

  * Working Tree

    * 작업을 하는 공간
    * 로컬 저장소에 접근하여 파일을 생성, 수정, 그리고 저장하는 공간
    * Staging area에 맞닿아 있음
    * 저장소의 어느 한 시점을 바라보는 작업자의 현재 시점

  * Staging Area

    * 저장소에 저장하기 전 임시 저장하는 공간

  * COMMIT

    * 현재 변경된 작업 상태 점검을 --마치고 확정적으로 저장소에 저장하는 작업

  * HEAD

    * 현재 작업중인 BRANCH를 가리킨다.

  * BRANCH

    * 가지 또는 분기점
      * 작업을 할 때 현재 상태를 복사하여 Branch에서 작을 한 후 완전하다 싶을 때 Merger하여 작업한다.
      * 새로운 Branch는 마지막 commit한 상태를 가져온다.

  * Merge

    * 다른 Branch의 내용을 현재 Branch로 가져와 합치는 작업을 의미

* git의 기본 명령어

  1. git help

     * 도움말 기능(가장 많이 사용하는 21개의 git명령어 출력)
     * 사용법이 궁금한 명령에 대해 'git help 명령어'를 통해 해당 git명령어의 설정과 사용에 대한 도움말을 출력하는 것도 가능하다.

  2. git init

     * git 저장소를 초기화
     * 저장소나 디렉토리 안에서 이 명령어를 실행하기 전까지는 그냥 일반 폴더이다.
     * 이 명령어를 입력해야 추가적인 git명령어 입력 가능

  3. git status

     * 저장소 상태 체크
     * 어떤 파일이 저장소 안에 있는지, 커밋이 필요한 변경사항이 있는지, 현재 저장소의 어떤 Branch에서 작업하고 있는지 등 상태 정보를 출력

  4. git branch

     * 새로운 branch를 생성
     * 여러 협업자와 작업할 시, 이 명령어로 새로운 브랜치를 만들고, 자신만의 변경사항과 파일 추가 및 커밋 타임라인을 생성, 완성 후 협업자의 branch 혹은 main과 merge한다.

  5. git add

     * staging 영역에 변경 사항을 추가

     * 다음 commit 전까지 변경분을 staging 영역에 보관하여 변동 내역을 저장

       git add 업로드 하고싶은 파일 or 경로

       git add . 현재 디렉토리의 모든 변경 내용 staging에 등록

       git add-A 작업 디렉토리의 모든 변경 내용을 staging에 등록

       git add -P 터미널에서 staging으로 넘길 파일 선택 가능

  6. git commit

     * staging에 있는 내용을 적용

       git commit -m 메시지

       커밋 메시지를 반영한 수정본 파일 묶음

     * git 닉네임 및 이메일 등록

       ```bash
       git config --global user.name "jungsoek"
       ```

       ```bash
       git config --global user.email "jungsoeko@gmail.com"
       ```

  7. git log

     * 커밋 내역 확인

  8. git push

     * 로컬 컴퓨터에서 서버로 변경사항을 보낸다.

  9. git pull

     * 서버 저장소로부터 최신 버전을 pull

  10. git clone

      * 서버 저장소로부터 최신버전을 다운로드

  11. git checkout

      * git branch 생성

        ```bash
        git branch second
        ```

      * 작업하길 원하는 branch로 이동

        ```bash
        git checkout second
        ```

  12. git merge

      * 개별 branch에서 마친 작업을 master branch로 병합

        ```bash
        git merge second
        ```

* GitHub Desktop 설치

  ```
  https://desktop.github.com/download/
  ```

### HTML

* HyperText Markup Language의 약자
* 하이퍼텍스트는 종이에 인쇄된 텍스트 기술의 한계를 초월한 고차원적인 기술이라는 뜻
* HTML은 웹페이지를 만드는 대표적인 마크업 언어이다.
* HTML은 웹페이지의 구조를 표현
* HTML은 여러 요소로 구성이 되어있다.

※ HTTP에 대해서...

* HTTP 통신을 통해 내용을 주고받는다.
* HTTP는 한번 내용을 주고 받으면 연결이 끊긴다.

* 웹 페이지 작성의 규칙

* HTML의 요소

  * HTML의 요소는 일반적으로 태그라고 부른다.

  * HTML의 요소는 일반적으로 시작태그와 닫힘태그가 한쌍이다.

    ```html
    <시작태그 속성="속성값"> 내용 </닫힘태그> -> Element(요소)라고 한다.
    ```

  * 다만 닫힘태그가 없는 태그도 있긴하다.

* 태그(Tag) : < 와 >로 둘러싸인 문자열 시작태그(<>)와 종료태그(</>)로 구성

* 내용(content) : 시작태그와 종료태그 사이에 있는 문자열

* 엘리먼트(element) 

  : 태그와 내용을 포함한 전체 문자열

  : HTML문서의 기본 구성 단위

  : 상위 엘리먼트 안에 하위 엘리먼트가 계층적으로 포함될 수 있다.

* 속성(attribute) : 엘리먼트의 상세한 표현(기능)설정 사항을 지시

  ```html
  <title color="red">제목</title>
  ```

  * 속성값(value) : 속성에 들어가는 값, ""로 감싸야 함

## MEMO
