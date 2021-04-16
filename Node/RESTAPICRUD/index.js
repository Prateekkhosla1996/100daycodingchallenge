const express = require('express');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({
    extended:true
}))
app.use(bodyParser.json());
mongoose.connect('mongodb://localhost/restApi');

var db = mongoose.connection;
app.get('/',(req,res)=>{
    res.json({
        status:"Api is working",
        message:"welcome to rest api"
    })


})
if(!db){
    console.log("error in db connection");
}else{
    console.log("db is connected")
} 

app.listen(3000,(err)=>{
    if(err){console.log(err);return;}
    console.log(`app is served`);
})