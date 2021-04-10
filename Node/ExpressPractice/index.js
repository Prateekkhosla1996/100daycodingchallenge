const express = require('express');
const app = express();
const port = 8080;










app.listen(port,(err)=>{
    if(err){
        console.log(err);
        return;
    }
    console.log(`app is served at port: ${port}`)
})