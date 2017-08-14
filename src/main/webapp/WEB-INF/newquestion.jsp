<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>New Question</title>
</head>
<body>
	<h1>What is your question?</h1>
	
	<form:form method="POST" action="/questions/new" modelAttribute="q">
	    <form:label path="question">Question: 
	    <br>
	    <form:errors path="question"/>
	    <form:textarea path="question"/></form:label>
	    
	    <br><br>
	    
	    <form:label path="tags">Tags: 
	    <form:errors path="tags"/>
	    <form:input path="tags"/></form:label>
	    
	    <br><br>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>