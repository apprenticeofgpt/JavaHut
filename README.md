# ☕ Java Web Study

자바 웹 개발 학습을 위한 리포지터리입니다. CRUD 구현, 서블릿(Servlet), JSP 등을 활용한 기초적인 웹 프로그래밍을 실습해 보는 것을 목표로 합니다.

---

## 📌 학습 목표

- 자바로 CRUD 기능 직접 구현
- HTTP 요청 흐름 및 서블릿 동작 방식 이해
- JSP와 서블릿을 이용한 MVC 패턴의 기초 실습
- 톰캣 서버 배포 및 웹 환경 설정 경험
- 자바 문법 및 객체지향 개념의 실습

---

## ⚙️ 개발 환경

- Java 11  
- Apache Tomcat 10.1  
- JDBC / DBCP  
- JSP / Servlet  
- OracleDB  

---

## 📁 Java 단원별 예제

아래는 `Test/src/mypack` 경로 내 자바 학습 예제 파일들을 **단원별**로 분류한 목록입니다.  
각 항목은 파일 내용을 기반으로 분류되어 있습니다.

<details>
<summary><strong>2. 변수와 자료형</strong></summary>

- [`Wrapper.java`](Test/src/mypack/Wrapper.java)

</details>

<details>
<summary><strong>3. 연산자</strong></summary>

- [`MoneyDivider.java`](Test/src/mypack/MoneyDivider.java)

</details>

<details>
<summary><strong>4. 조건문 & 반복문</strong></summary>

- [`IsTriangle.java`](Test/src/mypack/IsTriangle.java)  
- [`RectCheck.java`](Test/src/mypack/RectCheck.java)  
- [`ForLoop.java`](Test/src/mypack/ForLoop.java)  
- [`ForEach.java`](Test/src/mypack/ForEach.java)  
- [`WhileLoop.java`](Test/src/mypack/WhileLoop.java)

</details>

<details>
<summary><strong>5. 메서드</strong></summary>

- [`StaticMember.java`](Test/src/mypack/StaticMember.java)

</details>

<details>
<summary><strong>6. 클래스 & 객체</strong></summary>

- [`Book.java`](Test/src/mypack/Book.java)  
- [`OOP_Circle.java`](Test/src/mypack/OOP_Circle.java)  
- [`Equals.java`](Test/src/mypack/Equals.java)

</details>

<details>
<summary><strong>7. 상속과 다형성</strong></summary>

- [`Inheritance.java`](Test/src/mypack/Inheritance.java)  
- [`MethodOverridingEx.java`](Test/src/mypack/MethodOverridingEx.java)

</details>

<details>
<summary><strong>8. 추상 클래스 & 인터페이스</strong></summary>

- [`GoodCalc.java`](Test/src/mypack/GoodCalc.java)  
- [`Interface.java`](Test/src/mypack/Interface.java)

</details>

<details>
<summary><strong>9. 예외처리</strong></summary>

- [`JavaException.java`](Test/src/mypack/JavaException.java)

</details>

<details>
<summary><strong>10. 컬렉션 & 프레임워크</strong></summary>

- [`ArrayListEx.java`](Test/src/mypack/ArrayListEx.java)  
- [`VectorEx.java`](Test/src/mypack/VectorEx.java)  
- [`PointVector.java`](Test/src/mypack/PointVector.java)  
- [`IteratorEx.java`](Test/src/mypack/IteratorEx.java)  
- [`HashMapDicEx.java`](Test/src/mypack/HashMapDicEx.java)  
- [`HashMapScoreEx.java`](Test/src/mypack/HashMapScoreEx.java)  
- [`HashMapStudentEx.java`](Test/src/mypack/HashMapStudentEx.java)

</details>
<summary><strong>11. 제네릭 </strong></summary>
-

</details>
<summary><strong>12. 입출력 스트림 </strong></summary>
-

---
## 🌐 Webtest - Servlet/JSP 학습 프로젝트

이 프로젝트는 Java 기반의 Servlet & JSP 웹 프로그래밍 개념을 학습하기 위해 구성된 실습 리포지터리입니다.  
WAS의 기본 구조부터 요청/응답 흐름, 세션/쿠키, MVC 패턴까지 자바 웹 백엔드의 핵심 개념을 다룹니다.

