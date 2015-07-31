<%@ include file="../header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head lang="en">
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta charset="UTF-8" />
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Indice de usuarios</h1>
        <table>
            <td><b>Nome</b></td>
            <td><b>Sobrenome</b></td>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><a href="/users/${user.id}">${user.firstName}</a></td>
                    <td>${user.lastName}</td>
                </tr>
            </c:forEach>
        </table>
<%@ include file="../footer.jsp" %>