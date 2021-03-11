// alert("welcome");
// premitive
// numbers
// boolean
//string
//undefined
// null

var count = 0;
// const pi = 3.14;
while(count<=100){
    console.log(count);
    count++;
}
const pi=3.14;

var isTrue = true;
var bool = false;
console.log(typeof(bool));
console.log(typeof(pi));
console.log(typeof(count));
let str = "prateek";
console.log(typeof(str));
let name="";
console.log(typeof(name));
console.log(typeof(null));
console.log(typeof(undefined));
console.log(`this is prateek's book`)
console.log('this is prateek\'s book')
console.log("this is \"prateek\'s\" book")

console.log(str.length)
console.log(str[0]);
console.log(str.charAt(3));
console.log(str.substr(1))
console.log(str.concat(1,4,66))
console.log(str.length)
console.log(['a',...str])
console.log([1,...str])
console.log(str.toUpperCase())
console.log(str.toLocaleLowerCase())
console.log(str.toLocaleUpperCase())
let n = "Hi There My Name is Prateek"

console.log(n.split(" ").join(' ').toLocaleUpperCase())