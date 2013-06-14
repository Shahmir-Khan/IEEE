<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%= request.getContextPath() %>/css/base.css" rel="stylesheet" type="text/css" />
<title>Course Registration System</title>
</head>
<body>
	<div id="container">
	  	<div id="header">
	  		<jsp:include page="template/LoginBar.jsp" flush="true" />
	  		<jsp:include page="template/Header.jsp" flush="true" />  		
	    </div>   
	    <div id="page">
	    	<div id="content">
				<div id="page_header">IEEE Project Competitions</div>							
				<div id="page_inner">
				</div>
			</div>
	    </div>
	</div>
</body>
</html>