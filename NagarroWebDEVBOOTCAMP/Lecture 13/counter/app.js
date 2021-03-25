 const incbtn = document.getElementById('incbtn');
const sp = document.querySelector('span');
const decbtn = document.getElementById('decbtn');
let count = 0;
incbtn.onclick=function(){
    count++;
    sp.innerText=count;
}

decbtn.onclick=()=>{
    count--;
    sp.innerText=count;
}