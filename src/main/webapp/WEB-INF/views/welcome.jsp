<%@include file="common/header.jsp" %>
<%@include file="common/navigation.jsp" %>
	<div class="container">
		<spring:message code="welcome.caption" /> ${name} and password is ${password }. <br/>
		Now, you can <a href="/list-todos">manage your todos.</a>
	</div>
<%@include file="common/footer.jsp" %>