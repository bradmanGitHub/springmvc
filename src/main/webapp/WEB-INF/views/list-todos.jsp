<%@include file="common/header.jsp" %>
<%@include file="common/navigation.jsp" %>

	<div class="container">
		<table class="table">
			<caption><spring:message code="todo.caption" /></caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Complete?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}" /></td>
						<td>${todo.done}</td>
						<td>
							<a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>
							<a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		Your Todos are <br>

		</form>
		<BR> 
	
		<a class="btn btn-success" href="/add-todo">Add</a>
		
	</div>
<%@include file="common/footer.jsp" %>	