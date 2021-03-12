
let arr=new Array();
arr.push(10);
arr.push(20);
arr.push(30);
arr.push(40);
arr.push(50);
arr.push(60);
console.log(arr);
console.log(arr.slice())
console.log(arr.slice(2))
console.log(arr.slice(1,3))
console.log(arr.slice(-3))
// splice
console.log(arr.splice(1,4))
console.log(arr);
console.log(arr.splice(1,4,"red","blue","green","yellow"))
console.log(arr.splice(2,1))

console.log(arr);
// split
let url ='http://abc.com/song.mp3'
console.log(url.split('/').pop());
let str= "this is our string";
console.log(str.split(' '));
console.log(str.split(' ').join(', '));
/**
 * 
index.js:7 
(4) [10, 20, 30, 50]
index.js:8 
(4) [10, 20, 30, 50]
index.js:9 
(2) [30, 50]
index.js:10 
(2) [20, 30]
(3) [20, 30, 50]
index.js:15(4) [20, 30, 40, 50]
index.js:16 (2) [10, 60]
[60]
index.js:18 ["blue"]
index.js:20 (4) [10, "red", "green", "yellow"]
song.mp3
index.js:25 (4) ["this", "is", "our", "string"]
index.js:26 this, is, our, string

*/