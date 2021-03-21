let myHashMap =new Map();

console.log(myHashMap)

// set the key value pair in Map
console.log(myHashMap.set(1,"Prateek"))
console.log(myHashMap.set(2,"john"))
console.log(myHashMap.set(4,"tommy"))
console.log(myHashMap.set(3,"carl"))

// get value for the key
console.log(myHashMap.get(4))
// check if Map contain a specific key
console.log(myHashMap.has(1))
console.log(myHashMap.has(5))
// delete
console.log(myHashMap.delete(2,"john"))
console.log(myHashMap.delete(1))
// clear
console.log(myHashMap.clear())
console.log(myHashMap)
