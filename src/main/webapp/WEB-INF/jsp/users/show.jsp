<%@ include file="../header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head lang="en">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8" />
    <title>Usuario - {user.firstName}</title>
</head>
<body>
<h1>Perfil do Usuario</h1>
<table>
    <td><b>Nome</b></td>
    <td><b>Sobrenome</b></td>
    <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
    </tr>
</table>
<%@ include file="../footer.jsp" %>