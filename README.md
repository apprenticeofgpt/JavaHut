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

## 📁 단원별 예제 정리

<details>
<summary><strong>1. WAS 및 Servlet 개요</strong></summary>

- [`HelloServlet.java`](webtest/src/main/sec01/ex01/HelloServlet.java)

</details>

<details>
<summary><strong>2. 개발 환경 설정 (Tomcat, Eclipse)</strong></summary>

- [`web.xml`](CRUD_Project/src/main/webapp/WEB-INF/web.xml)

</details>

<details>
<summary><strong>3. HTTP 요청/응답 처리</strong></summary>

- [`RequestParamServlet.java`](webtest/src/main/sec02/ex01/RequestParamServlet.java)  
- [`UserInsertServlet.java`](CRUD_Project/src/main/java/sec01/ex01/UserInsertServlet.java)

</details>

<details>
<summary><strong>4. 서블릿 생명 주기</strong></summary>

<!-- 예제 없음 -->

</details>

<details>
<summary><strong>5. JSP (Java Server Page)</strong></summary>

<!-- 예제 없음 -->

</details>

<details>
<summary><strong>6. 세션과 쿠키</strong></summary>

<!-- 예제 없음 -->

</details>

<details>
<summary><strong>7. JDBC</strong></summary>

- [`UserDAO.java`](CRUD_Project/src/main/java/sec01/ex01/UserDAO.java)

</details>

<details>
<summary><strong>8. MVC 패턴</strong></summary>

- [`UserListServlet.java`](CRUD_Project/src/main/java/sec02/ex01/UserListServlet.java)  
- [`User.java`](CRUD_Project/src/main/java/sec02/ex01/User.java)

</details>

<details>
<summary><strong>9. 필터와 리스너</strong></summary>

<!-- 예제 없음 -->

</details>

---
</details>



