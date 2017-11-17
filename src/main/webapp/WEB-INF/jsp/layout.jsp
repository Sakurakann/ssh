<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/16 0016
  Time: 08:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <tiles:insertAttribute name="left"/>
</div>
<div>
    <tiles:insertAttribute name="right"/>
</div>
<div>
    <tiles:insertAttribute name="bottom"/>
</div>

</body>
</html>
