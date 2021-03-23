const countPrint = document.getElementById('countPrint');
let count = 0;
function myCounter (){
count++;
countPrint.innerText=count
console.log(count);
}

function myCounterdec (){
    count--;
    countPrint.innerText=count
    console.log(count);
    }