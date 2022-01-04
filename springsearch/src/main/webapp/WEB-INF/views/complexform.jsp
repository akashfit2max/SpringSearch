<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="link.jsp"%>
<title>Hello, world!</title>
</head>
<body style="background: #e2e2e2">
	<div class="container mt-5 bg-light">
		<form class="py-5" action="processForm" method="post">
			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="name" placeholder="Email">
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="password" placeholder="Password">
				</div>
			</div>

			<div class="form-group row">
				<label for="inputdob" class="col-sm-2 col-form-label">DOB</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" placeholder="enter your DOB DD/MM/YY" name="dob">
				</div>
			</div>

			<div class="form-group row">
				<label for="input type" class="col-sm-2 col-form-label">Type</label> <select class="form-control" name="type">
					<option>one</option>
					<option>two</option>
				</select>
			</div>

			<div class="form-group row">
				<label for="i nput course" class="col-sm-2 col-form-label">Courses</label> <select multiple class="form-control"
					name="courses">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>

			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">Selet</legend>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
							<label class="form-check-label" for="gridRadios1"> First radio </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2"> <label
								class="form-check-label" for="gridRadios2"> Second radio </label>
						</div>
						<div class="form-check disabled">
							<input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" disabled>
							<label class="form-check-label" for="gridRadios3"> Third disabled radio </label>
						</div>
					</div>
				</div>
			</fieldset>

			<div class="card">
				<div class="card-body">
					<p>Your address</p>
					<div class="form-group">
						<input class="form-control" type="text" placeholder="your street" name="address.street">
					</div>
					<div class="form-group">
						<input class="form-control" type="text" placeholder="your city" name="address.city">
					</div>
				</div>
			</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10 text-center">
			<button type="submit" class="btn btn-primary">Sign in</button>
		</div>
	</div>
	</form>
	</div>
</body>
</html>