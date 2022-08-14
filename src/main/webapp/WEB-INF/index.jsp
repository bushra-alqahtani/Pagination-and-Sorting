<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
h1{
 font-family: "Lucida Console", "Courier New", monospace;;

}

</style>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

	<div class="container text-center mt-5">
		<h1>all ninjas in <c:out value="${dojo.id}"/></h1><br>
		

			
		
		<table class="table mt-5">
	
			<thead>
				<th>Dojo id -</th>
				<th>Ninja First Name -</th>
				<th>Ninja Last Name</th>
				
			</thead>
			<tbody>
				<c:forEach var="i" items="${dojo.ninjas}">
					<tr>
						<td><c:out value="${i.dojo.id}" /></td>
						<td><c:out value="${i.firstName }" /></td>
						<td><c:out value="${i.lastName}" /></td>
						
					</tr>
				</c:forEach>
				
			</tbody>
		</table>

	</div>
</body>
</html>