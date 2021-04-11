const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const port = 8080;
let books = [];
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json())


// books post route
app.post('/books',(req,res)=>{
    const book = req.body;
    books.push(book);
    res.send('entery is published');
})

// get books route
app.get('/books',(req,res)=>{
    res.json(books);
})








app.listen(port,(err)=>{
    if(err){
        console.log(err);
        return;
    }
    console.log(`app is served at port: ${port}`)
})