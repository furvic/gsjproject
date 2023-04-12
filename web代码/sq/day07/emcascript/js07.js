var f1 = function(){
    console.log("Buru ")
}
f1()

var f2 = function(a,b){
    console.log(a*b)
}

f2(2353,47)

var f3 = function(){
    var d = new Date()
    console.log(d.getFullYear()+"-"+d.getMonth()+"-"+d.getDate())
}

f3()

var f4 = function(a,b){
    return a + b
}

console.log(f4(24,45))

//----------------------------------------------------------------

//es
var f5 = () =>console.log("bur")

f5()

var f6 = (a,b) =>console.log(a*b)
f6(36,25)

var f7 = () =>{
    var d = new Date()
    console.log(d.getFullYear()+"-"+d.getMonth()+"-"+d.getDate())
}
f7()


var f8 = (a,b) => a+b

console.log(f8(2,346))



