<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<t:insertDefinition name="template"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
	Greeting : ${greeting} <br>
	Name: ${name.name}
</body>
</html>