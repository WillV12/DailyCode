let input = document.getElementById("input");
let output = document.getElementById("output");
let form = document.getElementById("inputForm")

form.addEventListener('submit', (event) =>{
    
    event.preventDefault()

    let userInput = input.value 
    let isPrime
    if (userInput == 1){
        window.alert("The number is not prime")
    }
    else{
        for (let i = 1; i <= userInput; i++){
        
            if ((userInput % i == 0) && (i != userInput && i != 1)){
                isPrime = false
                break
            }
        }

        if (isPrime == false){
            window.alert("The number is not prime")
        }
        else{
            window.alert("The number is prime")
        }
    }
});


