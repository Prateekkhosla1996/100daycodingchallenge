
// bad way

// const { url } = require("inspector");

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
