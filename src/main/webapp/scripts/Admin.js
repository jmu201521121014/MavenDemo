

function exit()
{
	var flag = confirm("确认注销么？");
	if (flag) {
		$.ajax({
			type : 'POST',
			url : '/exit',
			success : function(res) {
				if (res.success) {
					window.open('/login','_self');
				} else {
					window.open('/login','_self');
				}
			},
			error : function(data) {
				window.open('/login','_self');
			}
		});
	}
}

function deleteStudentConfirm(stuId, userId) {
	var flag = confirm("确认删除该学生么？");
	function deleteStudent() {
		$.ajax({
			type : 'POST',
			url : '/deleteStudent',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					stuId : stuId,
					userId : userId
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("删除成功");
					window.parent.document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
				} else {
					alert("删除失败,该学生还有课题");
					window.parent.document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
				}
			},
			error : function(data) {
				alert('连接超时！');
				window.parent.document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
			}
		});
	}
	if (flag) {
		deleteStudent();
	}
}

function addStudentValidate() {
	var stuuserName = $("#stuuserName").val();
	var stupwd = $("#stupwd").val();
	var stumajorId = $("#stumajorId").val();
	var stuname = $("#stuname").val();
	var stuphone = $("#stuphone").val();
	var stuaddress = $("#stuaddress").val();
	var stusex = $("#stusex").val();
	function addStudent() {
		$.ajax({
			type : 'POST',
			url : '/addNewStudent',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					stuuserName : stuuserName,
					stupwd : stupwd,
					stumajorId : stumajorId,
					stuname : stuname,
					stuphone : stuphone,
					stuaddress : stuaddress,
					stusex : stusex,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("添加成功");
					document.getElementById("c").reset();
					document.getElementById("background").setAttribute("style",
							"display: none;");
					document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
				} else {
					alert("添加失败,该用户名已经存在");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	if (stuname == "")
		alert("姓名不能为空");
	else if (stupwd.length < 6)
		alert("密码长度不能低于6位");
	else if (stupwd == "")
		alert("密码不能为空");
	else if (stuphone != "" && stuphone.length != 11)
		alert("电话必须为11位");
	else {
		addStudent();
	}
}

function addTeacherValidate() {
	var userName = $("#userName").val();
	var pwd = $("#pwd").val();
	var majorId = $("#majorId").val();
	var name = $("#name").val();
	var teacherTitle = $("#teacherTitle").val();
	var isexternal = (document.getElementById("isexternal").value);
	var phone = $("#phone").val();
	var address = $("#address").val();
	var sex = (document.getElementById("sex").value);
	function addTeacher() {
		$.ajax({
			type : 'POST',
			url : '/addNewTeacher',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					userName : userName,
					pwd : pwd,
					majorId : majorId,
					name : name,
					teacherTitle : teacherTitle,
					isexternal : isexternal,
					phone : phone,
					address : address,
					sex : sex,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("添加成功");
					document.getElementById("b").reset();
					document.getElementById("background2").setAttribute(
							"style", "display: none;");
					document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
				} else {
					alert("添加失败,该用户名已经存在");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	if (name == "")
		alert("姓名不能为空");
	else if (pwd.length < 6)
		alert("密码长度不能低于6位");
	else if (pwd == "")
		alert("密码不能为空");
	else if (phone != "" && phone.length != 11)
		alert("电话必须为11位");
	else {
		addTeacher();
	}
}

function deleteTeacherConfirm(teacherId, userId) {
	var flag = confirm("确认删除该老师么？");
	//document.getElementById("ifrID1").src = "";
	function deleteTeacher() {
		$.ajax({
			type : 'POST',
			url : '/deleteTeacher',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					teacherId : teacherId,
					userId : userId
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("删除成功");
					window.parent.document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
				} else {
					alert("删除失败，该老师还有课");
					window.parent.document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
				}
			},
			error : function(data) {
				alert('连接超时！');
				window.parent.document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
			}
		});
	}
	if (flag) {
		deleteTeacher();
	}
}

function updatePwdValidate(oldpwd) {
	var pwd1 = $("#pwd1").val();
	var pwd2 = $("#pwd2").val();
	var pwd= $("#oldpwd").val();
	function updatePwd() {
		$.ajax({
			type : 'POST',
			url : '/updatePwd',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					pwd : pwd1,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("修改成功");
					document.getElementById("updatePwd").reset();
				} else {
					alert("修改失败");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	if (pwd1.length < 6 || pwd2.length < 6)
		alert("密码长度不能低于6位");
	else if (pwd1 != pwd2)
		alert("两次密码不一致");
	else if (pwd != oldpwd)
		alert("旧密码错误");
	else
		updatePwd();
}

function initTree(t) {
	var tree = document.getElementById(t);
	tree.style.display = "none";
	var lis = tree.getElementsByTagName("li");
	for (var i = 0; i < lis.length; i++) {
		lis[i].id = "li" + i;
		var uls = lis[i].getElementsByTagName("ul");
		if (uls.length != 0) {
			uls[0].id = "ul" + i;
			uls[0].style.display = "none";
			var as = lis[i].getElementsByTagName("a");
			as[0].id = "a" + i;
			as[0].className = "folder";
			as[0].href = "#this";
			as[0].tget = uls[0];
			as[0].onclick = function() {
				openTag(this, this.tget);
			}
		}
	}
	tree.style.display = "block";
}

function openTag(a, t) {
	if (t.style.display == "block") { //閻愮懓鍤稉锟芥禍娑樼潔瀵拷閿涘苯鍟�閻愮懓鍤稉锟芥稉瀣閸欙拷
		t.style.display = "none";
		a.className = "folder";
	} else {
		t.style.display = "block";
		a.className = "";
	}
}

window.onload = function() {
	initTree("globalNav");
}

function showdivByfirst() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display");
	div2.setAttribute("style", "display: none;");
	document.getElementById("ifrID").src = "";

}

function showdivByperInfo() {
	//document.getElementById("ifrID").src = "";
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showSingleAdmin',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/AdminInfo.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/AdminInfo.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID").src = "/views/AdminInfo.jsp";
		}
	});
	
	
}

function showdivBypwd() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	
	document.getElementById("ifrID").src = "/views/UpdatePwd.jsp";
}

function showdivBystu() {
	//document.getElementById("ifrID").src = "";
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showAllMajor',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/StuManage.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/StuManage.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID").src = "/views/StuManage.jsp";
		}
	});
	
	
}

