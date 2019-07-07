function checkStuInfo(userId) {
	var div = document.getElementById("background");
	$
			.ajax({
				type : 'POST',
				url : '/showStuInfo',
				contentType : 'application/json',
				data : JSON.stringify({
					params : {
						userId : userId
					}
				}),
				dataType : 'json',
				success : function(res) {
					if (res.success) {
						div.setAttribute("style", "display: block;");
						document.getElementById("ifrID3").src = "/views/TeaCheckStuInfo.jsp";
					}
				}
			});
}

function updateTaskValidate(taskId, applyState) {
	var taskName = $("#taskName").val();
	var sort = $("#taskSort").val();
	var text = $("#taskText").val();
	function updateTask() {
		$
				.ajax({
					type : 'POST',
					url : '/updateTask',
					contentType : 'application/json',
					data : JSON.stringify({
						params : {
							taskId : taskId,
							taskName : taskName,
							sort : sort,
							text : text,
							applyState : applyState
						}
					}),
					dataType : 'json',
					success : function(res) {
						if (res.success) {
							alert("保存成功");
							window.parent.document.getElementById("background")
									.setAttribute("style", "display: none;");
							window.parent.window.parent.document
									.getElementById("ifrID1").src = "/views/ShowNoApplyTask.jsp";
						}
					}
				});
	}
	if (taskName == "")
		alert("题目不能为空");
	else if (sort == "")
		alert("类别不能为空");
	else if (text == "")
		alert("简介不能为空");
	else
		updateTask();
}

function changeTaskState(taskId, oldapplyState, applyState) {
	$
			.ajax({
				type : 'POST',
				url : '/changeTaskState',
				contentType : 'application/json',
				data : JSON.stringify({
					params : {
						taskId : taskId,
						oldapplyState : oldapplyState,
						applyState : applyState
					}
				}),
				dataType : 'json',
				success : function(res) {
					if (res.success) {
						if (oldapplyState == 0) {
							alert("申请成功");
							window.parent.document.getElementById("ifrID1").src = "/views/ShowNoApplyTask.jsp";
						}

						else if (oldapplyState == 1) {
							alert("撤回成功");
							window.parent.document.getElementById("ifrID1").src = "/views/ShowApplyingTask.jsp";
						}
					}
				}
			});
}

function editTask(taskId) {
	$.ajax({
		type : 'POST',
		url : '/showSingleTask',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				taskId : taskId
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("background").setAttribute("style",
						"display: block;");
				document.getElementById("ifrID2").src = "/views/EditTask.jsp";
			}
		}
	});
}

function selectTask(applyState) {
	$
			.ajax({
				type : 'POST',
				url : '/teacherSelectPartTask',
				contentType : 'application/json',
				data : JSON.stringify({
					params : {
						applyState : applyState
					}
				}),
				dataType : 'json',
				success : function(res) {
					if (res.success) {
						if (applyState == 0)
							document.getElementById("ifrID1").src = "/views/ShowNoApplyTask.jsp";
						else if (applyState == 1)
							document.getElementById("ifrID1").src = "/views/ShowApplyingTask.jsp";
						else
							document.getElementById("ifrID1").src = "/views/ShowApplyedTask.jsp";
					}
				}
			});
}

function addNewTaskValidate(applyState) {
	var taskName = $("#taskName").val();
	var sort = $("#sort").val();
	var text = $("#text").val();
	function addNewTask() {
		$.ajax({
			type : 'POST',
			url : '/addNewTask',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskName : taskName,
					sort : sort,
					applyState : applyState,
					text : text,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					if (applyState == 1)
						alert("申请成功");
					else
						alert("保存成功");
					document.getElementById("addTask").reset();
				} else {
					alert("添加失败");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	if (taskName == "")
		alert("题目不能为空");
	else if (sort == "")
		alert("类别不能为空");
	else if (text == "")
		alert("简介不能为空");
	else
		addNewTask();
}

function closex() {
	var div = document.getElementById("background");
	div.setAttribute("style", "display: none;");
}

function updatePwdValidate(oldpwd) {
	var pwd1 = $("#pwd1").val();
	var pwd2 = $("#pwd2").val();
	var pwd = $("#oldpwd").val();
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

function exit() {
	var flag = confirm("确认注销么？");
	if (flag) {
		$.ajax({
			type : 'POST',
			url : '/exit',
			success : function(res) {
				if (res.success) {
					window.open('/login', '_self');
				} else {
					window.open('/login', '_self');
				}
			},
			error : function(data) {
				window.open('/login', '_self');
			}
		});
	}
}

function initTree(t) {
	var tree = document.getElementById(t); // 閻㈢喐鍨氶弽锟�
	tree.style.display = "none"; // 鐠佸墽鐤嗛弽宄扮础娑撴椽娈ｉ挊蹇撹埌瀵骏绱濇稉宥嗘▔缁�锟�
	var lis = tree.getElementsByTagName("li");
	for (var i = 0; i < lis.length; i++) { // 閸欐牕鍤稉鏄忣洣閻ㄥ嫬顕遍懜顏呯埉
		lis[i].id = "li" + i;
		var uls = lis[i].getElementsByTagName("ul"); // 鐎涙劕顕遍懜顏呯埉
		if (uls.length != 0) {
			uls[0].id = "ul" + i;
			uls[0].style.display = "none";
			var as = lis[i].getElementsByTagName("a"); // 鐎涙劕顕遍懜顏呯埉閻ㄥ嫬鍞寸�癸拷
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
	if (t.style.display == "block") { // 閻愮懓鍤稉锟芥禍娑樼潔瀵拷閿涘苯鍟�閻愮懓鍤稉锟芥稉瀣閸欙拷
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
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$
			.ajax({
				type : 'POST',
				url : '/showSingleTeacher',
				success : function(res) {
					if (res.success) {
						document.getElementById("ifrID").src = "/views/TeacherInfo.jsp";
					} else {
						document.getElementById("ifrID").src = "/views/TeacherInfo.jsp";
					}
				},
				error : function(data) {
					document.getElementById("ifrID").src = "/views/TeacherInfo.jsp";
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

function showdivMytask() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	document.getElementById("ifrID").src = "/views/TeaTask.jsp";
}

function showdivByteasub() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	document.getElementById("ifrID").src = "/views/TeaSub.jsp";
}

function showdivBypass() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showPartTaskChoose',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				chooseState : 1,
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/TeaPass.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/TeaPass.jsp";
			}
		},
		error : function(data) {
			alert('连接超时！');
		}
	});
}

function showdivByunpass() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showPartTaskChoose',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				chooseState : 0,
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/TeaUnpass.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/TeaUnpass.jsp";
			}
		},
		error : function(data) {
			alert('连接超时！');
		}
	});
}

function PassTaskChooseValidate(taskId, stuId, chooseState) {
	PassTaskChoose();
	function PassTaskChoose() {
		$
				.ajax({
					type : 'POST',
					url : '/passTaskChoose',
					contentType : 'application/json',
					data : JSON.stringify({
						params : {
							taskId : taskId,
							stuId : stuId,
							chooseState : chooseState,
						}
					}),
					dataType : 'json',
					success : function(res) {
						if (res.success) {
							alert("审批成功");
							window.parent.document.getElementById("ifrID").src = "/views/TeaUnpass.jsp";
						} else {
							alert("审批失败,该申请状态已更改");
							window.parent.document.getElementById("ifrID").src = "/views/TeaUnpass.jsp";
						}
					},
					error : function(data) {
						alert('连接超时！');
						window.parent.document.getElementById("ifrID").src = "/views/TeaUnpass.jsp";
					}
				});
	}
}
