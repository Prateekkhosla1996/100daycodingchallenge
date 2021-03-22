
// bad way creates call back hell



function downloadFile(url,downloaded){
    console.log(`starting the download from ${url}`)
    setTimeout(()=>{
        const path = url.split('/').pop();
        
        downloaded(path)
    },3000)
}
function compressFile(path,compressed){
    console.log(`starting the file compression for ${path}`)
    setTimeout(()=>{
        const comp = path.split('.')[0]+'.zip';
        compressed(comp);
    },3000)
}
function uploadFile(compressed,uploaded){
    console.log(`starting to upload the file from ${compressed}`)
    setTimeout(()=>{
        const uploadPath = `http://localhost/${compressed}`
        uploaded(uploadPath)
    },2000)
}
downloadFile('http://facebook.com/profile.jpg',function(path){ 
    console.log('download complete as ' +path);
    compressFile(path,function(compressed){
        console.log(`file compressed as ${compressed}`)
        uploadFile(compressed,function(uploaded){
            console.log(`file uploaded sucessfully at ${uploaded}`)
        })
    })
   
})
// .......................................good way using promise.....................................



function downloadFile(url){
    console.log(`starting the download from ${url}`)
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const path = url.split('/').pop();

            resolve(path);
        },3000)
    })
    
}
function compressFile(path){
    console.log(`starting the file compression for ${path}`)
    return new Promise ((resolve,reject)=>{setTimeout(()=>{
        const comp = path.split('.')[0]+'.zip';
        resolve(comp);
    },3000)
})
}
function uploadFile(compressed){
    console.log(`starting to upload the file from ${compressed}`)
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const uploadPath = `http://localhost/${compressed}`
            resolve(uploadPath)
        },2000)
    })
}

downloadFile('http://facebook.com/prateek.jpg')
.then((path)=>{
    console.log(`file downloaded sucessfully as ${path}`)
    compressFile(path).then((comp)=>{
        console.log(`file compressed successfully as ${comp}`)
        uploadFile(comp).then((uploadPath)=>{
            console.log(`file is uploaded at ${uploadPath}`)
        })
    })  
})


