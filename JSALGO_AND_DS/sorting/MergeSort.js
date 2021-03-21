
function mergesort(arr){
    if(arr.length<=1)return arr;
    let mid = Math.floor((arr.length)/2);
    // console.log(mid)
    let firstCall = mergesort(arr.slice(0,mid));
    let secondCall = mergesort(arr.slice(mid));
    let merged = mergeTwoSortedArray(firstCall,secondCall);
    return merged;
}


function mergeTwoSortedArray(arr1,arr2){
    let merged = [arr1.length*arr2.length];
    let i = 0;
    let j = 0;
    let k = 0;
    while(i<arr1.length&&j<arr2.length){
        if(arr1[i]<arr2[j]){
            merged[k]=arr1[i];
            i++;
            k++;
        }else{
            merged[k]=arr2[j];
            j++;
            k++;
        }
    }

    // if first array is empty but second array is filled
    if(i==arr1.length){
        while(j<arr2.length){
            merged[k]=arr2[j];
            j++;
            k++;
        }
    }
    if(j==arr2.length){
        while(i<arr1.length){
            merged[k]=arr1[i];
            i++;
            k++;
        }
    }
    return merged;
}


let arr1=[1,3,5,7,9,11];
let arr2=[2,4,6,8,10];
let arr= [1,3,5,7,9,11,2,4,6,8,10]
console.log(mergeTwoSortedArray(arr1,arr2))
console.log("......................mergesort...........................");
console.log(mergesort(arr,0,arr.length-1))