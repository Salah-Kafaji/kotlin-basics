fun main() {
    var charList = listOf("a","b","a");
    var tempStr = charList.joinToString()
    if(charList.size + tempStr.filter{ it == 'a' }.length +  tempStr.filter{ it == 'b' }.length == 6) print((tempStr.filter{ it == 'a' }.length).toDouble()*100/3) else print(-1)
}