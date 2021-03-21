class Stack{
    constructor(){
        this.items=[];
    }
    push(item){
        this.items.push(item);
    }
    pop(){
        if(this.items.length==0){
            return "stack is empty || underflow ";
        }
        return this.items.pop();
    }
    display(){
        let str="";
        for(let i=0;i<this.items.length;i++){
            str+= this.items[i]+" ";
        }
        return str;
    }
    isEmpty(){
        return this.items.length==0;
    }
    peek(){
        return this.items[this.items.length-1];
    }
}

let st = new Stack();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
console.log(st.display());
console.log(st.pop());
console.log(st.pop());
console.log(st.isEmpty());
console.log(st.display());
console.log(st.peek());