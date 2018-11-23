<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyProject</title>
</head>
<body bgcolor="yellow">
<h2>CI Demo</h2>
<form method="get" action="./CalculatorServlet">
Argument 1: <input type="text" name="txt1"><br>
Argument 2: <input type="text" name="txt2"><br>
Choose your Calculation:
<select name="choice">
<option value="add">Add</option>
<option value="sub">Sub</option>
<option value="mul">Mul</option>
<option value="div">Div</option>
</select>
<br>
<input type="submit" value ="Calculate">
</form>
</body>
</html>
