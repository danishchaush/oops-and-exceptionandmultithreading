<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>this is output file</h1>
<!--   <h3> <%= request.getAttribute("name") %></h3>-->

<h2>	<%
	String f =  	request.getAttribute("name").toString();
out.println(f);

%>
</h2>
<p> 2*2=<%=  2*2%></p>
<p> 6>8= <%=  6>8%></p>

<%
 	for(int i=0;i<=5;i++)
 	{
 		out.println(i);
 	}
 		
%>
<%!

int callen(String string)
{
	return string.length();
}

%>
<p>
<%=callen("danish") %>
</p>

<h1> ${name } </h1>
 <h1> ${2+2 }</h1>
 <h1> ${2>1 }</h1>
 <h1> ${2<=1 }</h1>
 <h1> ${6 ge 6  ? "welcome" : "good bye" }</h1>
 <h1> ${6 le 6  ? "welcome" : "good bye" }</h1>
 <h1> ${name eq "danish" } </h1>
  <h2>${stu.name }</h2>
  <h4>${stu.age }</h4>
  <h4>${stu.location }</h4>
  <c:out value="b2 tech"></c:out>
  <c:set var="a" value="10"></c:set>
  <c:out value="${a }"></c:out>
  <c:set var="a" value="${10*2 }"></c:set>
  <c:out value="${a }"></c:out>
  <c:set var="a" value="${10*2 }"></c:set>
  
  <p>Before : <c:out value="${a }"></c:out>  </p>
  
  <c:remove var="a"/>
  
  
  <p>After : <c:out value="${a }"></c:out>  </p>
  
  
  <a href="<c:url value="/index.html"></c:url>">click here</a>
  
   <c:forEach items="${cou }" var="coun">
    <p>country =${coun }</p>
   </c:forEach>
	
	<c:forEach items="${list }" var="list">
    <p>name =${list.name }</p>
    <p>age =${list.age }</p>
    <p>location =${list.location }</p>
    
   </c:forEach>  
    <c:if test="${2000>4000 }">
    <p> this is true block   </p>
    </c:if>
    
    <c:if test="${6000>4000 }">
    <p> this is true block   </p>
    </c:if>
 	
 	<c:set value="70" var="score"></c:set> 
  
  	<c:choose>
  	<c:when test="${score>100 }">
  	<h1>score is greatean ${100 }</h1>
  	</c:when>
  	<c:otherwise>
  	<h1>score is lessthan </h1>
  	</c:otherwise>
  	</c:choose>
  
  
  <c:out value="${fn:toLowerCase('B2TECH') }"></c:out>
	<c:out value="${fn:toUpperCase('b2tech') }"></c:out>	  
  <c:out value="${fn:length('b2tech') }"></c:out>
  <c:out value="${fn:contains(' there b2tech there is ','b2tech') }"></c:out>
   <c:out value="${fn:indexOf(' there b2tech there is ','b2tech') }"></c:out>
 
 
</h1>
</body>
</html>