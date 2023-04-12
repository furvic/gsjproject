function printParams(a,b=29){
    console.log(a,b)
}

printParams(33)
printParams(23,null)
printParams(46,'')
printParams(357,undefined)
printParams(34,23)

function getSum(...a){
    var sum = 0
    for(var i = 0; i < a.length; i++){
        sum += a[i]
    }
    console.log(sum)
}

getSum(34,652,325)
getSum(12,25)




