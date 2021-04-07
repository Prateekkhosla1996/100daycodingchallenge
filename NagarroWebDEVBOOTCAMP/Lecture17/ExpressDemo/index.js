const express = require('express');
const col = require('colors')
const app = express();


app.get('/',(req,res)=>{
    res.send(`<h1 style="color:lime;">Hello from Node Express</h1>`)
})
app.listen(8000,(err)=>{
    if(err) console.log(err);
    console.log(`server is listened at port : 8000`.rainbow)
})