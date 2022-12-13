<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
  <h2>Contact Detail</h2>
 First Name: ${contact.firstName}<br>
 Last Name: ${contact.lastName}<br>
 Email: ${contact.email}<br>
 Mobile: ${contact.mobile}<br>
 Source: ${contact.source}<br>
 
 <form action="" method="">
    <input type="hidden" name="email" value="${contact.email}"> 
    <input type="submit" value="Send Email"> 
 </form>
 <form action="" method="">
  <input type="hidden" name="id" value="${contact.id}">
    <input type="submit" value="Convert"> 
 </form>

</body>
</html>