---

## 📌 학습 목표

- 서블릿의 요청/응답 흐름 이해
- 서블릿 생명주기 실습
- JSP와 서블릿 간의 역할 분리
- 세션과 쿠키의 관리 방식 이해
- JDBC를 활용한 DB 연동 실습
- MVC 패턴의 기초 구성 연습

---

## ⚙️ 환경 정보

- Java 11  
- Apache Tomcat 10.1  
- JSP / Servlet  
- JDBC / DBCP  
- OracleDB 또는 H2 DB  

---

## 📁 단원별 예제 목록

`Webtest` 프로젝트 내 학습 파일들을 **다음 단원 기준**으로 분류하였습니다.

<details>
<summary><strong>1. WAS 및 Servlet 개요</strong></summary>

- 예제 준비 중

</details>

<details>
<summary><strong>2. 개발 환경 설정 (Tomcat, Eclipse)</strong></summary>

- 예제 준비 중

</details>

<details>
<summary><strong>3. HTTP 요청/응답 처리</strong></summary>

- [`HelloServlet.java`](Webtest/src/servlet/HelloServlet.java)  
  → 클라이언트의 요청을 받아 "Hello, World!" 메시지를 응답하는 기본 서블릿 예제입니다.

- [`RequestParamServlet.java`](Webtest/src/servlet/RequestParamServlet.java)  
  → 클라이언트로부터 전달된 파라미터를 처리하여 응답하는 서블릿 예제입니다.

</details>

<details>
<summary><strong>4. 서블릿 생명 주기</strong></summary>

- [`LifeCycleServlet.java`](Webtest/src/servlet/LifeCycleServlet.java)  
  → 서블릿의 생성(init), 요청 처리(service), 소멸(destroy) 과정을 출력하여 생명 주기를 학습하는 예제입니다.

</details>

<details>
<summary><strong>5. JSP (Java Server Page)</strong></summary>

- [`index.jsp`](Webtest/WebContent/index.jsp)  
  → 기본적인 JSP 페이지로, 정적인 HTML과 동적인 콘텐츠를 혼합하여 출력하는 예제입니다.

- [`form.jsp`](Webtest/WebContent/jsp/form.jsp)  
  → 사용자로부터 입력을 받아 서블릿으로 전송하는 폼을 구현한 JSP 예제입니다.

</details>

<details>
<summary><strong>6. 세션과 쿠키</strong></summary>

- [`SessionServlet.java`](Webtest/src/servlet/SessionServlet.java)  
  → HTTP 세션을 생성하고 관리하는 방법을 보여주는 서블릿 예제입니다.

- [`CookieServlet.java`](Webtest/src/servlet/CookieServlet.java)  
  → 클라이언트에 쿠키를 설정하고 읽는 방법을 학습하는 서블릿 예제입니다.

</details>

<details>
<summary><strong>7. JDBC</strong></summary>

- [`MemberDAO.java`](Webtest/src/dao/MemberDAO.java)  
  → 데이터베이스와의 연결을 통해 회원 정보를 삽입, 조회하는 DAO 클래스입니다.

- [`MemberInsertServlet.java`](Webtest/src/servlet/MemberInsertServlet.java)  
  → 사용자로부터 입력받은 회원 정보를 데이터베이스에 저장하는 서블릿 예제입니다.

</details>

<details>
<summary><strong>8. MVC 패턴</strong></summary>

- [`FrontControllerServlet.java`](Webtest/src/controller/FrontControllerServlet.java)  
  → 모든 요청을 중앙에서 처리하는 Front Controller를 구현한 서블릿 예제입니다.

- [`MemberListView.jsp`](Webtest/WebContent/view/MemberListView.jsp)  
  → 회원 목록을 출력하는 JSP 뷰 페이지로, MVC 패턴의 View 역할을 담당합니다.

- [`MemberService.java`](Webtest/src/service/MemberService.java)  
  → 비즈니스 로직을 처리하는 서비스 클래스이며, DAO와 Controller 사이의 중간 역할을 합니다.

</details>

<details>
<summary><strong>9. 필터와 리스너</strong></summary>

- 예제 준비 중

</details>



