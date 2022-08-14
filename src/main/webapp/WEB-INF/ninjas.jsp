<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas at <c:out value="${dojo.name }" />
</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
h1{
 font-family: "Lucida Console", "Courier New", monospace;;

}

</style>
</head>
<body >
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

	<div class="container text-center mt-5">
		<div id="ninjas">
		    <h1>Ninjas</h1>
		    
		    <!--for loop to create all the links-->
		    <c:forEach begin="1" end="${totalPages}" var="index">
		        <a href="/ninjas/pages/${index}">${index}</a>
		    </c:forEach>
		    <table class="table">
		        <thead>
		        	<th>dojo name</th>
		            <th>First Name</th>
		            <th>Last Name</th>
		        </thead>
		        <tbody>
		            <!--  we have to call the .content method to actually get the ninjas inside the Page iterable.-->
		            <c:forEach var="ninja" items="${ninjas.content}">                 
		            <tr>
		            	<td><a href="/dojos/${ninja.dojo.id}"><c:out value="${ninja.dojo.name}"></c:out></a></td>
		                <td><c:out value="${ninja.firstName}"></c:out></td>
		                <td><c:out value="${ninja.lastName}"></c:out></td>
		            </tr>
		            </c:forEach>
		        </tbody>
		    </table>
		</div>

	</div>
</body>
</html>