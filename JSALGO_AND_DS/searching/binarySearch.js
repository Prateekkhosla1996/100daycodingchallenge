let arr = [10,20,30,40,50,60,70,80,90,100];

function binarySearch(arr,element){
    let si=0;
    let li=arr.length - 1;
    
    while(si<=li){
        let mid =Math.floor((si+li)/2);
        if(arr[mid]===element){
            console.log('element found at '+ mid )
            return true;
        }
        if(arr[mid]<element){
            si=mid+1;
        }
        else{
            li=mid-1;
        }
    }
    return false;
}
console.log(binarySearch(arr,20))