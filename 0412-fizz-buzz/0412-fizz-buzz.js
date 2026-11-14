/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    let str = [];
    for(let i=1; i<=n; i++){
        if(i%3==0 && i%5==0){
            str.push("FizzBuzz");
        }else if(i%3==0){
            str.push("Fizz")
        }else if(i%5==0){
            str.push("Buzz");
        }else{
            str.push(String(i));
        }
    }
    return str;
    
};