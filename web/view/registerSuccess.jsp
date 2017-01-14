<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2017. 1. 14.
  Time: 오후 6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Success</title>
</head>
<body>
    <h1> Your registered successfully. </h1>

    <ul>
        <li>ID: ${customer.id} </li>
        <li>password: ${customer.password} </li>
        <li>gender: ${customer.gender} </li>
        <li>Name: ${customer.name} </li>
        <li>Email: ${customer.email} </li>
    </ul>
</body>
</html>
