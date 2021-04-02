
// function fib(n){
//     if(n==0||n==1){
//         return n;
//     }
//     return fib(n-1)+fib(n-2);
// }

// console.log(fib(10));

// setTimeout(()=>{
//     console.log(process.argv)
// },1000)

// setTimeout(()=>{
//     console.log(process.pid)
// },2000)


// setTimeout(()=>{
//     console.log(process.cwd)
// },3000)

function fizzbuzz(n){
    for(let i=1;i<=n;i++){
        if(i%3==0&&i%5==0){
            console.log('fizzBuzz');

        }else if(i%3==0){
            console.log('fizz')
        }else if(i%5==0){
            console.log('Buzz')
        }else{
            console.log(i)
        }
    }
}

function fizzbuzz2(n){
    for(let i=1;i<=n;i++){
        if(i%3==0&&i%5==0){
            console.log('fizzBuzz');
            
        }if(i%3==0){
            console.log('fizz')
           
        }if(i%5==0){
            console.log('Buzz')
            return;
        }
            console.log(i)
    }
}
// fizzbuzz2(10)
// fizzbuzz(10)

function fizzbuzzopti(n){
    for(let i=0;i<=n;i++){
        let str ="";
        if(i%3==0){
            str+='fizz';
        }
        if(i%5==0){
            str+='buzz';
        }
        if(str==''){
            str+=i;
        }
        console.log(str)
    }
}
fizzbuzzopti(10)

function fizzbuzzEfficient(n){
    let c3 =0;
    let c5=0;
    for(let i=0;i<=n;i++){
        let str = "";
        if(c3===3){
            str+='fizz';
            c3=0;
        }
        if(c5===5){
            str+='Buzz';
            c5=0;
        }
        if(str==''){
            str+=i;
        }
        c3++;
        c5++;
    }
}
fizzbuzzEfficient(10);