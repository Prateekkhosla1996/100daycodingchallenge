class Queue{
    constructor(){
        this.items=[];
    }
    enQueue(item){
        this.items.push(item);
    }
    deQueue(){
        if(this.items.length==0){
            return "Queue is underflow"
        }
        return this.items.shift();
    }
    isEmpty(){
        return this.items.length==0;
    }
    front(){
        if(this.isEmpty()){
            return "Queue is empty"
        }
        return this.items[0];
    }
    display(){
        let str = ""
        for(let i=0;i<this.items.length;i++){
            str+= this.items[i]+" ";
        }
        return str;
    }
}

let q = new Queue();
q.enQueue(10);
q.enQueue(20);
q.enQueue(30);
q.enQueue(40);
q.enQueue(50);
console.log(q.display());
console.log(q.front());
console.log(q.deQueue());
console.log(q.display());
console.log(q.isEmpty());