const express = require('express')
const{v4:uuid} = require('uuid');

const methodOverride = require('method-override')
const app = express();
app.use(express.json())
app.use(express.urlencoded({extended:true}))
app.set('view engine','ejs');
const comments=[{
    id:uuid(),
    username:"Prateek",
    body:"this is a comment"
},{
    id:uuid(),
    username:"john",
    body:"this is a another comment"
},{
    id:uuid(),
    username:"doe",
    body:"this is a odd comment"
}]

app.get('/comments',(req,res)=>{

    res.render('index.ejs',{comments})
})
app.get('/comments/new',(req,res)=>{
    res.render('new.ejs')
})
app.post('/comments',(req,res)=>{
    const{body,username} = req.body
    const id = comments.length;
    comments.push({username,body,id});
    console.log(comments)
    res.redirect('/comments')
})
app.get('/comments/:id',(req,res)=>{
    const{id} = req.params;
    const found = comments.find(c=>c.id===id);
    // console.log(req.body)
    res.render('show',{comment:found});
})
app.patch('/comments/edit/:id',(req,res)=>{
    const{id} = req.params;
    const found = comments.find(c=>c.id===id);
    
})
app.delete('/comments/:id',(req,res)=>{
    const {id} = req.params;

    const temp = comments.filter(c=>c.id!==id);
    comments = temp;
    res.redirect('/comments');

})
app.listen(3000,()=>{
    console.log(`app is served at 3000`);
})