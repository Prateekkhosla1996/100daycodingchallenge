

let x = new Promise(function(resolve,reject){
    let count=0;
    if(count==0){
    resolve();
    }else{
        reject()
    }
})
x.then(function(){
    console.log("count is zero")
})
.catch(function(){
    console.error("count is not zero")
})