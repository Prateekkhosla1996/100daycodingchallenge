const express = require('express');
const app = express();
const{v4:uuid} = require('uuid');
const methodOverride = require('method-override');
app.use(express.json())
app.use(express.urlencoded({extended:true}))
app.use(methodOverride('_method'));
app.set('view engine','ejs');

let blogs=[
    {
        id:uuid(),
        title:'welcome to node js',
        image:'https://images.unsplash.com/photo-1604145559206-e3bce0040e2d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bm9kZWpzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60',
        author:'Prateek khosla',
        body:`Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam illo consequuntur cum molestiae quod corrupti quibusdam fugiat rerum deserunt repellat, quia ex. Ratione, esse optio expedita harum a voluptatibus placeat?
        Culpa eius perferendis cupiditate molestias accusantium accusamus recusandae deserunt, ad aperiam dolorum quae, minima adipisci ratione unde! Odit, hic corporis. Neque esse nesciunt veritatis deserunt? Culpa ullam a tempore earum.`
    },
    {
        id:uuid(),
        title:'welcome to react js',
        image:'https://images.unsplash.com/photo-1561883088-039e53143d73?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cmVhY3QlMjBqc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60',
        author:'Prateek khosla',
        body:`Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam illo consequuntur cum molestiae quod corrupti quibusdam fugiat rerum deserunt repellat, quia ex. Ratione, esse optio expedita harum a voluptatibus placeat?
        Culpa eius perferendis cupiditate molestias accusantium accusamus recusandae deserunt, ad aperiam dolorum quae, minima adipisci ratione unde! Odit, hic corporis. Neque esse nesciunt veritatis deserunt? Culpa ullam a tempore earum.`
    },
    {
        id:uuid(),
        title:'welcome to bootstrap',
        image:'https://images.unsplash.com/photo-1517180102446-f3ece451e9d8?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Ym9vdHN0cmFwfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60',
        author:'Prateek khosla',
        body:`Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam illo consequuntur cum molestiae quod corrupti quibusdam fugiat rerum deserunt repellat, quia ex. Ratione, esse optio expedita harum a voluptatibus placeat?
        Culpa eius perferendis cupiditate molestias accusantium accusamus recusandae deserunt, ad aperiam dolorum quae, minima adipisci ratione unde! Odit, hic corporis. Neque esse nesciunt veritatis deserunt? Culpa ullam a tempore earum.`
    }
]

app.get('/',(req,res)=>{
    res.render('index.ejs',{blogs:blogs})
})

app.get('/blogs/new',(req,res)=>{
    res.render('new.ejs');
})

app.post('/blogs',(req,res)=>{
    const {title,body,image} = req.body;
   
    blogs.push({title,body,image,id:uuid()});
    console.log(blogs);
    res.redirect('/');
})

// getting blogs using id
app.get('/blogs/:id',(req,res)=>{
    const{id} = req.params;
    const found = blogs.find(b=>b.id===id);
    res.render('show',{blog:found});
})
// editing post
app.get('/blogs/:id/edit',(req,res)=>{
    const{id} = req.params;
    const found = blogs.find(b=>b.id===id);

    res.render('edit',{blog:found});
})
app.patch('/blogs/:id',(req,res)=>{
    const {id} = req.params;
    const foundBlog = blogs.find(b=>b.id===id);
    const updatedBody = req.body.body;
    const updatedtitle = req.body.title;
    const updatedAuthor = req.body.author;
    foundBlog.body = updatedBody;
    foundBlog.title = updatedtitle;
    foundBlog.author= updatedAuthor;
    res.redirect('/');
})
// delete post
app.delete('/blogs/:id', (req, res) => {
        const { id } = req.params;
    const temp = blogs.filter(c => c.id !== id);
    blogs = temp;
    res.redirect('/');
})

app.listen(8080,(err)=>{
    if(err){console.error(err);return;}
    console.log(`app is served at port 8080`);
})