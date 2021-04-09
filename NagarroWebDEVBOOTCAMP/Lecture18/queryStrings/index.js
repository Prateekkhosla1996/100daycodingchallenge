const express = require('express');

const app = express();


app.get('/',(req,res)=>{
    res.send('this is query params lecture')
})

app.get('/search',(req,res)=>{
    
    res.send('this is search ')
})
app.get('/greet',(req,res)=>{
    const {username} = req.query;
    res.send(`hello from ${username}`)
})
app.listen(3000,()=>{
    console.log('server is started at 3000')
})
