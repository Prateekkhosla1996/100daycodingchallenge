const path = require('path');
const fs = require('fs');
const { readFile } = require('fs/promises');

let F1 = path.join(__dirname,'inp1.txt');

// fs.readFile(F1,(err,data)=>{
//     if(err){
//         console.error(err)
//     }
//     console.log(data)
// })