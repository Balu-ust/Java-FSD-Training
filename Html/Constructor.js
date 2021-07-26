/**
 * 
 */
document.getElementById("demo").innerHTML= "john".constructor +"<br>"+
(3.14).constructor +"<br>"+
false.constructor+"<br>"+
[1,2,3,4].constructor+"<br>"+
{name:'john',age:34}.constructor +"<br>"+
new date().constructor +"<br>"+ 
function(){}.constructor;



function Person(first,last,age,eye){
	this.firstName= first;
	this.lastName= last;
	this.age=age;
	this.eyeColor=eye;
}


//create a person object

const myFather = new Person("john","doe",50,"brown");

//display age

document.getElementById("demo").innerHTML="My father name is "+ myFather.firstName + ".";