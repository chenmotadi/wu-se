<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('#sb').on('click', function() {
		var studentName = $('#student').val();
		var courseName = $('#course').val();
		alert(studentName);
		alert(courseName);
		$.ajax({
			url: '../fraction/selectScore',
			type: 'POST',
			data: {
				studentName:studentName,
				 courseName:courseName
			},
			dataType: 'text',
			success: function(data) {
					if(data==""){
	   					$('#score').val('暂无成绩');
	   				 } 
	   				if(data==null){
		   				$('#score').val('缺考');
	   				}else {
	   					$('#score').val(data);
	   				}
					
			}
		});
	});
});
</script>

</head>
<body>

	<h3>学生姓名</h3><input type="text" id="student">
	<h3>课程名称</h3><input type="text" id="course">
	<input type="button" id="sb" value="确认"> 
	<h3>学生成绩</h3><input type="text" id="score">
</body>
</html>