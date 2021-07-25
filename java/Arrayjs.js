/**
 * 
 */


const points =[40,100,10,6,21,11];
document.getElementById("demo").innerHTML=myArrayMin(points);

function  myArrayMin(arr){
	return Math.min.apply(null, arr);
	
}




const fruits=["banana","apple","orange","mango"];
document.getElementById("demo1").innerHTML=fruits;

fruits.shift();

document.getElementById("demo2").innerHTML=fruits;







const cars=["saaab","volvoo","bmw"];
document.getElementById("demo3").innerHTML=cars;



const cars1=["saab","volvo","BMW"];

document.getElementById("demo4").innerHTML=cars1[0];







const numbers=[45,4,9,16,25];


let txt="";

numbers.forEach(myFunction);
document.getElementById("demo5").innerHTML=txt;

function myFunction(value,index,array){
txt+=value+"<br>";


	
	
let x="100";
let y="50";
let z=x*y;

document.getElementById("demo6").innerHTML=z;
}