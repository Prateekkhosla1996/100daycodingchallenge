// objects are data structures

let obj = {
    name:'Prateek',
    age:24,
    isAdult:true
}
console.log(obj)
console.log(obj.name)
console.log(obj.age)
console.log(obj.isAdult)
console.log(obj["name"])
/**
{name: "Prateek", age: 24, isAdult: true}
app.js:9 Prateek
app.js:10 24
app.js:11 true
app.js:12 Prateek

 */
for(let i=1;i<=10;i++){
    console.log(i);
}
let j= 1;
while(j<=10){
    console.log(j);
    j++;
}
let array = [1,2,3,4,5,6,7,8,9,10];

for(let i=1;i<=10;i++){
    if(i===5){
        break;
    }
    console.log(i);
}

for(let i=1;i<=10;i++){
    if(i===5){
        //five will be skipped
        continue;
    }
    console.log("cont"+i);
}
array.forEach(element => {
    console.log("arrylement",element);
});

for(let i = 1; i<=10;i++){
    for(let j=11;j<=20;j++){
        if(i===5){
            break;
        }
        console.log(i,j);
    }
}
for(let i of array){
    console.log("for Of",i);
}

for(let i in obj){
    // for in loop is used for objects
    console.log(`${i} -> ${obj[i]}`);
}