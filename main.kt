fun main() {
    val ipV4 = "192.145.233.333"
    println(isValidIPv4(ipV4))
}

fun isValidIPv4(address: String): Boolean {
    if (address.startsWith(".") || address.any { it !in '0'..'9' && it != '.' }) return false
    val segments = address.split(".")
    val dotCount = address.count { it == '.' }
    if (dotCount !=3) return false
    for (segment in segments) {
        val num = segment.toInt()
        if (num !in 0..255) return false
        if (segment.startsWith("0") && segment.length > 1) return false
    }
    return true
}
