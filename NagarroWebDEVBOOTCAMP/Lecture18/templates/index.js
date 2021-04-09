const express = require('express');
const app = express();
const path = require('path')
app.set('view engine','ejs');
app.set('views',path.join(__dirname,'/views'));
//set static files
app.use(express.static('public'))
const todos=["go to gym", "learn web","practice ds and algo","practice for interview"]
app.get('/',(req,res)=>{
    const title='home'
    let randomNum = Math.floor(Math.random()*10)+1;
    res.render('./index.ejs',{title:title,random:randomNum})
})

app.get('/todo',(req,res)=>{
    const title='todo'
    let randomNum = Math.floor(Math.random()*10)+1;
    res.render('./todo.ejs',{title:title,todos:todos})
})

app.listen(3000,()=>{
    console.log(`app is live at port 3000`);
})