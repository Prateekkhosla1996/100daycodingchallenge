function fact(n){
    if(n==1){
        return 1;
    }
    return fact(n-1)*n;
}
console.log(fact(5))


function power(x,n){
    if(n==0){
        return 1;
    }
    if(n==1){
        return x;
    }
    let smallans = power(x,n/2);
    if(n%2==0){
      return smallans*smallans;
    }else{
        return smallans*smallans *x;
    }
}
console.log(power(2,4))

function sum (arr,start){
    if(start==arr.length){
        return 0;
    }
    return arr[start]+sum(arr,start+1);
}
let arr = [1,2,3,4,5]
console.log(sum(arr,0))


function multiply(n,m){
    if(n==0||m==0){
        return 0;
    }
    return n+multiply(n,m-1);
}
console.log(multiply(2,5))


function sumofdigitsrecursive(n){
    if(n==0) return 0;
    return Math.floor((n%10 + sumofdigitsrecursive(n/10)));
}

console.log(sumofdigitsrecursive(12))
