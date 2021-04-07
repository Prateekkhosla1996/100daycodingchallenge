const joke = require('give-me-a-joke');

joke.getRandomCNJoke((j)=>{
    console.log(j)
})
joke.getRandomDadJoke((j)=>{
    console.log(j)
})
// joke.getRandomJokeOfTheDay((j)=>{
//     console.log(j)
// })
let p1 = "Prateek"
let p2 = "john Doe"
joke.getCustomJoke(p1,p2,(j)=>{
    console.log(j)
})