<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>教学辅助系统</title>
<link rel="stylesheet" type="text/css" href="${APP_PATH}/css/login.css" />
<script src="../scripts/jquery-1.7.1.js"></script>
</head>
<body>
	<div id="login_center">
		<div id="login_area">
			<div id="login_box" style="background: url('../images/background.jpg') 0px 0px no-repeat;">
				<div id="login_form">
					<form method="post" name="loginForm" id="a">
						<input type="hidden" name="type" id="type">
						<table>
							<div id="login_tip">
								<tr style="padding: 5px">
									<td style="line-height: 10px">账号: &nbsp</td>
									<td ><input type="text" name="userName" class="userName" required></td>
								</tr>
								<tr>
									<td>密码: &nbsp</td>
									<td><input type="password" name="userPas" class="userPas" required></td>
								</tr>
								<tr>
									<td>角色: &nbsp</td>
									<td>
										<select name="role" id="role">
											<option value="0">管理员</option>
											<option value="1">教师</option>
											<option value="2">学生</option>
										</select>
									</td>
								</tr>
							</div>
						</table>
						</br>
						<text>&nbsp&nbsp&nbsp</text>
						<input type="button" value="登录" class="login_btn"  onclick="loginValidate()">
						<text>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</text>
						<input type="reset" class="login_btn" value="重 置">
					</form>
				</div>
			</div>
		</div>
	</div>	
</body>

<script>
function loginValidate() {
	var role = parseInt(document.getElementById("role").value);
        $.ajax({
            type: 'POST',
            url: '../loginForm',
            data: $("#a").serialize(),
            dataType: 'json',
            success: function (res) {
                if(res.success){
                	if(role==0)
                		window.open('../views/Admin.jsp','_self');
                	else if(role==1)
                		window.open('../views/Teacher.jsp','_self');
                	else
                		window.open('../views/Student.jsp','_self');
                }else{
                	alert("账号或密码错误");
                }
            },
            error: function(data) {
				alert('连接超时！');
			}
        });
}
</script>
</html>