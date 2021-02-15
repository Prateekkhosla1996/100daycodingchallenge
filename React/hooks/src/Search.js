import React,{useState,useEffect} from 'react';
import axios from 'axios';
const Search=()=>{
    const[term,setTerm]=useState('');
    const[result,setResult]=useState([]);
    useEffect(()=>{
        const search =async ()=>{
           const{data} = await axios.get('https://en.wikipedia.org//w/api.php',{
                params:{
                    action:'query',
                    list:'search',
                    origin:'*',
                    format:'json',
                    srsearch:term,
                }
            })
            setResult(data.query.search);
            // console.log(result)
        };
        if(term&&!result.length){
            search();
        }else{
            const timeOutId = setTimeout(()=>{
                if(term){
                    search();
                }
            },500);
            return ()=>{
                clearTimeout(timeOutId);
            }
        }

    },[term]);
    const renderResults =result.map((r)=>{
        return(
            <div className="item" key={r.pageid}>
                <div className="content">
                    <div className="right floated content">
                        <a
                        href={`https://en.wikipedia.org?curid=${r.pageid}`} className="ui button"
                        >Go</a>
                    </div>
                    <div className="header">
                        {r.title}
                    </div>
                    <span dangerouslySetInnerHTML={{ __html: r.snippet }}></span>
                    
                </div>
            </div>
        )
    })
    return (
        <div className="ui container">
            <div className="ui form">
                <div className="field">
                    <label htmlFor="">Search Term</label>
                        <input 
                        className='input'
                        type="text"
                        onChange={e=>setTerm(e.target.value)}
                        />
                </div>
            </div>
            <div className="ui celled list">
                {renderResults}
            </div>
        </div>
        )

}
export default Search;