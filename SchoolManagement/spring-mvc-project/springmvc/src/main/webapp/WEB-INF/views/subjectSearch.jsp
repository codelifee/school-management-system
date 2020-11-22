<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

	
	<section class="container">
		<form method="get" action="/subjectSearch" class="form-inline mt-3">
			<input type="text" name="search" class="form-control mx-1 mx-2" placeholder="please type your name">
			
			<button type="submit" class="btn btn-primary mx-1 mt-2">search</button>
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="/subjectAdd">add</a>
		</form>
	</section>
	
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>name</th>
					<th>subject</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${subjects}" var="subject">
					<tr>
						<td>${subject.getName()}</td>
						<td>${subject.getSubject()}</td>
						<td><a href="/subjectDelete?subject=${subject.getSubject()}" class="btn btn-danger"></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
	
	


<%@ include file="common/footer.jspf" %>