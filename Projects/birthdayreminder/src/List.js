import React from 'react'

function List({people}) {
    return (
        <div>
            {people.map((person)=>{
                const {id,name,age,image}=person;
                return <artice key={id} className="person">
                    <img src={image} alt={name}/>
                    <div className="">
                        <h4>{name}</h4>
                        <p>{age} years</p>
                    </div>
                </artice>
            })}
        </div>
    )
}

export default List
