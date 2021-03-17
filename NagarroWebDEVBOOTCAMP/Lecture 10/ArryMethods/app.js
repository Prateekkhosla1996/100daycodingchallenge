let arr =[1,2,3,4,5];
arr.map((element)=>{
    return element*element;
})
let newarr = arr.map((element)=>{
    return element*element*element;
})
console.log(newarr)

let arr3 =[1,2,3,4,5,6,7,8,9,10];
function isOdd(num){
    if(num%2!==0){
        return true;
    }
    return false;
}
let res = arr3.filter(isOdd)
console.log(res)
