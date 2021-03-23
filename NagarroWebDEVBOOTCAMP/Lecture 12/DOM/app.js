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

for(let para of paragraphs){
    para.style.color="#ffb703"
}