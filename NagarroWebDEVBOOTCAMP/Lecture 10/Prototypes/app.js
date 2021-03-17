const person={
    name:"prateek",
    age:"24",
    bio:function(){
        console.log("hello")

    }
}
let p1 = Object.create(person)
let p2 = Object.create(p1)


let a =1.1;



function outer(){
    let a =10;
    console.log("outer");
    function inner(){
        a++
        console.log(a+" inner");
    }
    inner();
}
outer()





/**
 *
p2. __proto__: age: "24"bio: ƒ ()name: "prateek"__proto__: Object
p2.__proto__.__proto__
{name: "prateek", age: "24", bio: ƒ}
p2.__proto__.__proto__.__proto__
{constructor: ƒ, __defineGetter__: ƒ, __defineSetter__: ƒ, hasOwnProperty: ƒ, __lookupGetter__: ƒ, …}
p2.__proto__.__proto__.__proto__.__proto__
null
person.__proto__
{constructor: ƒ, __defineGetter__: ƒ, __defineSetter__: ƒ, hasOwnProperty: ƒ, __lookupGetter__: ƒ, …}
person.__proto__.__proto__
null

Object.prototype
{constructor: ƒ, __defineGetter__: ƒ, __defineSetter__: ƒ, hasOwnProperty: ƒ, __lookupGetter__: ƒ, …}
Object.prototype.__proto__
null
String.prototype.__proto__==Object.prototype
true
String.prototype
String {"", constructor: ƒ, anchor: ƒ, big: ƒ, blink: ƒ, …}
String.prototype.__proto__
{constructor: ƒ, __defineGetter__: ƒ, __defineSetter__: ƒ, hasOwnProperty: ƒ, __lookupGetter__: ƒ, …}
String.prototype.__proto__.__proto__
null
Number.prototype.__proto__==Object.prototype
true
 */