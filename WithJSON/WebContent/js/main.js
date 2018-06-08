// JavaScript Document

var xhr = new XMLHttpRequest();
xhr.open("GET", "data.json", true);
xhr.send();
xhr.onreadystatechange = function()
{
	console.log(xhr.readyState);
	console.log(xhr.status);
	
}
xhr.onload = function()
{
	var data = JSON.parse(xhr.responseText);
	console.log(sata.first);
	console.log(data.last);
	console.log(data.served);
}


