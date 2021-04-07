<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/7/2021
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TODO App</title>
</head>
<body>
    <script>
        fetch('http://localhost:8080/api/v1/todos')
            .then(res => res.json())
            .then(data => console.log(data))
    </script>
</body>
</html>
