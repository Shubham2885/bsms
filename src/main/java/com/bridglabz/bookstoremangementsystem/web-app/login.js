
let arrayOfUsers = [
    {
        "username" : "Shubham@1",
        "password" : "shU@1"
    },{
        "username" : "Manoj@1",
        "password" : "maN@1"
    },{
        "username" : "Sankalp@1",
        "password" : "saN@1"
    }
]

newFun = () =>{
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // arrayOfUsers.filter(element=>{
    //     if(validateUserName(username) && validatePassword(password)){
    //         if(username === element.username && password === element.password){
    //         alert('Login Success');
    //         location.assign('FirstHTML.html');
    //         }else{
    //             alert('Login fail');
    //         }
    //     }else{
    //         alert('Invalid Username and password');
    //     }
    // });

        if(validateUserName(username) && validatePassword(password)){
            if(getUserDetails(username,password)){
            alert('Login Success');
            location.assign('FirstHTML.html');
            }else{
                alert('Login fail');
            }
        }else{
            alert('Invalid Username and password');
        }
}

validateUserName = (username) => {
    let pattern = /^[A-Za-z]+@[0-9]+$/
    if(pattern.test(username)){
        return true;
    }else{
        return false;
    }
}

validatePassword = (password) => {
    let pattern = /^[a-zA-Z]+@[0-9]+$/
    if(pattern.test(password)){
        return true;
    }else{
        return false;
    }
}

getUserDetails =(username,password) =>{
    console.log(username);
    console.log(password)
    for (let index = 0; index < arrayOfUsers.length; index++) {
        const element = arrayOfUsers[index];
        if(element.username === username && element.password === password){
            return true;
        }
    }
}