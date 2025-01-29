// assigns constants from html

const form = document.getElementById("form");
const userNum =  document.getElementById("userNum")
const output = document.getElementById("output")

// function creates element and puts the current step as its text content
function thing(value){
    let text = document.createElement("p")
    output.appendChild(text)
    text.textContent = value
}
// final write to page
function write(){
    document.write("TAKEOFF!!!!")
}


form.addEventListener("submit", (event) =>{
    event.preventDefault();

    // iterates through countdown
    let input = userNum.value;
    for (let i = 0; i < input; i++){
        thing(input- i)
    }
    setTimeout(write, 1000*input) // waits for length of countdown before it overides the page
})

