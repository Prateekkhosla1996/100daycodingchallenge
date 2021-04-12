const express = require('express')

const app = express();
app.use(express.json())
app.use(express.urlencoded({extended:true}))
app.set('view engine','ejs');

app.listen(3000,()=>{
    console.log(`app is served at 3000`);
})