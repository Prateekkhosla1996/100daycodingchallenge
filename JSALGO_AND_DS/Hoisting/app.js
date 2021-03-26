
// console.log(x)

// getName();
// console.log(getName)
// var x = 7; 
// let getName = function(){
//     console.log('shout out my name');
// }

console.log('started');

let count=0;
setTimeout(()=>{
    count++;
    console.log(count)
    console.log('inside of timeout');
},5000);
console.log('started');
