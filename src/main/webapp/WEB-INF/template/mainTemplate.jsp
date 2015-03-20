<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<s:url value="/assets/css/style.css" var="style_css" />
<link rel="stylesheet" type="text/css" href="${style_css}" />
<!-- <link href="<s:url value="/assets" />/css/styles.css"
	rel="stylesheet" type="text/css" /> -->


<html>
<head>
<title>main template</title>
</head>
<body>

<div id="header">

			<t:insertAttribute name="header" />
</div>



</body>
</html>