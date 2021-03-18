let arr =[10,4,2,6,8,15,22,75,100,33,110,200];

function findSecondMax(arr){
   let fmax = -Infinity;
   let smax = -Infinity;
    for(i of arr){
       if(i>fmax){
           smax=fmax;
           fmax=i;
       }
       else if(i>smax){
           smax=i;
       }
   }
   return smax
}
console.log(findSecondMax(arr))

// recursion