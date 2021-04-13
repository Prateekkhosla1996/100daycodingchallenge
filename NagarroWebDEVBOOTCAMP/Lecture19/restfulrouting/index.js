const express = require('express')

const app = express();
app.use(express.json())
app.use(express.urlencoded({extended:true}))
app.set('view engine','ejs');
const comments=[{
    id:0,
    username:"Prateek",
    body:"this is a comment"
},{
    id:1,
    username:"john",
    body:"this is a another comment"
},{
    id:2,
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
    const found = comments.find(c=>c.id===parseInt(id));
    // console.log(req.body)
    res.render('show',{comment:found});
})
app.put('/comments/edit/:id',(req,res)=>{
    const{id} = req.params;
    const found = comments.find(c=>c.id===parseInt(id));
    
})
app.listen(3000,()=>{
    console.log(`app is served at 3000`);
})