function showdivBytea() {
	//document.getElementById("ifrID").src = "";
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showAllMajor',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/TeaManage.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/TeaManage.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID").src = "/views/TeaManage.jsp";
		}
	});
}

function selectTea() {
	var steaName = $("#steaName").val();
	var steaJob = $("#steaJob").val();
	var ssex = $("#ssex").val();
	var smajorId = $("#smajorId").val();
	$.ajax({
		type : 'POST',
		url : '/showPartTeacher',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				steaName : steaName,
				steaJob : steaJob,
				ssex : ssex,
				smajorId : smajorId,
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
			} else {
				document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID1").src = "/views/ShowTea.jsp";
		}
	});
}

function selectStu() {
	var stuName = $("#sstuName").val();
	var stusex = $("#sstusex").val();
	var stumajorId = $("#sstumajorId").val();
	$.ajax({
		type : 'POST',
		url : '/showPartStudent',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				stuName : stuName,
				stusex : stusex,
				stumajorId : stumajorId,
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
			} else {
				document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID1").src = "/views/ShowStu.jsp";
		}
	});
}

function showdivBytask(){
	var doc=document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	
	$.ajax({
		type : 'POST',
		url : '/showTaskApplyState1',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
			}
		},
		error : function(data) {
			document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
		}
	});
	
}

function checkTaskApplyState(taskId, applyState) {
	checkTask();
	function checkTask() {
		$.ajax({
			type : 'POST',
			url : '/checkTaskApplyState',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskId : taskId,
					applyState : applyState
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("审批成功");
					window.parent.document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
				} else {
					alert("审批失败,该课题状态已更改");
					window.parent.document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
				}
			},
			error : function(data) {
				alert('连接超时！');
				window.parent.document.getElementById("ifrID").src = "/views/TaskApplyState1.jsp";
			}
		});
	}
}
