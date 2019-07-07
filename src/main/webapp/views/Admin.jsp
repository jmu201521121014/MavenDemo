<%@page import="org.apache.tools.ant.taskdefs.Length"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>管理员</title>
<link rel="stylesheet" type="text/css" href="../css/index.css" />
<script src="${APP_PATH }/scripts/jquery-1.7.1.js"></script>
<script type="text/javascript" src="../scripts/Admin.js"></script>
<script type="text/javascript" src="../scripts/newstu.js"></script>
<script type="text/javascript" src="../scripts/newtea.js"></script>
<style>
.show {
	text-align: center;
	background-color: #fff;
	border-radius: 20px;
	width: 300px;
	height: 350px;
	position: absolute;
	left: 10%;
	top: 10%;
	transform: translate(-50%, -50%);
}

.stu_show {
	background: #F1F1F1;
}

table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
	font-family: "楷体";
	font-size: 25px;
}
</style>

</head>


<body>
	<div class="navbar">
		<a href="#" onclick="exit()" class="right"
			style="font-family: 楷体; font-size: 20px;"><img class="img"
			src="../images/1103533.jpg" />注销</a>
	</div>

	<div class="row">
		<div class="side">
			<ul id="globalNav">
				<li><a href="#" onclick="showdivByfirst()"><img class="img"
						src="../images/1223065.jpg" />首页</a></li>
				<li><a href="#"><img class="img"
						src="../images/1225479.jpg" />用户管理</a>
					<ul>
						<li><a href="#" onclick="showdivByperInfo()"><img
								class="img" src="../images/1198581.jpg" />个人信息</a></li>
						<li><a href="#" onclick="showdivBypwd()"><img class="img"
								src="../images/1180833.jpg" />修改密码</a></li>
						<li><a href="#" onclick="showdivBystu()"><img class="img"
								src="../images/1178752.jpg" />学生管理</a></li>
						<li><a href="#" onclick="showdivBytea()"><img class="img"
								src="../images/1197297.jpg" />教师管理</a></li>
					</ul></li>
				<li><a href="#"><img class="img"
						src="../images/1191696.jpg" />课程管理</a>
					<ul>
						<li><a href="#" onclick="showdivBytask()"><img class="img"
								src="../images/1221614.jpg" />课题审核</a></li>
					</ul></li>

			</ul>
		</div>
		<div class="main" style="height: 600px;">
			<div id="wel">
				<h1>尊敬的用户：</h1>
				<h2>欢迎使用毕业设计选题系统</h2>
			</div>

			<div id="others" style="display:none;">
				<iframe id="ifrID" width="100%" height="600px" src="" frameborder=”no” ></iframe>
			</div>

		</div>

		<div class="footer">
			<h5>
				Capstone小组:姚泽玮，刘文彬，林宇涛
				</h2>
		</div>
</body>

</html>