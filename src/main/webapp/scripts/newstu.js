
function show() {
	var div=document.getElementById("background");
	div.setAttribute("style","display: block;");
//	div.style.display = "block";
}
 
function closex() {
	//event.stopPropagation();
	document.getElementById("c").reset();
	var div=document.getElementById("background");
	div.setAttribute("style","display: none;");
//	div.style.display = "none";
}
 
window.onclick = function close(e) {
	var div=document.getElementById("background");
	if (e.target == div) {
		div.getAttribute("style","disply:none");
//		div.style.display = "none";
	}
}
