<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询成绩</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('#sb').on('click', function() {
		var studentName = $('#studentName').val();
		var courseName = $('#courseName').val();
		alert(studentName);
		alert(courseName);
		$.ajax({
			url: 'fraction/selectScore',
			type: 'POST',
			data: {
				studentName:studentName,
				 courseName:courseName
			},
			dataType: 'json',
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
		
		
		<div>
		<label>学生姓名:</label>
		<input type="text" id="studentName">
		</div>
		
		<div>
		<label>课程名称:</label>
		<input type="text" id="courseName">
		</div>
		
		<div>
		<input type="button" id="sb"  value="确认" > 
		</div>
		
		<div>
		<label>学生成绩:</label>
		<input type="text" name="score" id="score">
		</div>

</body>
</html>