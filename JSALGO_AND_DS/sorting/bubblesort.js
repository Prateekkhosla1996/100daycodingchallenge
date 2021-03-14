let arr =[10,4,2,6,8,15,22,75,33];

function bubblesort(arr){
    for(let i = 0;i<arr.length;i++){
        for(let j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
function display(arr){
    for(let i=0;i<arr.length;i++){
        console.log(arr[i])
    }
}
display(arr);
console.log('---------------------------------------------------------------------')
bubblesort(arr);
display(arr);