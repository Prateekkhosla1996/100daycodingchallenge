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