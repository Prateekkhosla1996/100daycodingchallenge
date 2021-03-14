
let arr = [10,20,30,40,50,60,70,80,90,100];

function linearSearch(arr, element){
    for(let i = 0;i <= arr.length; i++){
        if(arr[i]==element){
            console.log('element found at '+ i )
            return true;
        }
        
    }
    return false;
}
console.log(linearSearch(arr,110))
