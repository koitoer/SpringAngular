<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2>Contact Manager</h2>
<form:form method="post" action="${flowExecutionUrl}">


			 <button type="submit" name="_eventId_proceed">ContactInfo</button>
			 <a href="${flowExecutionUrl}&_eventId_proceed">Contact</a>
	
	
</form:form>
