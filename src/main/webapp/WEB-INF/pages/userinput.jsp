<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
<form method="get" action="logincheck">
<div>
<span>Mobile No </span>
<input name="mobileno" type="number" />
</div>
<div>
<span>Password</span>
<input name="password" type="password" />
</div>
<input type="submit" value="Log in"/>
</form>
</body>
</html>