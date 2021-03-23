const heading = document.getElementsByTagName('h1')[0];
const para = document.getElementById('para');
const inner = document.getElementById('inner');
const body = document.getElementsByTagName('body')[0];
const paragraphs = document.querySelectorAll('.paragraphs')
body.style.backgroundColor="azure"
heading.style.color = "red";
heading.style.fontWeight="500"
heading.style.textTransform="uppercase"
heading.style.border="3px solid blue"
heading.style.textAlign="center"

para.style.textAlign="justify";
para.style.padding="0.4rem";
para.style.fontSize="24px";

inner.innerText="this is innerText para"
inner.innerHTML=
`<b>bold from inner html</b>
<p> 
Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda incidunt aspernatur quo eaque aliquid quasi reprehenderit totam quidem recusandae eveniet voluptatem eius voluptates, mollitia necessitatibus at provident dolores. Exercitationem delectus inventore quam hic numquam ex aperiam, debitis reprehenderit culpa dicta quia optio facere animi tenetur! Nihil, dolor harum maiores corporis sit laborum ex quisquam ut fugiat voluptatibus cum dignissimos totam dolorem expedita odit saepe. Perferendis sint eaque dolorum eligendi ex, corporis error voluptate inventore pariatur? Commodi iure fugiat necessitatibus dolores blanditiis voluptatibus itaque iste.</P
<strong>end of paragraph</strong>
`
paragraphs[0].style.fontSize="22px"
for(let para of paragraphs){
    para.style.color="#ffb703"
}
const imp = document.querySelector('input')
imp.setAttribute('type','color')
imp.getAttribute('name')


const img = document.querySelector('img');

let isTrue =false;
setInterval(()=>{
    if(isTrue){
        img.setAttribute('src','https://images.unsplash.com/photo-1616277434249-1ea8218b973d?ixid=MXwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwyfHx8ZW58MHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=60')
    }
    else{
        img.setAttribute('src','https://images.unsplash.com/photo-1616521940317-9fb8fff3e75e?ixid=MXwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=60')
    }
    
    isTrue=!isTrue
},1500)
