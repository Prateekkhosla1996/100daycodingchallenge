function fun(name){
    
    this.name="Prateek"
    console.log(this)
}
fun()

function Person(name,age){
    
    this.name=name;
    this.age=age;
    
}
 Person.prototype.sayHello=function(){
    console.log(`hello from ${this.name}`)
}

let p1 = new Person("Prateek","24")
let p2 = new Person("khosla","24")
/**
 * this binding
 * implicit: refer to self object
 * explicit: 
 * default: refers to window
 */

// Explicit binding
const a ={
    l:10,
    m:20,
    k:true
}
function fun(name){
    console.log(this)
    console.log(name)
}
// fun.call(a,"Prateek")

let f = fun.bind(a);
f("Prateek")

function fib(n){
    if(n==1||n==0){
        return n;
    }
    return fib(n-1)+fib(n-2);
}
console.log(fib(10))



