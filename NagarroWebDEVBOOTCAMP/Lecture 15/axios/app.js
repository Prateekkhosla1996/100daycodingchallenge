
axios.get('https://cat-fact.herokuapp.com')
.then(data=>{
    console.log(data)
})
.catch(err=>{
    console.log(err)
})