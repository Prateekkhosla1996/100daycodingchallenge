
// function sum(){
//     console.log(10+20);
// }
// function table(n){
//     for(let i=1;i<=10;i++){
//         console.log(`${n} x ${i}= ${n*i}`)
//     }
// }
// table(17)
// sum();

function a(){
    
    function b(){
        
        function c(){
            console.log("inside c");
        }
        console.log('inside b')
        c()
    }
    console.log('inside a')
    b()
}
a();
