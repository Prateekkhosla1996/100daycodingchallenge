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

let menu=["kadhai paneer","Dal makhni","Chicken changezi","Dum aloo","Veg biryani",
"butter chicken","onion rings", "garlic noodles","garlic nan","egg roll","rajma chawal"
,"chicken roll"
];
function isVeg(food){
    if(food.toLowerCase().indexOf('chicken')!==-1||food.toLowerCase().indexOf('egg')!==-1){
        return false;
    }
    return true;
}
let veg = menu.filter(isVeg)
console.log(veg)

function isJain(food){
    if(food.toLowerCase().indexOf('chicken')!==-1||food.toLowerCase().indexOf('egg')!==-1||food.toLowerCase().indexOf('onion')!==-1||food.toLowerCase().indexOf('garlic')!==-1){
        return false;
    }
    return true;
}
let jain = menu.filter(isJain)
console.log(jain)
