

class Car{
    constructor(name,price){
        this.name=name;
        this.price = price
    }
    getName = function(){
        return this.name;
    }
    // getter and setter
    // not need to execute
   get getprice(){
       return this.price;
   }
   set setPrice(newprice){
       this.price=newprice
   }

}
// inheritance
class RacingCar extends Car{
    constructor(name,price,maxSpeed,color){
        super(name,price);
        this.maxSpeed=maxSpeed;
        this.color=color
    }
    get maximumspeed(){
        return this.maxSpeed
    }
}
let c1 = new Car("audi",2.5)
let c2 = new Car("bmw",4.5)
let r1 = new RacingCar("ferrari",1000000,300,"black")