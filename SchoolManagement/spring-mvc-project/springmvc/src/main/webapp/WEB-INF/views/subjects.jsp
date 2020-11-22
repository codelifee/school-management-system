<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

	
	<section class="container">
		
		<form method="get" action="/subjectSearch" class="form-inline mt-3">
			<input type="text" name="name" class="form-control mx-1 mx-2" placeholder="please type your name">
			
			<button type="submit" class="btn btn-primary mx-1 mt-2">search</button>
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="/subjectAdd">add</a>
		</form>
		
	</section>


<%@ include file="common/footer.jspf" %>