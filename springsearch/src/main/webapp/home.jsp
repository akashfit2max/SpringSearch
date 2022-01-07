<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="link.jsp"%>
<title>Hello, world!</title>
</head>
<body>
	<h1 class="mt-4 text-center" style="font-family: 'Anton', sans-serif; letter-spacing: 3px">SEARCH IT !</h1>
	<div class="container mt-4">
		<div class="card mx-auto mt-5 bg-light" style="width: 50%">
			<div class="card-body py-5">
				<form action="dosearch">
					<div class="form-group">
						<input type="text" class="form-control" name="query" placeholder="Enter your keyword">
					</div>

					<div class="container text-center">
						<button type="submit" class="btn btn-outline-success">Submit</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>