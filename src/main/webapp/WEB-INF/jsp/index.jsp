<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>       
        <br />
        <c:forEach var="dosen" items="${dosens}">    
            <br />
            ${dosen.kodedosen} <br />
            ${dosen.namadosen} <br />
            ${dosen.usia} <br />
            <a href="dosen/${dosen.kodedosen}">detail</a>
            <br />
            <hr />
        </c:forEach>

        <c:if test="${dosen != null}"> 
            <br />
            ${dosen.kodedosen} <br />
            ${dosen.namadosen} <br />
            ${dosen.usia} <br />
            <br />
            <hr />
        </c:if>

        <c:if test="${dosen == null}"> 
            <form method="POST" action="newdosen">
                <input type="test" name="kodedosen" />
                <input type="test" name="namadosen" />
                <input type="test" name="usia" />
                <input type="submit" />
            </form>
        </c:if>

    </body>
</html>
