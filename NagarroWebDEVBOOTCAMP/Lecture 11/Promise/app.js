
console.log("start")
let x = new Promise(function(resolve,reject){
    setTimeout(function(){
    let randomNum = Math.random()
    console.log(randomNum)
    if(randomNum<0.5){
        resolve()
    }    
    else{
        reject()
    }
    },2000)

})
x.then(function(){
    console.log("Resolve")
})
.catch(function(){
    console.error("Rejected")
})
console.log("end")
/**
 * states in promise
 * 1) pending
 * 2) fullfilled
 * 3) rejected
 */

function fun(){
    return  new Promise(function(resolve,reject){
        setTimeout(function(){
        let randomNum = Math.random()
        if(randomNum>0.2&&randomNum<0.6){
            throw new Error("somthing went wrong")
        }
        console.log(randomNum)
        if(randomNum<0.5){
            resolve()
        }    
        else{
            reject()
        }
        },2000)
    
    })
}
fun().then(function(){
    console.log("promise fun resolved")
})
.catch(function(e){
    console.log("promise fun reject"+e)
})