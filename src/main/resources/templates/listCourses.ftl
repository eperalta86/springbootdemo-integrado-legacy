<!DOCTYPE HTML>
<head>
<title>Hello</title>
<title>Spring Boot Cheat-Sheet</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Required tags for bootstrap -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/starter-template.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/popper.js"></script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
</head>
	<body>
		<div class="container-fluid">
			<table class="table">
				<thead>
					<tr class="d-flex">
						<th scope="col" class="col-6">Title</th>
						<th scope="col" class="col-2">Duration</th>
						<th scope="col" class="col-2">Cost</th>
						<th scope="col" class="col-2">Operations</th>
						
					</tr>
				</thead>
				<tbody>
					<#list courseList as course>
					<tr class="d-flex">
						<td class="col-6">${course.title}</td>
						<td class="col-2">${course.duration}</td>
						<td class="col-2">${course.cost}</td>
						<td class="col-2">
							<button type="button" class="btn btn-warning">Modify</button>
							<button type="button" class="btn btn-danger">Delete</button>
						</td>
					</tr>
					</#list>
				</tbody>
			</table>
			<button type="button" class="btn btn-primary">Back</button>
		</div>
	</body>
</html>