<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf"%>
        <h1>Home</h1>
        <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			 
			<button type="button" class="btn btn-primary btn-lg btn-block active">
				<a href="customer.jsp">Clientes</a>
			</button> 
			<button type="button" class="btn btn-primary btn-lg btn-block active">
				<a href="manufacturer.jsp">Fabricantes</a>
			</button>
			
		</div>
	</div>
</div>
    </body>
</html>
