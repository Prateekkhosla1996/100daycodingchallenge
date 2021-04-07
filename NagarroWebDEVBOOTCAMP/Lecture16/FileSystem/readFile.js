const fs = require('fs');

// read
fs.readFile('abc.txt','utf-8',(err,data)=>{
    if(err)console.log(err);
    console.log(data);
})