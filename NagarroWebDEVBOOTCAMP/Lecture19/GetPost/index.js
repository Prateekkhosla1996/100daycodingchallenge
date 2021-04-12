const express = require('express')

const app = express();

app.use(express.urlencoded({extended:true}))
app.set('view engine','ejs');
app.get('/user',(req,res)=>{
    res.send('hello from')
})
app.get('/',(req,res)=>{
    res.render('index.ejs')
})
app.post('/user',(req,res)=>{
    const {username}=req.body
    res.send(`post request ${username}`)
})

app.listen(3000,()=>{
    console.log(`app is served at 3000`);
})