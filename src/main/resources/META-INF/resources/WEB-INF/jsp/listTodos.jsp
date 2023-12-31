<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>List Todos page</title>
	</head>
	<body>
		<div class="container">
			<div>Welcome to ToDoList, ${name}</div>
			<hr>
			<h1>Your Todos</h1>		
			<table class="table">
				<thead>
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<a href="add-todo" class="btn btn-success">Add Todo</a>
		</div>
		
		<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
		
	</body>
</html>