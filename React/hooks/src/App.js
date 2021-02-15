import React,{useState} from 'react';
import ReactDOM from 'react-dom';
import Accordion from './Accordion';
import Search from './Search';
import Dropdown from './Dropdown';
import Translate from './Translate';
import Route from './Route';
import Header from './Header';
const items=[
    {
        id:1,
        title:'what is react?',
        content:'React is a front end javascript framework'
    },
    {
        id:2,
        title:'why use React?',
        content:'react is a favourite js liabrary among engineers'
    },
    {
        id:3,
        title:'how do you use React?',
        content:'by creating react components'
    }
]
const options=[
    {
        label:'the Color red',
        value:'red'
    },
    {
        label:'the Color Green',
        value:'green'
    },    
    {
        label:'the Color Yellow',
        value:'yellow'
    },
    {
        label:'the Color Blue',
        value:'blue'
    }
]
const showAccordion = ()=>{
    if(window.location.pathname==='/'){
        return<Accordion items = {items}/>
    }
}
const showList=()=>{
    if(window.location.pathname==='/list'){
        return <Search/>
    }
}
const showDropdown = () => {
    if(window.location.pathname==='/dropdown'){
        return <Dropdown/>
    }
}
const showTranslate = () => {
    if(window.location.pathname==='/translate'){
        return <Translate/>
    }
}
const App = ()=>{
    
    const[selected,setSelected]=useState(options[0]);
    return(
        <div className="ui container">
            <Header/>
             <Route path="/">
                 <Accordion items={items}/>
             </Route>
             <Route path="/list">
                 <Search/>
             </Route>
             <Route path='/dropdown'>
                 <Dropdown
                 label="Select a Color"
                 options={options}
                 selected={selected}
                 onSelectedChange={setSelected}
                 />
             </Route>
             <Route path="/translate">
                <Translate/>
             </Route>
        </div>
    )
}
export default App;