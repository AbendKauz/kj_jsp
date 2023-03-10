<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">

<%
	String sessionId = (String) session.getAttribute("sessionId");
%>

<sql:setDataSource var="dataSource" url="jdbc:mysql://localhost:3306/WebMarketDB"
	driver="com.mysql.jdbc.Driver" user="manager" password="1234"/>
	
<sql:query dataSource="${dataSource}" var="resultSet">
	select * from member where id=?
	<sql:param value="<%=sessionId %>"/>
</sql:query>

<meta charset="UTF-8">
<title>회원 수정</title>
<script type="text/javascript">
	function checkForm(){
		if(!document.newMember.id.value){
			alert("아이디를 입력하세요.");
			return false;
		}else if(!document.newMember.password.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}else if(document.newMember.password.value != document.newMember.password_confirm.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}else if(!document.newMember.name.value){
			alert("이름을 입력하세요.");
			return false;
		}
	}
	
	function chkDelete(){
		if(confirm('정말 삭제하시겠습니까?')){
			location.href="deleteMember.jsp";	
		}
	}
</script>
</head>

<body onload="init()">
	<jsp:include page="/menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 수정</h1>
		</div>
	</div>
	
	<c:forEach var="row" items="${resultSet.rows}">
		<c:set var="mail" value="${row.mail }"/>
		<c:set var="mail1" value="${mail.split('@')[0]}"/>
		<c:set var="mail2" value="${mail.split('@')[1]}"/>
		
		<c:set var="birth" value="${row.birth}"/>
		<c:set var="year" value="${birth.split('/')[0]}"/>
		<c:set var="month" value="${birth.split('/')[1]}"/>
		<c:set var="day" value="${birth.split('/')[2]}"/>
	
		<div class="container">
			<form name="newMember" action="processUpdateMember.jsp" class="form-horizontal" method="post" onsubmit="return checkForm()">
				<div class="form-group row">
					<label class="col-sm-2">아이디</label>
					<div class="col-sm-3">
						<input type="text" name="id" class="form-control" placeholder="id" value='<c:out value="${row.id}"/>' readonly/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">비밀번호</label>
					<div class="col-sm-3">
						<input type="password" name="password" class="form-control" placeholder="password" value='<c:out value="${row.password}"/>'/>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">비밀번호 확인</label>
					<div class="col-sm-3">
						<input type="password" name="password_confirm" class="form-control" placeholder="password_confirm"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">성명</label>
					<div class="col-sm-3">
						<input type="text" name="name" class="form-control" placeholder="name" value='<c:out value="${row.name}"/>'/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">성별</label>
					<div class="col-sm-10">
						<c:set var="gender" value="${row.gender}"/>
							<input type="radio" name="gender" value="남" <c:if test="${gender.equals('남') }"> checked </c:if> /> 남 
							<input type="radio" name="gender" value="여" <c:if test="${gender.equals('여') }"> checked </c:if>/> 여 
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">생일</label>
					<div class="col-sm-4">
						<input type="text" name="birthyy" maxlength="4" placeholder="년도(4자)" size="6" value='<c:out value="${year}"/>'/>
						<select name="birthmm">
							<option value="" disabled="disabled">월</option>
							<option value="01" <c:if test="${month.equals('01') }"> selected </c:if>>1</option>
							<option value="02" <c:if test="${month.equals('02') }"> selected </c:if>>2</option>
							<option value="03" <c:if test="${month.equals('03') }"> selected </c:if>>3</option>
							<option value="04" <c:if test="${month.equals('04') }"> selected </c:if>>4</option>
							<option value="05" <c:if test="${month.equals('05') }"> selected </c:if>>5</option>
							<option value="06" <c:if test="${month.equals('06') }"> selected </c:if>>6</option>
							<option value="07" <c:if test="${month.equals('07') }"> selected </c:if>>7</option>
							<option value="08" <c:if test="${month.equals('08') }"> selected </c:if>>8</option>
							<option value="09" <c:if test="${month.equals('09') }"> selected </c:if>>9</option>
							<option value="10" <c:if test="${month.equals('10') }"> selected </c:if>>10</option>
							<option value="11" <c:if test="${month.equals('11') }"> selected </c:if>>11</option>
							<option value="12" <c:if test="${month.equals('12') }"> selected </c:if>>12</option>
						</select>
						<input type="text" name="birthdd" maxlength="2" placeholder="일" size="4" value='<c:out value="${day}"/>'>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">이메일</label>
					<div class="col-sm-10">
						<input type="text" name="mail1" maxlength="50" value='<c:out value="${mail1}"/>'/>@
						<select name="mail2">
							<option <c:if test="${mail2.equals('gmail.com')}">selected </c:if>>gmail.com</option>
							<option <c:if test="${mail2.equals('naver.com')}">selected </c:if>>naver.com</option>
							<option <c:if test="${mail2.equals('daum.net')}">selected </c:if>>daum.net</option>
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">전화번호</label>
					<div class="col-sm-3">
						<input type="text" name="phone" class="form-control" placeholder="phone" value='<c:out value="${row.phone}"/>'/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">주소</label>
					<div class="col-sm-5">
						<input type="text" name="address" class="form-control" placeholder="address" value="${row.address}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-primary" value="회원수정">
						<a href="#" class="btn btn-primary" onclick="chkDelete()">회원탈퇴</a>
					</div>
				</div>			
			</form>
		</div>
	</c:forEach>
	
	<hr>
	<jsp:include page="/footer.jsp"/>
</body>
</html>