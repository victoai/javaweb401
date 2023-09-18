<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<script>

 
 function a(){	
     let item={ price: "2500"};
	 let price = `<%= "${item.price}" %>`;
	 alert( price);
	 
 }
 
 

</script>

<button onclick="a()"> 클릭</button>
</body>
</html>