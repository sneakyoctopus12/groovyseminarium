package se.britech.groovySeminarie.groovy
new File("C:/text.txt").eachLine{
	println it
}
// filen st�ngs automatiskt n�r eachLine avslutas
// (Execute Around Method pattern)
