/*
 * set operation,check result,clear,trebuie sa luam elementul html care reprezinta  si sa setam in value valoarea primita de noi 
 */

function setOperation(signParameter) {

	document.getElementById("symbol").value = signParameter;

	// alert("Ai apelat metoda setOperation");
}

function checkResult() {

	var firstParam = document.getElementById("firstParam").value;
	var secondParam = document.getElementById("secondParam").value;
	var symbol = document.getElementById("symbol").value;

	var rez = 0;
	if (symbol == "+") {
		rez = firstParam + secondParam;

	}
	if (symbol == "-") {
		rez = firstParam - secondParam;

	}
	if (symbol == "/") {
		rez = firstParam / secondParam;

	}
	if (symbol == "*") {
		rez = firstParam * secondParam;

	}
	if (symbol == "^") {

		rez = 1;

		for (var i = 1; i <= secondParam; i++) {

			rez = rez * firstParam;

		}
		document.getElementById("result").value = rez;
		// alert("Ai apelat functia checkResult");

	}

	function clearResult() {
		document.getElementById("firstParam").value = null;
		document.getElementById("secondParam").value = null;
		document.getElementById("symbol").value = null;
		document.getElementById("result").value = null;

		// alert("Ai apelat functia clear");

	}

}