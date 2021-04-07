const express = require('express');
const col = require('colors')
const app = express();
const path = require('path')

app.get('/',(req,res)=>{
    res.send(`<h1>welcome to node Express</h1>`)
})
app.get('/a',(req,res)=>{
    res.sendFile(path.join(__dirname+'/index.html'));
})
app.get('/r/:app',(req,res)=>{
    const {app} = req.params;
    res.send(`<h3>this is ${app}</h3>`)
})


app.listen(8000,(err)=>{
    if(err) console.log(err);
    console.log(`server is listened at port : 8000`.rainbow)
})