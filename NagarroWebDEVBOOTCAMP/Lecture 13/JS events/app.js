// const btn = document.getElementById('btn');
// const Span = document.querySelector('span');
// let count = 0;
// btn.addEventListener('click',()=>{
//     count++;
//     Span.innerText=count;
// })
const buttons = document.querySelectorAll('button');
const inp = document.getElementById('screen');
for(let btn of buttons){
   btn.addEventListener('click',(e)=>{
      
       let btnText = e.target.innerText;
       if(btnText=='X'){
           inp.value +="*";
       }else if(btnText=='AC'){
        inp.value ="";
       }else if(btnText=='+'){
        inp.value +="+";
       }else if(btnText=='-'){
        inp.value +="-";
       }
       else if(btnText=='/'){
        inp.value +="/";
       }
       else if(btnText=='='){
         try{
            inp.value = eval(inp.value)
         }catch(err){
            inp.value = 'Invalid Input'
      
         }

       }
       else{
           inp.value+=btnText;
       }
   })
}