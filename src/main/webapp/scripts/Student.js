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
	var tree = document.getElementById(t); //閻㈢喐鍨氶弽锟�
	tree.style.display = "none"; //鐠佸墽鐤嗛弽宄扮础娑撴椽娈ｉ挊蹇撹埌瀵骏绱濇稉宥嗘▔缁�锟�
	var lis = tree.getElementsByTagName("li");
	for (var i = 0; i < lis.length; i++) { //閸欐牕鍤稉鏄忣洣閻ㄥ嫬顕遍懜顏呯埉
		lis[i].id = "li" + i;
		var uls = lis[i].getElementsByTagName("ul"); //鐎涙劕顕遍懜顏呯埉
		if (uls.length != 0) {
			uls[0].id = "ul" + i;
			uls[0].style.display = "none";
			var as = lis[i].getElementsByTagName("a"); //鐎涙劕顕遍懜顏呯埉閻ㄥ嫬鍞寸�癸拷
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
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");

	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");


	$.ajax({
	    type: 'POST',
	    url: '/showSingleStudent',
	    success: function (res) {
	        if(res.success){
	        	document.getElementById("ifrID").src = "/views/StudentInfo.jsp";
	        }else{
	        	document.getElementById("ifrID").src = "/views/StudentInfo.jsp";
	        }
	    },
	    error: function(data) {
	    	document.getElementById("ifrID").src = "/views/StudentInfo.jsp";
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

function showdivBychoose() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");

	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showTaskApplyState2',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/StuChooseTask.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/StuChooseTask.jsp";
			}
		},
		error : function(data) {
			alert('连接超时！');
			document.getElementById("ifrID").src = "/views/StuChooseTask.jsp";
		}
	});
}

function showdivByunpass() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");

	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
}

function showdivBychooseAndTeacher() {
	var TeacherName = $("#TeacherName").val();
	$.ajax({
		type : 'POST',
		url : '/showTaskByTeacherName',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				TeacherName : TeacherName
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID1").src = "/views/StuShowChooseTask.jsp";
			} else {
				document.getElementById("ifrID1").src = "/views/StuShowChooseTask.jsp";
			}
		},
		error : function(data) {
			alert('连接超时！');
			document.getElementById("ifrID1").src = "/views/StuShowChooseTask.jsp";
		}
	});
}

function showdivBymytask() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");

	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	$.ajax({
		type : 'POST',
		url : '/showStudentChoosed',
		success : function(res) {
			if (res.success) {
				document.getElementById("ifrID").src = "/views/StuChoosedTask.jsp";
			} else {
				document.getElementById("ifrID").src = "/views/StuChoosedTask.jsp";
			}
		},
		error : function(data) {
			alert('连接超时！');
			document.getElementById("ifrID").src = "/views/StuChoosedTask.jsp";
		}
	});
}

function chooseTaskValidate(taskId) {
	checkChooseTask();
	function chooseTask() {
		$.ajax({
			type : 'POST',
			url : '/chooseTask',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskId : taskId,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("申请成功");
					window.parent.document.getElementById("ifrID1").src = "/views/StuShowChooseTask.jsp";
				} else {
					alert("申请失败,该课题状态发生改变");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	
	function checkChooseTask() {
		$.ajax({
			type : 'POST',
			url : '/checkChooseTask',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskId : taskId,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					chooseTask();
				} else {
					alert("申请失败,你已有课题成功申请");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
}

function showdivByMyApply() {
	var doc = document;
	var div1 = doc.getElementById("wel");
	var div2 = doc.getElementById("others");
	div1.setAttribute("style", "display: none;");
	div2.setAttribute("style", "display");
	document.getElementById("ifrID").src = "/views/StuMyApply.jsp";
}

function selectStuMyApply(chooseState) {
	$.ajax({
		type : 'POST',
		url : '/showdivByMyApply',
		contentType : 'application/json',
		data : JSON.stringify({
			params : {
				chooseState : chooseState,
			}
		}),
		dataType : 'json',
		success : function(res) {
			if (res.success) {
				if (chooseState == 0)
					document.getElementById("ifrID1").src = "/views/StuMyApply0.jsp";
				else
					document.getElementById("ifrID1").src = "/views/StuMyApply-1.jsp";
			}
		}
	});
}

function changeMyTaskValidate(taskId,chooseState) {
	checkChangeTask();
	function changeTask() {
		$.ajax({
			type : 'POST',
			url : '/changeMyTask',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskId : taskId,
					chooseState : chooseState,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					alert("申请成功");
					if (chooseState == 0)
						window.parent.document.getElementById("ifrID1").src = "/views/StuMyApply0.jsp";
					else
						window.parent.document.getElementById("ifrID1").src = "/views/StuMyApply-1.jsp";
				} else {
					alert("申请失败,该课题状态发生改变");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
	
	function checkChangeTask() {
		$.ajax({
			type : 'POST',
			url : '/checkChooseTask',
			contentType : 'application/json',
			data : JSON.stringify({
				params : {
					taskId : taskId,
				}
			}),
			dataType : 'json',
			success : function(res) {
				if (res.success) {
					changeTask();
				} else {
					alert("申请失败,你已有课题成功申请");
				}
			},
			error : function(data) {
				alert('连接超时！');
			}
		});
	}
}