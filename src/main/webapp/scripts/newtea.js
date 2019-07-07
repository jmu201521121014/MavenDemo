
function show1() {
	var div=document.getElementById("background2");
	div.setAttribute("style","display: block;");
//	div.style.display = "block";
}
 
function closex1() {
	//event.stopPropagation();
	document.getElementById("b").reset();
	var div=document.getElementById("background2");
	div.setAttribute("style","display: none;");
	
//	div.style.display = "none";
}
 
window.onclick = function close(e) {
	var div=document.getElementById("background2");
	if (e.target == div) {
		div.getAttribute("style","disply:none");
//		div.style.display = "none";
	}
}
