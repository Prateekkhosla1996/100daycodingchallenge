let arr =[10,4,2,6,8,15,22,75,33];

function max(arr){
    let max=null;
    for(let i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
console.log(max(arr))